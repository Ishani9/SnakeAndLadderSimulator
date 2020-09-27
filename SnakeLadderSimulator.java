public class SnakeLadderSimulator{
    static boolean turndecider=true;
    
    public static int diceSimulator (int position,String Player){
    	   final int NO_PLAY=0;
	       final int LADDER=1;
	       final int SNAKE=2;  
	       
    	       int  num = (int)Math.floor(Math.random()*10)%6 + 1;
    	       int option=(int) Math.floor (Math.random() * 10) % 3;
                   switch(option) {
            
                      case NO_PLAY:
                      break;
            
                      case LADDER:
                      position=position + num;
                      if(position>100)
                      {
                         position=position - num;
                      }
                      diceSimulator (position,Player);
                      break;
            
                      case SNAKE:
                      position=position - num;
                      if(position<0)
                      {
                         position=0;
                      }
                      break;
                   }
                   System.out.println("Position of "+ Player +" "+ position);
                   return position;
    }


        public static void main(String[] args){
	          
	       int positionOfP1=0;
	       int positionOfP2=0;
	       while(positionOfP1<100 && positionOfP2<100) {
                   if(turndecider) {
        	          positionOfP1=diceSimulator(positionOfP1,"Player 1");
                   }
                   else
                   {
        	          positionOfP2=diceSimulator(positionOfP2,"Player 2");
                   }
	           turndecider=!turndecider;
	       }
	       if(positionOfP1==100)
	       {
	    	   System.out.println("Player 1 wins");
	       }
	       else
	       {
	    	   System.out.println("Player 2 wins");
	       }
	}	        
}