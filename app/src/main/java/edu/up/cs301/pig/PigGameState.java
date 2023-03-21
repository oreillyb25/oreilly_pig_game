package edu.up.cs301.pig;

import java.util.Random;

import edu.up.cs301.game.infoMsg.GameState;

public class PigGameState extends GameState {
    private int playerId;
    private int player_zero_score;
    private int player_one_score;
    private int curr_run_total;
    private int curr_value_die;
    Random rand = new Random();

    public PigGameState(){
        //state as game begins
        playerId = 0;
        player_zero_score = 0;
        player_one_score = 0;
        curr_run_total = 0;
        //curr_value_die = rand.nextInt(6)+1;
    }
    //public GameState(int initId, int initPlayerZero, int initPlayerOne, int initTotal, int initCurr){

    //Copy Constructor
    public PigGameState(PigGameState original) {
        playerId = original.playerId;
        player_zero_score = original.player_zero_score;
        player_one_score = original.player_one_score;
        curr_run_total = original.curr_run_total;
        curr_value_die = original.curr_value_die;
    }


    //}


    public int getPlayerId() {
        return playerId;
    }

    public int getPlayerZeroScore() {
        return player_zero_score;
    }

    public int getPlayerOneScore() {
        return player_one_score;
    }

    public int getCurrRunTotal() {
        return curr_run_total;
    }

    public int getCurrValueDie() {
        return curr_value_die;
    }

    public void setPlayerId(int init) {
        playerId = init;
    }

    public void setPlayerZeroScore(int init) {
        player_zero_score = init;
    }

    public void setPlayerOneScore(int init) {
        player_one_score = init;
    }

    public void setCurrRunTotal(int init) {
        curr_run_total = init;
    }

    public void setCurrValueDie (int init) {
         curr_value_die = init;
    }

}
