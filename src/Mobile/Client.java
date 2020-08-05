package Mobile;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;

public class Client {
    private String name;
    private String surname;
    private Date dateOfBirth;
    private long passportData;
    private String address;
    private String email;
    private HashSet <Contract> contracts;
    private String password;

//    public Client(String name, String surname, Date dateOfBirth, long passportData, String address, String email, String password, Contract... contracts) {
//        this.name = name;
//        this.surname = surname;
//        this.dateOfBirth = dateOfBirth;
//        this.passportData = passportData;
//        this.address = address;
//        this.email = email;
//        HashSet<Contract> tempContracts = new HashSet <Contract>();
//        Collections.addAll(tempContracts, contracts);
//        this.contracts = tempContracts;
//        this.password = password;
//    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public long getPassportData() {
        return passportData;
    }

    void setPassportData(long passportData) {
        this.passportData = passportData;
    }

    public String getAddress() {
        return address;
    }

    void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    void setEmail(String email) {
        this.email = email;
    }

    public HashSet<Contract> getContracts() {
        return contracts;
    }

    void setContracts(HashSet<Contract> contracts) {
        this.contracts = contracts;
    }

    void setContracts(Contract... contracts) {
        HashSet<Contract> tempContracts = new HashSet <Contract>();
        Collections.addAll(tempContracts, contracts);
        this.contracts = tempContracts;
    }

    public String getPassword() {
        return password;
    }

    void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth='" + DateFormat.getDateInstance(DateFormat.SHORT).format(dateOfBirth) + '\'' +
                ", passportData=" + passportData +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", contracts=" + contracts +
                ", password='" + password + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(1991, Calendar.AUGUST, 31);
        c.getTime();
        System.out.println(c.getTime());
  //      Client client = new Client("Vasya", "Pupkin", c.getTime(), 999999999, "www.LeningradSPb.ru", "VPup@LSpb.ru", "sd1@/f.dSD", new Contract("1212"), new Contract("2121"));
   //     System.out.println(client.toString());
    }
}
