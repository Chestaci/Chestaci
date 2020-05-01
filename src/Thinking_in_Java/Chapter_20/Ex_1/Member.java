package Thinking_in_Java.Chapter_20.Ex_1;

@DBTable(name = "MEMBER")
public class Member {
    @SQLString(30) String firstName;
    @SQLString(50) String lastName;
    @SQLInteger
    Integer age;
    @SQLChar
    char letter;
    @SQLChar
    String charname;
    @SQLString(value = 30,
            constraints = @Constraints(primaryKey = true))
    String handle;
    static int memberCount;
    public String getHandle() { return handle; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String toString() { return handle; }
    public Integer getAge() { return age; }
    public char getLetter() { return letter; }
    public String getCharname() { return charname; }
}
