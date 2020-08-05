package Mobile;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ManageTariff {

    private List<Tariff> tariffs;
    private HashSet<Option> tariffOptions;

    public List<Tariff> getTariffs() {
        return tariffs;
    }

    public HashSet<Option> getTariffOptions() {
        return tariffOptions;
    }

    // Для шаблона Singletone статическая переменная
    private static ManageTariff instance;

    public static void main(String[] args) {

    }
    // закрытый конструктор
    private ManageTariff() {
        loadTariffs();
        loadTariffOptions();
    }
    //Метод создает опции и помещает их в коллекцию
    private void loadTariffOptions() {
        if (tariffOptions == null){
            tariffOptions = new HashSet<>();
        } else {
            tariffOptions.clear();
        }

        Option option1 = new Option();
        option1.setName("Опция 1");
        option1.setCost(10);
        option1.setConnectionPrice(5);

        tariffOptions.add(option1);

        Option option2 = new Option();
        option1.setName("Опция 2");
        option1.setCost(20);
        option1.setConnectionPrice(5);

        tariffOptions.add(option2);

        Option option3 = new Option();
        option1.setName("Опция 3");
        option1.setCost(30);
        option1.setConnectionPrice(5);

        tariffOptions.add(option3);
    }
    //Метод создает тарифы и помещает их в коллекцию
    private void loadTariffs() {
        if (tariffs == null){
            tariffs = new ArrayList<>();
        } else {
            tariffs.clear();
        }

        Tariff tariff1 = new Tariff();
        tariff1.setName("Тариф 1");
        tariff1.setCost(100);
        tariff1.setOptions(tariffOptions);

        tariffs.add(tariff1);

        Tariff tariff2 = new Tariff();
        tariff2.setName("Тариф 2");
        tariff2.setCost(200);
        tariff2.setOptions(tariffOptions);

        tariffs.add(tariff2);

        Tariff tariff3 = new Tariff();
        tariff3.setName("Тариф 3");
        tariff3.setCost(300);
        tariff3.setOptions(tariffOptions);

        tariffs.add(tariff3);
    }

    // метод getInstance - проверяет, инициализирована ли статическая
    // переменная (в случае надобности делает это) и возвращает ее
    public static synchronized ManageTariff getInstance() {
        if (instance == null) {
            instance = new ManageTariff();
        }
        return instance;
    }



}
