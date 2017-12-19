package Chestaci.TeaProject;

public class Tea {
    //индификатор чая
    private Long teaId;
    //название чая
    private String theNameOfTea;
    //страна произвотва чая
    private String country;
    //сорт чая
    private String gradeOfTea;
    //фасовка чая
    private String sort;
    //название компании, производящей чай
    private String nameOfTheTeaCompany;
    //номер телефона чайной компании
    private String telephoneNumberOfTheTeaCompany;

    public Tea() {
    }

    public Tea(String theNameOfTea, String country, String gradeOfTea, String sort, String nameOfTheTeaCompany, String telephoneNumberOfTheTeaCompany) {
        this.theNameOfTea = theNameOfTea;
        this.country = country;
        this.gradeOfTea = gradeOfTea;
        this.sort = sort;
        this.nameOfTheTeaCompany = nameOfTheTeaCompany;
        this.telephoneNumberOfTheTeaCompany = telephoneNumberOfTheTeaCompany;
    }

    public Tea(Long teaId, String theNameOfTea, String country, String gradeOfTea, String sort, String nameOfTheTeaCompany, String telephoneNumberOfTheTeaCompany) {
        this.teaId = teaId;
        this.theNameOfTea = theNameOfTea;
        this.country = country;
        this.gradeOfTea = gradeOfTea;
        this.sort = sort;
        this.nameOfTheTeaCompany = nameOfTheTeaCompany;
        this.telephoneNumberOfTheTeaCompany = telephoneNumberOfTheTeaCompany;
    }

    public Long getTeaId() {
        return teaId;
    }

    public void setTeaId(Long teaId) {
        this.teaId = teaId;
    }

    public String getTheNameOfTea() {
        return theNameOfTea;
    }

    public void setTheNameOfTea(String theNameOfTea) {
        this.theNameOfTea = theNameOfTea;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGradeOfTea() {
        return gradeOfTea;
    }

    public void setGradeOfTea(String gradeOfTea) {
        this.gradeOfTea = gradeOfTea;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getNameOfTheTeaCompany() {
        return nameOfTheTeaCompany;
    }

    public void setNameOfTheTeaCompany(String nameOfTheTeaCompany) {
        this.nameOfTheTeaCompany = nameOfTheTeaCompany;
    }

    public String getTelephoneNumberOfTheTeaCompany() {
        return telephoneNumberOfTheTeaCompany;
    }

    public void setTelephoneNumberOfTheTeaCompany(String telephoneNumberOfTheTeaCompany) {
        this.telephoneNumberOfTheTeaCompany = telephoneNumberOfTheTeaCompany;
    }

    @Override
    public String toString() {
        return "Tea{" + "teaId=" + teaId + ", theNameOfTea='" + theNameOfTea + '\'' +
                ", country='" + country + '\'' + ", gradeOfTea='" + gradeOfTea + '\'' +
                ", sort='" + sort + '\'' + ", nameOfTheTeaCompany='" + nameOfTheTeaCompany +
                '\'' + ", telephoneNumberOfTheTeaCompany='" + telephoneNumberOfTheTeaCompany + '\'' + '}';
    }
}
