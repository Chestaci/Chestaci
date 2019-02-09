package Thinking_in_Java.Chapter_14.Project;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public interface Cards {
    void checkBalance ();
    void replenish(int sum);
    void takeoff(int sum);
    void transfer(int sum, Card c2);
    void writeFile();
    void commit();
    void rollback();
}

class Card implements Cards {
    int number;
    int balance;
    int tempBalance;
    int FINALBALANCE;
    boolean commit = true;

    public void setCard2(Card card2) {
        this.card2 = card2;
    }

    Card card2 = null;
    List<Integer> cardHistory = new ArrayList<Integer>();

    public Card(int number) {
        this.number = number;
        Integer num = new Integer(number);
        File file = new File("C:/Cards/" + num + ".txt");
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(file));
            String text = null;

            while ((text = reader.readLine()) != null) {
                cardHistory.add(Integer.parseInt(text));
            }
            this.balance = cardHistory.get(cardHistory.size() - 1);
            this.tempBalance = this.balance;
            this.FINALBALANCE = this.balance;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
            }
        }
    }

    public void writeFile() {
        if (commit == true) {
            commit = false;
            try (final FileWriter writer = new FileWriter("C:/Cards/" + number + ".txt", true)) {
                final String s = Integer.toString(balance);
                writer.write(s);
                writer.write(System.lineSeparator());
                System.out.println(s);
                commit = true;
                System.out.println("Операция завершена");
            } catch (IOException e) {
                System.out.println("Нет доступа к файлу.");
                rollback();
            }
        }
    }

    @Override
    public void checkBalance() {
        System.out.println(balance);
    }

    @Override
    public void replenish(int sum) {
        if (commit == true) {
            if (sum >= 0) {
                try {
                    commit = false;
                    tempBalance += sum;
                } catch (Exception e) {
                    System.out.println("Ошибка пополнения карты");
                    tempBalance = FINALBALANCE;
                    commit();
                }
                balance = tempBalance;
                System.out.println(balance);
                commit();
            }else {
                System.out.println("Неправильная сумма. Пожалуйста повторите попытку.");
            }
        } else {
            System.out.println("Операция невозможна. Пожалуйста попробуйте позднее.");
        }
    }

    @Override
    public void takeoff(int sum) {
        if (commit == true) {
            if ((sum >= 0) & (balance >= sum)) {
                try {
                    commit = false;
                    tempBalance -= sum;
                } catch (Exception e) {
                    System.out.println("Ошибка снятия с карты");
                    tempBalance = FINALBALANCE;
                    commit();
                }
                balance = tempBalance;
                System.out.println(balance);
                commit();
            } else {
                System.out.println("Недостаточно средств на счету.");
                }
        } else {
            System.out.println("Операция невозможна. попробуйте позднее.");
        }
    }

    @Override
    public void transfer(int sum, Card c2) {
        setCard2(c2);
        if (card2 != null) {
            if (balance >= sum) {
                int tempBalance = balance;
                takeoff(sum);
                if (balance == (tempBalance - sum)) {
                    int tempBalance2 = card2.balance;
                    card2.replenish(sum);
                    if (card2.balance == (tempBalance2 + sum)) {
                        card2.writeFile();
                        System.out.println(balance);
                        System.out.println(card2.balance);
                        System.out.println("Операция перевода денег подготовлена. Ожидается подтверждение завершения операции.");

                    } else {
                        System.out.println("Ошибка на стороне получателя.");
                        rollback();
                    }
                } else {
                    System.out.println("Ошибка в проведении операции.");
                }
            } else System.out.println("Недостаточно средств на счету.");
        }else System.out.println("Ошибка карты получателя.");
    }

    public void commit() {
        commit = true;
    }

    public void rollback() {
        System.out.println("Произошла ошибка. Необходимо повторить операцию.");
        balance = FINALBALANCE;
        commit();
    }
}