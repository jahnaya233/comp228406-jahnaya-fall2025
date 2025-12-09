package guiapp.model;

import java.sql.Date;

public class PlayerGame {

    private int playerGameId;
    private int playerId;
    private int gameId;
    private Date playingDate;
    private int score;

    public int getPlayerGameId() {
        return playerGameId;
    }

    public void setPlayerGameId(int playerGameId) {
        this.playerGameId = playerGameId;

    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;

    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public Date getPlayingDate(){
        return playingDate;
    }

    public void setPlayingDate(Date playingDate) {
        this.playingDate = playingDate;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
}

