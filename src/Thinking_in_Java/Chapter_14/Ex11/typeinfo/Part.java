package Thinking_in_Java.Chapter_14.Ex11.typeinfo;

import Thinking_in_Java.Chapter_14.Ex11.typeinfo.factory.Factory;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

class Part {

    public String toString() {
        return getClass().getSimpleName();
    }

//    static List<Class<? extends Part>> partClasses =
//            Arrays.asList(FuelFilter.class, AirFilter.class,
//                    CabinAirFilter.class, OilFilter.class,
//                    FanBelt.class, PowerSteeringBelt.class,
//                    GeneratorBelt.class, NullPart.class);

    static List<Factory<? extends Part>> partFactories =
            new ArrayList<Factory<? extends Part>>();
    static {
        // Collections.addAll() gives an "unchecked generic
        // array creation ... for varargs parameter" warning.
        partFactories.add(new FuelFilter.Factory());
        partFactories.add(new AirFilter.Factory());
        partFactories.add(new CabinAirFilter.Factory());
        partFactories.add(new OilFilter.Factory());
        partFactories.add(new FanBelt.Factory());
        partFactories.add(new PowerSteeringBelt.Factory());
        partFactories.add(new GeneratorBelt.Factory());
        partFactories.add(new NullPart.Factory());
    }


  //  private static Random rand = new Random(47);

    private static Random rand = new Random();
    public static Part createRandom() {
        int n = rand.nextInt(partFactories.size());
        return partFactories.get(n).create();
    }




//    public static Part createRandom() {
//        int n = rand.nextInt(partClasses.size());
//        try {
//            return partClasses.get(n).newInstance();
//              } catch(InstantiationException e) {
//            throw new RuntimeException(e);
//        } catch(IllegalAccessException e) {
//            throw new RuntimeException(e);
//        }
//    }
}



