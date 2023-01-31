public class Game {
    Player player1;
    Player player2;

    GameField gameField1;
    GameField gameField2;

    public Game(Player player1, Player player2, GameField gameField1, GameField gameField2) {
        this.player1 = player1;
        this.player2 = player2;
        this.gameField1 = gameField1;
        this.gameField2 = gameField2;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public GameField getGameField1() {
        return gameField1;
    }

    public GameField getGameField2() {
        return gameField2;
    }

}
