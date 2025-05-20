import java.util.Random; 
public class Elevator{

    private int periods = 10;
    final private static int passing = 4;
    final private static int periodLength = 41;
    private int waitTime = 0;
    //private boolean 1isBroken;
    //private boolean 2isBroken;
    //private boolean 3isBroken;
    //private boolean 4isBroken;
    private int[] rushHour = {1, 6, 7};
    private boolean[] listRunning = new boolean[4];

    //Random rand = new Random(); 

    public boolean[] isRunning(boolean ele1, boolean ele2, boolean ele3, boolean ele4) {
        listRunning[1] = ele1;
        listRunning[2] = ele2;
        listRunning[3] = ele3;
        listRunning[4] = ele4;
    }

    public int isBroken() {
        for(int i = 0; i < listRunning.length; i++){
            if(listRunning[i] == false) {
                waitTime += Math.random()*3 + 2;
                
            }
        }
    }


    public Elevator{
        isBroken[1] = 1Elevator;
        

    }

    //public boolean isLate{}
    //public int lateTime{}
   // public boolean isBroken{}
    //public int waitTime{}
 }