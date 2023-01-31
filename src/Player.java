public class Player {
    private int id;
    private GameField gameField;

    public Player(int id) {
        this.id = id;
        this.gameField = new GameField();
    }

    public GameField getGameField() {
        return gameField;
    }

    public void insertShip(int x, int y) {
         gameField.insertShip(x,y);
    }

    public void insertLinkor(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){
        // Сделать через Map или через обычный цикл

//        for (int i = 0; i < 4; i++){
//            insertShip();
//        }
    }
}
