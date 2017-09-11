
import kareltherobot.*; 


/**
 * @author :  E. Voss
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void runRace() {
        while(frontIsClear()) {
            collectBeeperSteeple();
        }
    }
    
    public void findBeepers() {
        faceEast();
        while(!nextToABeeper() && frontIsClear()) {
            move();
        }
    }
    
    public void faceEast() {
        while(!facingEast()) {
            turnLeft();
        }
    }
    
    public void faceNorth() {
        while(!facingNorth()) {
            turnLeft();
        }
    }
    
    public void faceSouth() {
        while(!facingSouth()) {
            turnLeft();
        }
    }
    
    public void collectBeeperSteeple() {
        findBeepers();
        faceNorth();
        while(nextToABeeper()) {
            move();
        }
        faceSouth();
        while(frontIsClear()) {
            move();
            pickBeeper();
        }
        faceEast();
    }
   
}