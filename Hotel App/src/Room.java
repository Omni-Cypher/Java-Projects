
public class Room {
	
	static int size = 0;
	public static String fullCode[] = new String[size];
	public static int FChain [] = new int[114];
	public int bCount = 100;
	public int fCount = 0;
	public static int BChain [] = new int[114];

		
		public Room(int size) {
			fullCode = new String [size];
			for(int i=0;i<fullCode.length;i++){
			fullCode[i]="0";
			}
			for(int i=0;i<114;i++) { BChain[i]=bCount; bCount = bCount-1;}
			for(int i=0;i<114;i++) { FChain[i]=fCount; fCount = fCount+1;}
		}
		public boolean isEmpty(int room) {
			if(fullCode[room].equals("0")){
				return true;
			}else {
				return false;
			}
		}
		
		public void fillRoom(int room) {
			fullCode[room] = "1";
		}
		
		public void clearRoom(int room) {
			fullCode[room] = "0";
		}
		
		public static String toString(int x) {
			String code = fullCode[x];
			return code;
			
		}
	
		public void print() {
			for(int i =0;i<100;i++) {
				System.out.println(fullCode[i]);
			}
		}
		
		public int getBChain(int x) {
			return BChain[x];
		}
		
		public int getFChain(int x) {
			return FChain[x];
		}
	
	
}





