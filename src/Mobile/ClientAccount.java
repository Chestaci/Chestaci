package Mobile;

import java.util.List;

public class ClientAccount {

//    ManageTariff manageTariff = ManageTariff.getInstance();
//
//    List <Tariff> allTariffs = manageTariff.getTariffs();

    public static void main(String[] args) {

        ManageTariff manageTariff = ManageTariff.getInstance();
        List <Tariff> allTariffs = manageTariff.getTariffs();
        for (Tariff tariff : allTariffs){
            System.out.println(tariff);
        }
      //  System.out.println(allTariffs);
    }

}
