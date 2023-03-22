package edu.up.cs301.pig;

import android.os.SystemClock;

import java.util.Random;

import edu.up.cs301.game.GameComputerPlayer;
import edu.up.cs301.game.actionMsg.GameAction;
import edu.up.cs301.game.infoMsg.GameInfo;
import edu.up.cs301.game.util.Tickable;

/**
 * An AI for Pig
 *
 * @author Andrew M. Nuxoll
 * @version August 2015
 */
public class PigComputerPlayer extends GameComputerPlayer {

    /**
     * ctor does nothing extra
     */
    //PigLocalGame plg = new PigLocalGame();
    PigHoldAction pha = new PigHoldAction(this);
    PigRollAction pra = new PigRollAction(this);
    //Random r = new Random();
    public PigComputerPlayer(String name) {
        super(name);
    }

    /**
     * callback method--game's state has changed
     *
     * @param info
     * 		the information (presumably containing the game's state)
     */
    @Override
    protected void receiveInfo(GameInfo info) {
        // TODO  You will implement this method
        PigGameState pgs = new PigGameState((PigGameState)info);
        if(pgs.getPlayerId() != this.playerNum){
            return;
        }
        else{
            if(Math.random() < 0.5){
                //this.sendAction(pha);
                //plg.sendAction(pha);
                super.game.sendAction(pha);
                SystemClock.sleep(2000);
            }
            else{
                //plg.sendAction(pra);
                super.game.sendAction(pra);
                SystemClock.sleep(2000);
            }
        }
    }//receiveInfo

}
