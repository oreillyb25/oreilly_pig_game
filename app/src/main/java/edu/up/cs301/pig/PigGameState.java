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
}
