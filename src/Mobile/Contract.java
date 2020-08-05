package Mobile;

import java.util.Collections;
import java.util.HashSet;

public class Contract {
    private String number;
    private Tariff tariff;
    private HashSet<Option> selectedOptions;

//    public Contract(String number, Tariff tariff, Option ... selectedOptions) {
//        this.number = number;
//        this.tariff = tariff;
//        HashSet<Option> tempOption = new HashSet <Option>();
//        Collections.addAll(tempOption, selectedOptions);
//        this.selectedOptions = tempOption;
//    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Tariff getTariff() {
        return tariff;
    }

    public void setTariff(Tariff tariff) {
        this.tariff = tariff;
    }

    public HashSet<Option> getSelectedOptions() {
        return selectedOptions;
    }

    public void setSelectedOptions(HashSet<Option> selectedOptions) {
        this.selectedOptions = selectedOptions;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "number='" + number + '\'' +
                ", tariff=" + tariff +
                ", selectedOptions=" + selectedOptions +
                '}';
    }
}
