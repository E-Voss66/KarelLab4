
import kareltherobot.*; 


/**
 * @author :  E. Voss
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void plantBeepers() {
        while(!onBeeper()) {
            checkWall();
        }
    }
    
    public boolean onBeeper() {
        if(nextToABeeper()) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public void checkWall() {
        if(frontIsClear()){
            turnLeft();
            if(frontIsClear()) {
                placeBeeper();
                move();
            }
        }
        else {
            moveNewPosition();
        }
        
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void placeBeeper() {
        putBeeper();
    }
    
    public void moveNewPosition() {
        placeBeeper();
        turnRight();
        move();
    }
}

