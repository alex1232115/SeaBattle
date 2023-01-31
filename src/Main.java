import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Player player1 = new Player(1);
        Player player2 = new Player(2);


//        player1.getGameField().insertShip();
        input(player1.getGameField());
        player1.getGameField().printGameField();

    }

    public static void input(GameField gameField) throws Exception {

        System.out.println("Начнём расставлять корабли на поле Player1. Другой игрок, не смотри!\n"
                + "Введи координаты четырехпалубного корабля (формат: x,y;x,y;x,y;x,y)");
        List<Integer> coordinates = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.next().split(";");

        for (String i : array) {
            String[] couple = i.split(",");

            Integer first = Integer.valueOf(couple[0]);
            Integer second = Integer.valueOf(couple[1]);

            coordinates.add(first);
            coordinates.add(second);
        }

        //Проверка на правильность расстановки

        //Проверка 1 и 2 условия
        for (int i = 0; i < coordinates.size(); i++) {
            if (coordinates.get(i) < 0 || coordinates.get(i) > 9 || coordinates.get(i) < 0 || coordinates.get(i) > 9) {
                throw new Exception("Введены данные, не попадающие в нужный диапазон (от 0 до 9)");
            } else if (coordinates.size() != 8) {
                throw new Exception("Неверное количество координат");
            }
        }

        //Проверка 3 условия
        for (int i = 0; i < coordinates.size() - 2; i = i + 2) {
            if (coordinates.get(i) - coordinates.get(i + 2) > 1 || coordinates.get(i) - coordinates.get(i + 2) < -1) {
                throw new Exception("Координаты должны находиться рядом друг с другом");
            }
        }

        //Проверка 3 условия
        for (int i = 1; i < coordinates.size() - 2; i = i + 2) {
            if (coordinates.get(i) - coordinates.get(i + 2) > 1 || coordinates.get(i) - coordinates.get(i + 2) < -1) {
                throw new Exception("Координаты должны находиться рядом друг с другом");
            }
        }

        //Проверка 3 условия
        for (int i = 0; i < coordinates.size() - 4; i++) {
            if ((coordinates.get(i) + coordinates.get(i + 1)) - (coordinates.get(i + 2) + coordinates.get(i + 3)) != 1) {
                throw new Exception("Вводимые координаты некорректны");
            }
        }

        //Проверка 4 условия
        for (int i = 0; i < coordinates.size() - 1; i++) {
            if (!gameField.getGameField()[i][i + 1].equals("⬜")) {
                throw new Exception("Ячейка с введённым значением занята");
            }
        }

        //Проверка 5 условия !!!!!!!!!!!!!!!!!! ДОДЕЛАТЬ И ПРОВЕРИТЬ ПРАВИЛЬНОСТЬ ВСЕГО ЭТОГО ↕
        for (int i = 0; i < coordinates.size() - 1; i++) {
            if (!gameField.getGameField()[i][i + 1].equals("🌊")) {
                throw new Exception("Ячейка с введённым значением занята");
            }
        }

        System.out.println(coordinates);
    }
}
