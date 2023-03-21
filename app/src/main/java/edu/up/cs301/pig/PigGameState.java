package edu.up.cs301.pig;

import java.util.Random;

import edu.up.cs301.game.infoMsg.GameState;

public class PigGameState extends GameState {
    int playerId;
    int player_zero_score;
    int player_one_score;
    int curr_run_total;
    int curr_value_die;
    Random rand = new Random();

    public PigGameState(){
        //state as game begins
        playerId = 0;
        player_zero_score = 0;
        player_one_score = 0;
        curr_run_total = 0;
        curr_value_die = rand.nextInt(6)+1;
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

    }
}
