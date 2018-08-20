package Thinking_in_Java.Chapter_10;

import java.util.Random;

public class Ex15 {
    public static void playGames(GameFactory factory){
        Game game = factory.getGame();
        game.cast();
    }

    public static void main(String[] args) {
        playGames(new CoinFactory().gameFactory());
        playGames(new DiceFactory().gameFactory());
    }
}

interface Game{
    void cast();
}

interface GameFactory{
    Game getGame();
}

class Coin {
    public Game game () {
        return new Game() {
            @Override
            public void cast() {
                Random random = new Random();
                int side = (random.nextInt(2) + 1);
                if (side == 1){
                    System.out.println("Орёл");
                }else {
                    System.out.println("Решка");
                }
            }
        };
    }

}

class Dice {
    public Game game() {
        return new Game() {
            @Override
            public void cast() {
                Random random = new Random();
                int side = (random.nextInt(6) + 1);
                switch (side) {
                    case 1:
                        System.out.println("1");
                        break;
                    case 2:
                        System.out.println("2");
                        break;
                    case 3:
                        System.out.println("3");
                        break;
                    case 4:
                        System.out.println("4");
                        break;
                    case 5:
                        System.out.println("5");
                        break;
                    case 6:
                        System.out.println("6");
                        break;
                }
            }

        };

    }
}

class CoinFactory {
    public GameFactory gameFactory () {
        return new GameFactory() {
            @Override
            public Game getGame() {
                return new Coin().game();
            }
        };
    }


}

class DiceFactory  {
    public GameFactory gameFactory () {
        return new GameFactory() {
            @Override
            public Game getGame() {
                return new Dice().game();
            }
        };
    }
}
