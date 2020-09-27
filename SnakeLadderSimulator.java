public class SnakeLadderSimulator{
	public static void main(String[] args) {
		int start = 0;
		//No play=0; Ladder=1; Snake=2
		do {
			int num = (int)Math.floor(Math.random()*10)%6 + 1;
			int check;
			check= (int) Math.floor (Math.random() * 10) % 3;
			switch (check) {
				case 0:			// no play
					start+= 0;
					break;
				case 1:			//ladder
					start+=num;
					break;
				case 2:			//snake
					start-=num;
			}
			if(start>100)
				start-=num;
			else if(start<0)
				start=0;
			else if (start == 100){
				System.out.println("Position: "+ start);
				break;
			}
			System.out.println("Position:" + start);		
		}		
		while(start!=100);	
	}
}