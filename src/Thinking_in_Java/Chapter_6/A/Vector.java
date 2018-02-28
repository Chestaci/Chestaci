package Thinking_in_Java.Chapter_6.A;

public class Vector {
    public Vector() {
        System.out.println("Я нахожусь в папке 'А'");
    }

    protected void print(){
        System.out.println("Я защищенный метод печати и буду печататься только " +
                "для объектов в программах находящихся со мной в одной папке " +
                "или в наследниках моего класса");
    }

}
