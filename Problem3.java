 
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3 extends Problem2
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void closeAllWindows() {
        moveToStart();
        while(!onBeeper()) {
            checkWall();
        }
    }
    
    public void moveToStart() {
        turnLeft();
        move();
        turnRight();
        while(frontIsClear()) {
            move();
        }
        turnRight();
    }
    
    public void placeBeeper() {
        putBeeper();
        turnRight();
    }
    
    public void moveNewPosition() {
        turnRight();
        move();
    }
    
}

