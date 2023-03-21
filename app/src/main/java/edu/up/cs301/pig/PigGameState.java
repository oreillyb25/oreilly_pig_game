package edu.up.cs301.pig;

import edu.up.cs301.game.infoMsg.GameState;

public class PigGameState extends GameState {
    int playerId;
    int player_zero_score;
    int player_one_score;


    public int getPlayerId() {
        return playerId;
    }

    public int getPlayerZeroScore() {
        return player_zero_score;
    }

    public int getPlayerOneScore() {
        return player_one_score;
    }

}
