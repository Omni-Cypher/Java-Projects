import java.util.Arrays;
//Name: Juvon Hyatt
public class NirvanaHotel {

	static String[] theArray;
	int arraySize;
	int itemsInArray = 0;
	static int probes[]= new int[114];
	static int uprobes[]= new int[114];
	int probeListNumber = 0;
	int uprobeListNumber = 0;
	static int unsucSearch =0;
	int pNumber;
    int guestCount=0;
    int uguestCount=0;
    static String [] address;
 
    static String list[] = new String[114];
	static Guest[] guestList = new Guest[114];
	static Room theRoom;
	

	public static void main(String[] args) {

		NirvanaHotel theFunc = new NirvanaHotel(114);
		
		


		String[] nameList = { "Adams, Winter","Adams, Carl","Alummootil, Tony","Bareca, Nancy","Bristol Phillip","Cardiello, Brian","Chung, Darren",
				"Concepcion, Diony", "Cui, Hui Liang","David Bunmi","Dilawari, Bunmi","Ehrilinger, Fredrick","famodimu, Gideon",
				"Glynn, Debra","Inoa, Jose","Lam, Shirley","Lau, Ka Kin", "Matos, Fanny","Meyer, Richard","Nunez, Gregory",
				"Richardson, Enerolisa","Rodriquez, Dennis","Saleem, Amir","Salzman, Brian","Siddiqui, Moudud","Smith, Mellinda","Tessema, Yikum","Woldmichael, Yodit",
				"Akron, Jennifer","Arriaza, Esperanza","Chin, Li-Ching","Chong, Kevin","Delva, Edson","Hughes, John", "Amraham, Mathews",
				"Alvarez, Marjorie","Bennettson, Christine","Cameau, Hans","Corbett, Dennis","Chitchlow, Amenia","Diaz, Brendaly","Escante, Martin",
				"Fleury, Melinda","Ford, Thomas","Josefsberg, Richard","Kelly, James","Langebek, Michele","Myrthil, Jean","Masser, Muhammed","Nguyen, Linh",
				"Niefeld, Tracy","Padilla, Karl","Scneider, Ross","Jackson, Ltanya","John, Susan"," Kutschera, Thomas","Lada, Anna","Makkar, Vibhor",
				"Rodriguez, Jessica","Sewell, Andrew","Thorne, Peter","Shah, Syed","Small ,Tracy", "Steiner, Jared","Tierney, Jeremy","Tsai, James",
				"Wallace, Lorna","Williams, William","Yair, Yeud","Atique, Kazi","Burke, Grace-Ann","Farook, Mohammed","Feng, Feng Nian","Hong, Robert",
				"James, Christopher","Lopez, Emmanuel","Mathew, Jiji","Naseer, Muhammed","Resmini, James","Rommel, Gerald","Abraham, Mathews","Barger, Christopher",
				"Farrell, Daniel","Hubbard, Kwame","Mathew, Jiji","Nguyen, Linh","Fester, Keom","Weedy, Mark David","Fields, Janet","Mayall, John","Haley, Roger",
				"Mix, Gary","Goodman, Eric","Fisher, Eddie","Farmer, Jim","Minor, Sharon","Iacono, Lynn","Bernstein, Leonard","Mehta, Zubin"
				};
		theRoom = new Room(114);
		System.out.println(" ");

		
		for(int i=0;i<nameList.length;i++) { //inserts all names on list into the table
			theFunc.checkIn(nameList[i],1);
			};
			
		System.out.println(" ");	
		updateRooms();
		System.out.println(" ");
		//-------------------Required Requests -----------------------------//
		System.out.println("---------------------------Hash Table(Print 1)--------------------------");
		printHashTable();
		printGuestList();
		System.out.println(" ");
		theFunc.checkIn("Poster, Kevin",92);
		theFunc.checkOut("Poster, Kevin");
		theFunc.checkOut("Weedy, Mark David");
		theFunc.checkOut("Feilds, Janet");
		theFunc.checkIn("Gupta, Naresh",92);
		theFunc.checkIn("Johnson, Carl",-100);
		theFunc.checkIn("Grubbs, Frank",55);
		theFunc.checkOut("Gupta, Naresh");
		theFunc.checkOut("Mayall, John");
		theFunc.locate("Haley, Roger");
		theFunc.locate("Mix, Gary");
		theFunc.locate("Jam, Jim");
		theFunc.checkIn("Goodman, Eric",20);
		theFunc.checkOut("Fields, Janet");
		theFunc.locate("Goodman, Eric");
		theFunc.checkIn("Smith, Mary",11);
		theFunc.checkIn("Smith, Martha",44);
		theFunc.checkOut("Johnson, Carol");
		theFunc.checkOut("Fisher, Eddie");
		theFunc.checkOut("Farmer, Jim");
		System.out.println(" ");
		
		System.out.println("---------------------------Hash Table(Print 2)--------------------------");
		//displayEmptyRooms(theArray);

		updateRooms();
		System.out.println("");
		printHashTable();
		printGuestList();
		System.out.println(" ");
		printProbes();
		

	}

	

	
	private void checkIn(String name, int room) {
		
		System.out.println("Requesting to check in "+name+" into room "+room);
		Guest newGuest = new Guest();

	   if(room>=0) {
		   
			int l =1;
			int hashAddress = hashFunction(name);
			for(int i=0;i<address.length;i++) {
				while(l==1) {
				if(address[hashAddress].equals("-1")){
				newGuest.setAddress(hashAddress);
				System.out.println("Address = " + hashAddress+ " for value "
						+ name +"");
				address[hashAddress]="1";
					l=0;
				}else if(!address[hashAddress].equals("-1")) {
					int newroom = hashAddress+1;
					//System.out.println("collision at hash address "+hashAddress+" trying room "+ newroom);
		         hashAddress = hashAddress+1;
		         if(hashAddress==111) {
		        	 hashAddress = 1;
		         }
				}
				}
				
			}
			
		
			
		   int loop =1;
		  
		   while(loop==1) {
			   if(theRoom.isEmpty(room)) {
				   newGuest.setName(name);
				   newGuest.setRoom(room);
				   theRoom.fillRoom(room);
				   newGuest.setFChain(theRoom.getFChain(room-1));
				   newGuest.setBChain(theRoom.getBChain(room));
				   System.out.println(name+" has been checked into room "+room+"\n\n");
				   guestList[guestCount]= newGuest;
				   guestCount = guestCount+1;
				   
				   
				   loop = 0;
			   }else {
				   room = room+1;
				   //System.out.println(" room is being occupied trying room "+room);
				   if(room>100) {
					   room =1;
				   }
			   }
		   }
		   
		   
	}else {
		System.out.print("Check in failed, requested room number cannot be negative\n\n");
	}
		
		
	}

	
	public void checkOut(String key) {
		System.out.println("Requesting to checkout "+key+"...");
		for(int i=0;i<100;i++) {
			//System.out.println(i);
		if(guestList[i].getName().equals(key)) {
			String name = guestList[i].getName();
			guestList[i].setName("");
			guestList[i].setBChain(guestList[i].getBChain()-1);
			guestList[i].setFChain(guestList[i].getFChain()+1);
			theRoom.clearRoom(guestList[i].getRoom());
			System.out.println(name+" has been checked out of room "+guestList[i].getRoom()+"\n");
			guestCount = guestCount-1;
			return; 
		}
		}
		System.out.println(key+" has not been found in the system\n");
	}
	
	
	


