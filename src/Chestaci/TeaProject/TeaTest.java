package Chestaci.TeaProject;

import java.util.List;

public class TeaTest {
    public static void main(String[] args) {
        TeaManager tm = new TeaManager();

        Tea t1 = new Tea("Ява", "Индонезия", "Зеленый", "Листовой", "ООО Орими Трэйд", "123-456-789");
        Tea t2 = new Tea("Valkoinen", "Финляндия", "Белый", "Пакетики", "NORDQVIST", "123-456-897");
        Tea t3 = new Tea("Greenfield", "Великобритания", "Цветочный", "Пакетики", "ООО Орими", "123-456-987");

        System.out.println("ADD TEA ==============");
        Long tId1 = tm.addTea(t1);
        Long tId2 = tm.addTea(t2);
        Long tId3 = tm.addTea(t3);
        List<Tea> result1 = tm.findListOfTea();
        for(Tea t : result1){
            System.out.println(t);
        }

        System.out.println("UPDATE TEA ==============");
        Tea change = new Tea (tId1, "Lipton", "Великобритания", "Черный", "Пакетики", "Unilever", "132-564-897");
        tm.updateTea(change);
        List<Tea> result2 = tm.findListOfTea();
        for(Tea t : result2) {
            System.out.println(t);
        }

        System.out.println("DELETE TEA ==============");
        tm.deleteTea(tId1);
        List<Tea> result3 = tm.findListOfTea();
        for(Tea t : result3) {
            System.out.println(t);
        }

        System.out.println("GET TEA ==============");
        Tea tea = tm.getTea(tId2);
        System.out.println(tea);
    }
}
