public class Player {
    public int playerNumber;
    public String gamePlayer;

    public String toString() {
        return gamePlayer + " ";
    }

    public Player(String gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    public Player() {
        this.gamePlayer = gamePlayer;
    }

    public void setScoreone(int playerNumber) {
        this.playerNumber = playerNumber;
    }
}