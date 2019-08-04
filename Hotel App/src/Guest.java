
public class Guest {

	private String name="";
	private int room=0;
	private int FChain = 0;
	private int BChain = 0;
	private String Address ="-1";
	
	
	
	public Guest() {
		setName("");
		setRoom(0);
	}
	public Guest(String name,int room) {
		this.name = name;
		this.room = room;
	}
	public void setRoomFullCode(int x) {

	}
	
	public void setName(String nameN){
		name = nameN;
	}
	public String getName(){
		return name;
	}
	
	
	public int getRoom(){
		return room;
	}
	
	public void setAddress(int haddress) {
		Address = Integer.toString(haddress);
	}
	
	public String getAddress() {
		return Address;
	}
	public String toString() {
		
		String returned;
		
		if(name=="")
			returned = name+"\t\t\t"+Integer.toString(room);
		else if(name.length()<16)
			returned = name+"\t\t"+Integer.toString(room);
		else
			returned = name+"\t"+Integer.toString(room);
		return returned;
	}
	
public String toString2() {
		
		String returned;
		
		if(name=="")
			returned = Integer.toString(room)+"\t"+name;
		else if(name.length()<16)
			returned = Integer.toString(room)+"\t"+name;
		else
			returned = Integer.toString(room)+"\t"+name;
		return returned;
	}


	public void setRoom(int roomR){
		room = roomR;
	}
	public int returnChains() {
		int chains = FChain;
		return chains;
	}
	public void setFChain(int x) {
		FChain = x;
	}
	
	public void setBChain(int x) {
		BChain = x;
	}
	
	public int getFChain() {
		return FChain;
	}
	
	public int getBChain() {
		return BChain;
	}
	
	public String printBChain() {
		String bchain = Integer.toString(BChain);
		return bchain;
	}
	
	public String printFChain() {
		String fchain = Integer.toString(FChain);
		return fchain;
	}
}
