public class SnakeLadderSimulator{
	public static void main(String[] args) {
		int start = 0;
		int num = (int)Math.floor(Math.random()*10)%6 + 1;
		int check;
		check= (int) Math.floor (Math.random() * 10) % 3;
		//No play=0; Ladder=1; Snake=2
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
		System.out.println(start);
	}
}