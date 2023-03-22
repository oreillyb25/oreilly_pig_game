package edu.up.cs301.pig;

import edu.up.cs301.game.GamePlayer;
import edu.up.cs301.game.LocalGame;
import edu.up.cs301.game.actionMsg.GameAction;
import edu.up.cs301.game.infoMsg.GameState;

import android.util.Log;

import java.util.Random;

// dummy comment, to see if commit and push work from srvegdahl account

/**
 * class PigLocalGame controls the play of the game
 *
 * @author Andrew M. Nuxoll, modified by Steven R. Vegdahl
 * @version February 2016
 */
public class PigLocalGame extends LocalGame {

        PigGameState pgs;
    /**
     * This ctor creates a new game state
     */
    public PigLocalGame() {
        //TODO  You will implement this constructor
        pgs = new PigGameState();
    }

    /**
     * can the player with the given id take an action right now?
     */
    @Override
    protected boolean canMove(int playerIdx) {
        //TODO  You will implement this method
        if(playerIdx == pgs.getPlayerId()){
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * This method is called when a new action arrives from a player
     *
     * @return true if the action was taken or false if the action was invalid/illegal.
     */
    @Override
    protected boolean makeMove(GameAction action) {
        //TODO  You will implement this method
        if(action instanceof PigHoldAction) {
            if (pgs.getPlayerId() == 0) {
                pgs.setPlayerZeroScore(pgs.getCurrRunTotal());
                pgs.setPlayerId(1);
            }
            else {
                pgs.setPlayerOneScore(pgs.getCurrRunTotal());
                pgs.setPlayerId(0);
            }
            pgs.setCurrRunTotal(0);
            return true;
        }
        else if(action instanceof PigRollAction) {
            Random rand = new Random();
            int dieVal;
            if(pgs.getPlayerId() == 0) {
                dieVal = rand.nextInt(6) + 1;
                if (dieVal != 1) {
                    pgs.setCurrRunTotal(pgs.getCurrRunTotal() + dieVal);
                }
                else {
                    pgs.setCurrRunTotal(0);
                    if (pgs.getPlayerId() == 0) {
                        pgs.setPlayerId(1);
                    } else {
                        pgs.setPlayerId(0);
                    }
                }
            }
            return true;
        }
        else {
            return false;
        }
    }//makeMove

    /**
     * send the updated state to a given player
     */
    @Override
    protected void sendUpdatedStateTo(GamePlayer p) {
        //TODO  You will implement this method
    }//sendUpdatedSate

    /**
     * Check if the game is over
     *
     * @return
     * 		a message that tells who has won the game, or null if the
     * 		game is not over
     */
    @Override
    protected String checkIfGameOver() {
        //TODO  You will implement this method
        String still_playing= "game still playing...";
        String win;
        if(pgs.getPlayerOneScore() >= 50){
            win = pgs.getPlayerId() + "has won, game over!";
            return win;
        }
        if(pgs.getPlayerZeroScore() >= 50){
            win = pgs.getPlayerId() + "has won, game over!";
            return win;
        }
        return still_playing;
    }

}// class PigLocalGame
