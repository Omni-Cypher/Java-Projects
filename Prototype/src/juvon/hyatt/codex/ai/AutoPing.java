package juvon.hyatt.codex.ai;
import java.net.InetAddress;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class AutoPing {

	public static boolean running = true;
	public static String loader;
	public static String server1;
	public static String server2;
	public static String server3;
	public static String server4;
	static String statformats;
	 
    AutoPing() {
    	
    	loader = "";
    	server1 = "";
    	server2 = "";
    	server3 = "";
    	server4 = "";
    	statformats = loader + "/t" +  server1  + "/t" +  server2 + "/t" +  server3  + "/t" +  server4;
	}
    
	public void start(int minutes) throws InterruptedException {
		
		System.out.println("---------------------------------------------------Auto Ping Logs--------------------------------------------------------------------\n");
		System.out.println("Time:\t\t\tLOAD BALANCER \t\t Cvipfinap1  \t\t  Cvipfinap2  \t\t Cvipfinap3  \t\t Cvipfinap4");
		autoGun();
		timer(minutes);
		
		
	}
	
	

	private void timer(int m) throws InterruptedException {
		TimeUnit.SECONDS.sleep(m);
		running = false;
	}


	public static void autoGun() throws InterruptedException {
		String stat1,stat2,stat3,stat4,stat5 = "bad";
	while(running) {
		stat1 = "bad";
		stat2 = "bad";
		stat3 = "bad";
		stat4 = "bad";
		stat5 = "bad";
		
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm aa");
		 Date date = new Date();
			try {
				//Runtime.getRuntime().exec("cmd /c start cmd.exe /k \"dir && ping mwaprod.cablevision.com \"");
				InetAddress loadBalancer = InetAddress.getByName("mwaprod.cablevision.com");
				
				InetAddress cvipfinap1 = InetAddress.getByName("cvipfinap1.cablevision.com"); //stat2
				InetAddress cvipfinap2 = InetAddress.getByName("cvipfinap2.cablevision.com"); //stat3
				InetAddress cvipfinap3 = InetAddress.getByName("cvipfinap3.cablevision.com"); //stat4
				InetAddress cvipfinap4 = InetAddress.getByName("cvipfinap4.cablevision.com"); //stat5
				
			
				//------------------load balance reacher--------------------------//
				if(loadBalancer.isReachable(0)) { //load balancer
					stat1 = "good";
				}else {
					stat1 = "bad";
				}
				
				//------------------cvipfinap1 reacher--------------------------//
				if(cvipfinap1.isReachable(0)) { //server 1
					stat2 = "good";
				}else {
					stat2 = "bad";
				}
				//------------------cvipfinap2 reacher--------------------------//
				if(cvipfinap2.isReachable(0)) { //server 2
					stat3 = "good";
				}else {
					stat3 = "bad";
				}
				
				//------------------cvipfinap3 reacher--------------------------//
				if(cvipfinap3.isReachable(0)) { //server 3
					stat4 = "good";
				}else {
					stat4 = "bad";
				}
				
				//------------------cvipfinap4 reacher--------------------------//
				if(cvipfinap4.isReachable(0)) { //server 4
					stat5 = "good";
				}else {
					stat5 = "bad";
				}
				
		
			     }
			catch(Exception e) {
				System.out.println("Something Went Wrong :( ");
				e.printStackTrace();
		        }
			
			//-----------------------load balancer status -----------------------------------------------//
			if(stat1.equals("good")) {
				//ping is successful print time and status
				loader = dateFormat.format(date)+"\t"+"Status: Successful\t";
			}else {
				//ping failed  print time and status
				loader = dateFormat.format(date)+"\t"+"Status: Fail\t\t";
			}
			
			//----------------------- cvipfinap1 status -----------------------------------------------//
			if(stat2.equals("good")) {
				//ping is successful print time and status
				server1 = "Status: Successful\t";
			}else {
				//ping failed  print time and status
				server1 = "Status: Fail\t\t";
			}
			
			//----------------------- cvipfinap2 status -----------------------------------------------//
			if(stat3.equals("good")) {
				//ping is successful print time and status
				server2 = "Status: Successful\t";
			}else {
				//ping failed  print time and status
				server2 = "Status: Fail\t\t";
			}
			
			//----------------------- cvipfinap3 status -----------------------------------------------//
			if(stat4.equals("good")) {
				//ping is successful print time and status
				server3 = "Status: Successful\t";
			}else {
				//ping failed  print time and status
				server3 = "Status: Fail\t\t";
			}
			
			//----------------------- cvipfinap4 status -----------------------------------------------//
			if(stat5.equals("good")) {
				//ping is successful print time and status
				server4 = "Status: Successful\t";
			}else {
				//ping failed  print time and status
				server4 = "Status: Fail\t\t";
			}
	
			statformats = loader  +"|  "+  server1  +"|  "+   server2 +"|  "+  server3  +"|  "+   server4;
		System.out.println(statformats);	
			
			
			try {
	            Runtime.getRuntime().exec("taskkill /f /im cmd.exe") ;
	        } catch (Exception e) {
	            e.printStackTrace();  
	        }
			
			TimeUnit.SECONDS.sleep(30);
	    }	
	
			
	}
	
	
	
	
}
