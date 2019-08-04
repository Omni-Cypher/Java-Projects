package mapreducepackage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;


public class WordCount {
	
	public static boolean writing = false;
	public static int reducers;
	public static int l =0;
	public static int next= 1;
	private static Lock lock  = new ReentrantLock();
	
	
	public static void main(String[] args) throws IOException { 

		
	ArrayList<String> chapters = new ArrayList<String>();	
	chapters.add(mapreducepackage.chapters.ch1);
	chapters.add(mapreducepackage.chapters.ch2);
	chapters.add(mapreducepackage.chapters.ch3);
	chapters.add(mapreducepackage.chapters.ch4);
	
	WordCount.MR_RUN(chapters,4,2);

	
	
	
			
		

	}
	
	
public static void map(String chapter,int num)throws IOException{
	
	System.out.println(num);
	String[] parts = chapter.split(" ");
		BufferedWriter writer = new BufferedWriter(new FileWriter(new File("src/mapreducepackage/input/map.text"),true));
		BufferedWriter writer2 = new BufferedWriter(new FileWriter(new File("src/mapreducepackage/input/map"+num+".text"),true));
		
		BufferedWriter writer3 = new BufferedWriter(new FileWriter(new File("src/mapreducepackage/input/reduce0input.text"),true));
		BufferedWriter writer4 = new BufferedWriter(new FileWriter(new File("src/mapreducepackage/input/reduce1input.text"),true));
		
		int One = 1; 

		for(String val: parts) {
			
			writer.append(val.toLowerCase()+","+ One +"\n");
			writer2.append("Key value pair added with word: (" + val.toLowerCase()+","+ One +")\n");
			String key = val;
			if(key.hashCode()%2!=0) {
				
				writer3.append(key + "," + One + "\n");
				
				}else {
					writer4.append(key + "," + One + "\n");
		
				}
			
		}
		writer.close();
		writer2.close();
		writer3.close();
		writer4.close();
		
		
}

	

	public static void MR_RUN(ArrayList<String> chapters,int mappers, int reducers) throws IOException{

		clean();
		
		WordCount.reducers = reducers;
	
		for(int i=0;i<mappers;i++) {
			//System.out.println(chapters.get(i));
			String chp = chapters.get(i);
		int x = i;
		Thread t1 = new Thread(new Runnable(){
			@Override
			public void run() {
				lock.lock();

					try {
						map(chp,x);
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					lock.unlock();
			}	
			
			
		});
		
		t1.start();
		
		}
	
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		reducer(reducers);
			
	}
	
	
	public static void clean() {
		File file = new File("src/mapreducepackage/input/map.text"); 
		File file2 = new File("src/mapreducepackage/input/reduce0input.text"); 
		File file3 = new File("src/mapreducepackage/input/reduce1input.text"); 
        
        if(file.delete() && file2.delete() && file3.delete()) 
        { 
            System.out.println("File deleted successfully"); 
        } 
        else
        { 
            System.out.println("No such file exists"); 
        } 
	}
	
	public static int splitter(int reducers) {
		double randomDouble = Math.random();
		randomDouble = randomDouble * reducers + 0;
		int randomInt = (int) randomDouble;
		//System.out.println(randomInt);
		
		return randomInt;
	}
	
	
	public static void reducer(int reducers) throws IOException {
		
	
			BufferedReader countreader = new BufferedReader(new FileReader("src/mapreducepackage/input/map.text"));
			int lines = 0;
			while (countreader.readLine() != null) {
				lines++;
			}
			System.out.println("Lines: "+lines);
			countreader.close();
			
			BufferedReader reader = new BufferedReader(new FileReader(new File("src/mapreducepackage/input/map.text"))); //reducer0
			String line;
			int One = 1;
			
			HashMap<String, Integer> result = new HashMap<String, Integer>();
			
			
			while((line = reader.readLine())!= null) {
				String[] parts = line.split(",");
				if(result.containsKey(parts[0]))
					result.put(parts[0],result.get(parts[0]) + One);
				else
					result.put(parts[0],One);
			}
			TreeMap<String, Integer> result2 = new TreeMap<String, Integer>(result);
			Set<Entry<String, Integer>> mappings = result2.entrySet();
			while((line = reader.readLine())!= null) {
				
				String[] parts = line.split(",");
				if(result2.containsKey(parts[0]))
					for(Entry<String, Integer> mapping : mappings){ result2.put(mapping.getKey() + "," + mapping.getValue(), One); }
					//result2.put(parts[0],One);
			}
			
			
			
			
			reader.close(); //finished reading
		
			if(reducers == 2) {
			BufferedWriter writer1 = new BufferedWriter(new FileWriter(new File("src/mapreducepackage/output/reduce0_output.text")));
			BufferedWriter writer2 = new BufferedWriter(new FileWriter(new File("src/mapreducepackage/output/reduce1_output.text")));
			
			
			for(String key: result2.keySet()) { //this is the partition dividing reducers
				if(key.hashCode()%2!=0) {
				
				writer1.append("Key value pair added with word: ("+key + "," + result2.get(key) + ")\n");
				writer1.append("key Hashcode: " + key.hashCode()+"\nFrom Reducer 0\n");
				
				}else {
					writer2.append("Key value pair added with word: ("+key + "," + result2.get(key) + ")\n");
					writer2.append("key Hashcode: "+key.hashCode()+"\nFrom Reducer 1\n");
				}
			}
	
			writer1.close();
			writer2.close();
			}
			
			if(reducers == 1) {
				BufferedWriter writer = new BufferedWriter(new FileWriter(new File("src/mapreducepackage/output/reduce.text")));
				
				
				for(String key: result2.keySet()) { //this is the partition dividing reducers
					if(key.hashCode()%2!=0) {
					
					writer.append("Key value pair added with word: ("+key + "," + result2.get(key) + ")\n");
					writer.append("key Hashcode: " + key.hashCode()+"\nFrom Reducer 0\n");
					
					}else {
						writer.append("Key value pair added with word: ("+key + "," + result2.get(key) + ")\n");
						writer.append("key Hashcode: "+key.hashCode()+"\nFrom Reducer 1\n");
					}
				}
				
				writer.close();	
			}

		}
	}
