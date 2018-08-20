package Thinking_in_Java.Chapter_9;

import java.util.Random;

public class Ex19 {
    public static void playGames(GameFactory factory){
        Game game = factory.getGame();
        game.cast();
    }

    public static void main(String[] args) {
        playGames(new CoinFactory());
        playGames(new DiceFactory());
    }
}

interface Game{
    void cast();
}

interface GameFactory{
    Game getGame();
}

class Coin implements Game{

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
}

class Dice implements Game{

    @Override
    public void cast() {
        Random random = new Random();
        int side = (random.nextInt(6) + 1);
        switch (side){
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
}

class CoinFactory implements GameFactory{

    @Override
    public Game getGame() {
        return new Coin();
    }
}

class DiceFactory implements GameFactory{

    @Override
    public Game getGame() {
        return new Dice();
    }
}