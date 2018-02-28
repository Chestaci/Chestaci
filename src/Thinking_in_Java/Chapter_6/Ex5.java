package Thinking_in_Java.Chapter_6;

public class Ex5 {

    public Ex5() {
        System.out.println("Ex5()");
    }

    public String s1 = "public String";

    private String s2 = "private String";

    protected String s3 = "protected String";

    String s4 = "default String";

    public void printPublic(){
        System.out.println("public method");
    }

    private void printPrivate(){
        System.out.println("private method");
    }

    protected void printProtected(){
        System.out.println("protected method");
    }

    void printDefault(){
        System.out.println("default method");
    }
}
