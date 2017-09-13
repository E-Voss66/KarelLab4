
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void escapeRoom() {
        findFirstWall();
        while(checkSideWall()){
            turnLeft();
            move();
        }
        move();
        spin();
    }
    
    public void findFirstWall(){
        while(frontIsClear()) {
            move();
        }
        turnLeft();
    }
    
    public boolean checkSideWall() {;
        if(!frontIsClear()){
            turnLeft();
            turnRight();
        } 
        else {
            turnRight();
        }
        if(frontIsClear()){
            return false;
        }
        else {
            return true;
        }
    }
    
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void spin(){
        turnRight();
        turnRight();
        turnRight();
        turnRight();
        turnRight();
        turnRight();
        turnRight();
        turnRight();
        turnRight();
        turnRight();
        turnRight();
        turnRight();
    }
}