	public static int hashFunction(String nameToHash) {
		
		  String name = nameToHash;
	   

			int nameIndex = (nameToAscii(name))%111+1;

			return nameIndex;

			  
		  }
	
	public static void updateRooms() {
		for(int i =0;i<114;i++) {
			if(guestList[i]!=null) {
			if(!guestList[i].getName().equals("")) {
				theRoom.fillRoom(i);
			}else {
				theRoom.clearRoom(i);
			}
			}
		}
	}
	

	public void locate(String key) {
	pNumber = 0;
		System.out.println("Trying to locate "+key+"...\n");
		int x = 0;
		for( x=0; x < 100;x++) {
			if(guestList[x].getName().equals(key) && !guestList[x].getName().equals("")) {
				int room = guestList[x].getRoom();
				System.out.println(key+" was found in room "+room);
				pNumber++;
				probes[probeListNumber]= pNumber;
				break;
			}else if(!guestList[x].getName().equals(key) && !guestList[x].getName().equals("")) {
				uguestCount = uguestCount+1;
				pNumber++;
			}
		}//end of search
		if(x==111) {
			uprobes[uprobeListNumber] = pNumber;
			probes[probeListNumber] = pNumber;
			unsucSearch++;
		}

		probeListNumber++;
		uprobeListNumber++;// counts searches
		
	}
	
	NirvanaHotel(int size) {

		arraySize = size;

		theArray = new String[size];
		Arrays.fill(theArray, "-1");
		address = new String[111];
		Arrays.fill(address, "-1");
		

	}
	
    public static int nameToAscii(String name) {
    	
		String [] nameList = {name};
		int total=0;
		for(int x=0; x < nameList.length;x++) {
			  
			String s = nameList[x];
			for(int i=0; i < s.length();i++) {
			total = total+(int)s.charAt(i);
		}
	}
		//System.out.println(name+" Ascii value is: "+total);
		return total;
    }
    
    public static void printProbes() {
    	int n =1;
    	int suc =0; //successful searches
    	System.out.println("-----------Probes------------------------------");
    	for(int i=0;i<probes.length;i++) {
    		if(probes[i]>0 && probes[i]!=100) {
    			suc++;
    		}
    	}
    	System.out.println("Successful searches: "+ suc +
    			", Unsuccessful searches : "+ unsucSearch+"\n");
    	System.out.println("Successful search probes:");
 
    	for(int i =0; i<probes.length;i++) {
    		if(probes[i]>0) {
    			if(probes[i]!=100) {
    		 System.out.println("probes for search "+n+": "+probes[i]);
    		 n = n+1;
    			}else {
    		 System.out.println("probes for search "+n+": "+probes[i]+" (unsuccessful)");
    	     n = n+1;		
    			}
    		}
    	}
    }
    
   
    
    public static void printGuestList() {
    	
    	System.out.println("\n---------------- List Table -------------------\n");
    	System.out.println("|Room|       Name          |");
    	for(int x=0;x<111;x++) {
    		if(guestList[x]!=null) {
     System.out.println(guestList[x].toString2());
    		}
    	}
    	System.out.println("");
    }
    
    public static void printHashTable() { //Prints out the full hash table ordered by address.
    	int addressCount =0;
    System.out.println("Address |      Name      | room number |FChain | BChain | Full Code |");
    for(int i=0;i<111;i++) {
    	for(int x=0;x<111;x++) {
    		String toFind = Integer.toString(i);
    		if(guestList[x]!=null) {
    		if(guestList[x].getAddress().equals(toFind)) {
    			System.out.println(guestList[x].getAddress()+"\t"+guestList[x]+"\t  "+guestList[x].printFChain()+"\t  "+guestList[x].printBChain()+"\t       "+theRoom.toString(x));
    			addressCount = addressCount+1;
    		}
    		}else {
    			
    		}
    	}
    }
    }
}

    


