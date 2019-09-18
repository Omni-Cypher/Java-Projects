package juvon.hyatt.codex.ai;
import java.awt.Robot; 
import java.awt.event.KeyEvent; 
import java.io.*; 
import java.util.Scanner;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;

//Computer. Operated. Digital Enviornment Executer. C.O.D.E.X
public class Codex {
	
	public static boolean running = true;
	static Scanner sc = new Scanner(System.in);
	static AutoPing ping = new AutoPing();
	static Conscience con = new Conscience();
	
public static void main(String [] args) {
	
	String text = "Welcome to Codex Prototype. created by Juvon Hyatt";
	int i;
	for(i = 0; i < text.length(); i++){
	    System.out.printf("%c", text.charAt(i));
	    try{
	        Thread.sleep(0);//0.5s pause between characters
	    }catch(InterruptedException ex){
	        Thread.currentThread().interrupt();
	    }
	}
	
	System.out.println("\nComand 1: complete.");
	while(running) {
		p("1) Search Web");
		p("2) Launch Program");
		p("3) Start Process");
		p("4) Serial Data");
		p("5) ping");
		p("6) Conscience AI");
		p("7) Exit");
		
		int c = sc.nextInt();
		switch(c) {
		case 1: search(); 
		break;
		case 2: launch(); 
		break;
		case 3: choseProcess();
		break;
		case 4: serialList();  
		break;
		case 5: ping();  
		break;
		case 6: con.start(); 
		break;
		case 7: running = false;  
		break;
		default: System.out.println("thats not a choice"); 
		break;
		}
		
	}
}
private static void ping() {
	try {
		ping.start(5);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
//-----------------------------------serial list---------------------------------------//
private static void serialList() {
	String ans = "";

		
	System.out.println("Read or Write?");
	sc.nextLine();
	ans = sc.nextLine();
	
	if(ans.equals("r") || ans.equals("read")) {
	 try {
         File file = new File("src/juvon/hyatt/codex/ai/serials.txt"); // read from file
         Scanner scanner = new Scanner(file);
         System.out.println();
         while (scanner.hasNextLine()) {
           System.out.println(scanner.nextLine());
         }
         scanner.close();
       } catch (FileNotFoundException e) {
         e.printStackTrace();
       }
	 System.out.println();
	}else if(ans.equals("w") || ans.equals("write")) { //write to file
		try {
			  File file = new File ("src/juvon/hyatt/codex/ai/serials.txt");
			  System.out.println("Enter Data");
		
				String text = sc.nextLine();
				
			  BufferedWriter out = new BufferedWriter(new FileWriter(file,true)); 
			  out. append(text +"\n");
			  out.close();
			  System.out.println("File written.");
		} catch (IOException e) {
			 e.toString();
		}
	}else if(ans.equals("f") || ans.equals("fix")) {
		System.out.println("Copy complete line you want to replace and enter it:");
		String oldContent = sc.nextLine();
		System.out.println("Now enter its replacement:");
		String newContent = sc.nextLine();
		
		 modifyFile("src/juvon/hyatt/codex/ai/serials.txt", oldContent, newContent);
	}
	 

	
}

private static void choseProcess() {
	System.out.println("Process list:\n1) Serial Attribute Update\n2) Oracle Mobile Process");
	int ch = sc.nextInt();
	
	if(ch == 1) {
		String path = "\"M:/DEPT/CONTROL/Serial Attribute Update Automation\"";
		System.out.println("Launching required S>A>U programs\n" );
		try {
			Runtime.getRuntime().exec("explorer.exe /select," + path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	else if(ch == 2) {
		int choice = 0;
		
		System.out.println("1) Tech Return");
		System.out.println("2) Tech Assignment");
		System.out.println("3) Serial Inquiry");
		System.out.println("4) Packing LPN DC");
		System.out.println("5) Packing LPN Depot");
		
		choice = sc.nextInt();
		
		if(choice ==1) {
			System.out.println(" Steps: ");
			System.out.println(" 1: Warehousing ");
			System.out.println(" 2: Tec- Returns");
			System.out.println(" 3: Type in Org code ( ex. SDP ) ");
			System.out.println(" 4: Cursor will be on lpn, hit enter. \nTo Sub: enter your depot. \nTo Loc: Hit flashlight and select sub \nFrom Tech: hit flashlight and make selection\r\n" + 
					"	Count  field – running total of scanned items\r\n" + 
					"	SN field – show scanned number ( bottom of screen shows processed)\r\n" + 
					"	Reason: auto populated field\r\n" + 
					"	Hit TRANSFER\r\n" + 
					"");
			System.out.println(" 5: This is the next screen that will be displayed\r\n" + 
					"	On this screen you can select\r\n" + 
					"	Select TRANSFER\r\n" + 
					"	You can hit CANCEL \r\n"  
					);
		}
		if(choice ==2) {
			System.out.println(" Steps: Tech Assignment");
			System.out.println(" 1: Select Warehousing");
			System.out.println(" 2: Select Inventory");
			System.out.println(" 3: Select Transfers");
			System.out.println(" 4: Select CV TechLocker Replenishment");
			System.out.println(" 5: To Org – STC ( or your org you are part of) TXN – self populating \r\n" + 
					"	From Sub: Good  \r\n" + 
					"	From LOC: Good.1.1.TY1\r\n" + 
					"	Locker – enter your org + tech number \r\n" + 
					"	SN – item being scanned in ( bottom = processed) \r\n" + 
					"	Count – number of CPE being scanned\r\n" + 
					"	Remaining fields not used\r\n" + 
					"	Select “next item” or “ next locker”\r\n" 
					);
		}
		if(choice ==3) {
			System.out.println(" Steps: Serial Inquiry ");
			System.out.println(" 1: Select Inquiry");
			System.out.println(" 2: Select Serial Inquiry");
			System.out.println(" 3: Enter or scan the serial number you want to inquire about\r\n" + 
					"	Hit “enter” to display\r\n" + 
					"");
			System.out.println(" 4: Data is displayed as seen on this screen\r\n" + 
					"	Hit done when finished\r\n" + 
					"");
		}
		if(choice ==4) {
			System.out.println(" Steps: Packing LPN DC ");
			System.out.println(" 1: Select Warehousing");
			System.out.println(" 2: Select LPN Transaction");
			System.out.println(" 3: Select Pack");
			System.out.println(" 4: Hit CTRL G, LPN field – write down LPN #\r\n" + 
					"");
			System.out.println(" 5: Complete the following fields:\r\n" + 
					"	Sub: GOOD\r\n" + 
					"	Loc: GOOD.1.1.G\r\n" + 
					"	Item: box item number\r\n" + 
					"	UOM: auto populates\r\n" + 
					"	Avail QTY: # of devices available\r\n" + 
					"	QTY: how many have been scanned \r\n" + 
					"	SN: scan serial number\r\n" + 
					"	Remaining: how many devices remain\r\n" + 
					"");
			System.out.println(" 6: Once done, click PACK\r\n" + 
					"");
			System.out.println(" 7:  see Txn Success on bottom\r\n" + 
					"");
		}
		if(choice == 5) {
			System.out.println(" Steps: Packing LPN Depot ");
			System.out.println(" 1: Select Warehousing \r\n" + 
					"");
			System.out.println(" 2: Select LPN Transaction\r\n" + 
					"");
			System.out.println(" 3: Select Pack\r\n" + 
					"");
			System.out.println(" 4: Hit CTRL G, LPN field – write down LPN #\r\n" + 
					"");
			System.out.println(" 5: Complete the following fields:\r\n" + 
					"	Sub: hit CTRL L and select your location\r\n" + 
					"	Loc: hit CTRL L & select where its going\r\n" + 
					"	Item: box item number\r\n" + 
					"	UOM: auto populates\r\n" + 
					"	Avail QTY: # of devices available\r\n" + 
					"	QTY: how many have been scanned \r\n" + 
					"	SN: scan serial number\r\n" + 
					"	Remaining: how many devices remain\r\n" + 
					"");
			System.out.println(" 6: Once done, click PACK\r\n" + 
					"");
			System.out.println(" 7: You will see Txn Success on bottom\r\n" + 
					"");
		}
		else if(choice == 5) {
			System.out.println(" Steps: Transfer Device Out ");
			System.out.println(" 1: Warehouse");
			System.out.println(" 2: Inventory");
			System.out.println(" 3: Change Org");
			System.out.println(" 4: Put in the ORG that you are CHANGING TO ( if you are in different ORG)\r\n" + 
					"	Hit CTRL L to Continue");
			System.out.println(" 5: Warehouse");
		}

		
		
		
	}
	
	else{
	
		System.out.println("Process unavaliable/doesnt exist...\nReturning to main menu");
	}
	
}
static void modifyFile(String filePath, String oldString, String newString)
{
    File fileToBeModified = new File(filePath);
     
    String oldContent = "";
     
    BufferedReader reader = null;
     
    FileWriter writer = null;
     
    try
    {
        reader = new BufferedReader(new FileReader(fileToBeModified));
         
        //Reading all the lines of input text file into oldContent
         
        String line = reader.readLine();
         
        while (line != null) 
        {
            oldContent = oldContent + line + System.lineSeparator();
             
            line = reader.readLine();
        }
         
        //Replacing oldString with newString in the oldContent
         
        String newContent = oldContent.replaceAll(oldString, newString);
         
        //Rewriting the input text file with newContent
         
        writer = new FileWriter(fileToBeModified);
         
        writer.write(newContent);
    }
    catch (IOException e)
    {
        e.printStackTrace();
    }
    finally
    {
        try
        {
            //Closing the resources
             
            reader.close();
             
            writer.close();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}
private static void launch() {
	sc.nextLine();
	System.out.println("What would you like to Launch?");
	
	String pg1 ="";
	pg1 = sc.nextLine();
	String pg = pg1.toLowerCase();
	
	if(pg.contains("chrome") || pg.contains("google chrome")) {
		System.out.println("Opening Chrome... ");
		openChrome();
	
	}if(pg.contains("ie") || pg.contains("internet explorer") || pg.contains("explorer")  || pg.contains("internet") || pg.contains("edge")) {
		System.out.println("Opening Internet Explorer... ");
		openIE();
	}if(pg.contains("firefox")) {
		System.out.println("Opening Firefox... ");
		openFirefox();
	
	}
	if(pg.contains("access") ||pg.contains("ms access") ) {
		System.out.println("Opening Firefox... ");
		openAccess();
	
	}
	
	if(pg.contains("access") ||pg.contains("excel") ) {
		System.out.println("Opening Excel... ");
		openExcel();
	
	}
	
	if(pg.contains("mobile") ||pg.contains("oracle mobile") || pg.contains("om")) {
		System.out.println("Opening Oracle Mobile... ");
		openExcel();
	
	}else {
		System.out.println("that selection is not yet avaliable");
	}
	
	
	
}

//---------------------open program list----------//

private static void openExcel() {
	try {
		
		//Process p = Runtime.getRuntime().exec("\"/Program Files (x86)/Microsoft Office/root/Office16/EXCEL.EXE\"");
//	    p.waitFor();
//	    System.out.println("Firefox launched!");
//	    
//	    //tabbing back into code after chrome focuses itself
//	    Robot robot = new Robot(); 
//	    robot.keyPress(KeyEvent.VK_ALT);
//	    robot.keyPress(KeyEvent.VK_CONTROL);
//	    robot.keyPress(KeyEvent.VK_TAB);
//	    robot.delay(100);
//	    robot.keyRelease(KeyEvent.VK_TAB);
//	    robot.keyRelease(KeyEvent.VK_CONTROL);
//	    robot.keyRelease(KeyEvent.VK_ALT);
//	    robot.keyPress(KeyEvent.VK_ENTER);
//	    robot.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("Need to be fixed...");
	} catch (Exception e) {
	    e.printStackTrace();
	}

   clear();
	
}

private static void openAccess() {
	try {
	    Process p = Runtime.getRuntime().exec("\"/Program Files (x86)/Microsoft Office/root/Office16/MSACCESS.EXE\"");
	    p.waitFor();
	    System.out.println("Access launched!");
	    
	    //tabbing back into code after chrome focuses itself
	    Robot robot = new Robot(); 
	    robot.keyPress(KeyEvent.VK_ALT);
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_TAB);
	    robot.delay(100);
	    robot.keyRelease(KeyEvent.VK_TAB);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyRelease(KeyEvent.VK_ALT);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	} catch (Exception e) {
	    e.printStackTrace();
	}

   clear();	
}

private static void openFirefox() {
	try {
	    Process p = Runtime.getRuntime().exec("\"/Program Files (x86)/Mozilla Firefox/firefox.exe\"");
	    p.waitFor();
	    System.out.println("Firefox launched!");
	    
	    //tabbing back into code after chrome focuses itself
	    Robot robot = new Robot(); 
	    robot.keyPress(KeyEvent.VK_ALT);
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_TAB);
	    robot.delay(100);
	    robot.keyRelease(KeyEvent.VK_TAB);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyRelease(KeyEvent.VK_ALT);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	} catch (Exception e) {
	    e.printStackTrace();
	}

   clear();
	
}

private static void clear() {
	//System.out.print("\033[H\033[2J");  
	   // System.out.flush();
}

private static void openIE() {
	try {
	    Process p = Runtime.getRuntime().exec("\"/Program Files (x86)/Google/Chrome/Application/chrome.exe\"");
	    p.waitFor();
	    System.out.println("Internet Exlplorer launched!");
	    
	    //tabbing back into code after chrome focuses itself
	    Robot robot = new Robot(); 
	    robot.keyPress(KeyEvent.VK_ALT);
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_TAB);
	    robot.delay(100);
	    robot.keyRelease(KeyEvent.VK_TAB);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyRelease(KeyEvent.VK_ALT);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	} catch (Exception e) {
	    e.printStackTrace();
	}
	clear();
}

private static void openChrome() {
	try {
	    Process p = Runtime.getRuntime().exec("\"/Program Files (x86)/Google/Chrome/Application/chrome.exe\"");
	    p.waitFor();
	    System.out.println("Google Chrome launched!");
	    
	    //tabbing back into code after chrome focuses itself
	    Robot robot = new Robot(); 
	    robot.keyPress(KeyEvent.VK_ALT);
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_TAB);
	    robot.delay(100);
	    robot.keyRelease(KeyEvent.VK_TAB);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyRelease(KeyEvent.VK_ALT);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    
	    
	} catch (Exception e) {
	    e.printStackTrace();
	}	
	clear();
}
//-----------------------------------------------//


private static void search() {
	
	System.out.println("Enter search:");
	sc.nextLine();
	String search = sc.nextLine();
	search = search.replace(' ', '+');
	 try {
		   
		   URI uri= new URI("https://www.google.com/search?source=hp&ei=r0N6Xe7LGqKm_Qa0kZ_QDg&q="+ search+ "&gs_l=psy-ab.3..0l8j0i131j0.51914.52793..52914...0.0..0.71.535.9......0....1..gws-wiz.....0.LR1cPaxbVMs&ved=0ahUKEwiu367arcvkAhUiU98KHbTIB-oQ4dUDCAc&uact=5");
		   
		   java.awt.Desktop.getDesktop().browse(uri);
		    System.out.println("Web page opened in browser");
		 
		  } catch (Exception e) {
		   
		   e.printStackTrace();
		  }
		 
	
}

static void p(String string) {
	System.out.println(string);
}
}
