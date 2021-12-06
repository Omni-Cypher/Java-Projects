import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.*;
import java.util.Scanner;
import java.time.*;

public class FileScanner {
	
	public void Scan(String searchUrl) throws FileNotFoundException {
		
		searchUrl = searchUrl.replace("\\", "/");
		File dir = new File(searchUrl);
		File[] directoryListing = dir.listFiles();
		
		System.out.println("Please enter search term");
		Scanner scan = new Scanner(System.in);
		String target = scan.nextLine();
		Instant start = Instant.now(); //start timer
		int count = 0;
		int found = 0;
		
		if (directoryListing != null) {
			System.out.println("Found In:\n");
			
		    for (File fileName : directoryListing) {
		      
		    	  String url = fileName.toString();
		          count++;
		      
		    	  File newFile = new File(url);
		    	  Scanner sc = new Scanner(newFile);
		    	  
		    	  String fileContent = "";
		    	  while(sc.hasNextLine()) {
		    		  fileContent = fileContent.concat(sc.nextLine() + "\n");
		    	  }
		    	  
		    	  if(fileContent.contains(target)) {
		    		  System.out.println(fileName.getName());
		    		  found++;
		    	  }
		    }
		  } else {
			  System.out.println("This isnt a directory");
		}
		if(found == 0) {
			System.out.println("none");
		}
		System.out.println("\n" + count + " files scanned.");
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("time: " + timeElapsed + " milliseconds");
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		
		String searchUrl = "C:/Users/... (put directory here)";
		FileScanner fscan = new FileScanner();
		fscan.Scan(searchUrl);
	}

}
