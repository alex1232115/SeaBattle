import java.util.Arrays;

public class GameField {

    private String [][] gameField;

    public String[][] getGameField() {
        return gameField;
    }

    public void insertShip(int x, int y){
        gameField[x][y] = "🚢";
    }

    public GameField() {
        String [][] map = new String[10][10];
        for (int i = 0; i < map.length; i++){
            for (int j = 0; j < map[i].length; j++){
                map[i][j] = "⬜";
            }
        }
        this.gameField = map;
    }

    public void printGameField() {
        for (String [] row: gameField) {
            System.out.println(Arrays.toString(row).replace("[", "").replace("]", "").replace
                    (",", ""));
        }
    }
}
