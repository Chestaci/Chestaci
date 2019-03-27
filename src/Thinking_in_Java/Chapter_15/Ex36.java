package Thinking_in_Java.Chapter_15;

import java.util.*;

public class Ex36 {
}

interface Processor<T,E extends Exception, F extends Exception> {
    void process(List<T> resultCollector) throws E, F;
}
class ProcessRunner<T,E extends Exception, F extends Exception>
        extends ArrayList<Processor<T,E,F>> {
    List<T> processAll() throws E, F {
        List<T> resultCollector = new ArrayList<T>();
        for(Processor<T,E,F> processor : this)
            processor.process(resultCollector);
        return resultCollector;
    }
}

class Failure1 extends Exception {}
class Failure2 extends Exception {}


class Processor1 implements Processor<String,Failure1,Failure2> {
    static int count = 3;
    static Random rnd = new Random(47);
    public void
    process(List<String> resultCollector) throws Failure1, Failure2 {
        if(count-- > 1)
            resultCollector.add("Hep!");
        else
            resultCollector.add("Ho!");
        if(count < 0)
            if(rnd.nextBoolean())
            throw new Failure1();
        throw new Failure2();
    }
}

class Failure3 extends Exception {}
class Failure4 extends Exception {}

class Processor2 implements Processor<Integer,Failure3,Failure4> {
    static int count = 2;
    static Random rnd = new Random(47);
    public void
    process(List<Integer> resultCollector) throws Failure3,Failure4 {
        if(count-- == 0)
            resultCollector.add(47);
        else {
            resultCollector.add(11);
        }
        if(count < 0)
            if(rnd.nextBoolean())
            throw new Failure3();
        throw new Failure4();
    }
}
class ThrowGenericException {
    public static void main(String[] args) {
        ProcessRunner<String,Failure1,Failure2> runner =
                new ProcessRunner<String,Failure1,Failure2>();
        for(int i = 0; i < 3; i++)
            runner.add(new Processor1());
        try {
            System.out.println(runner.processAll());
        } catch(Failure1 e) {
            System.out.println(e);
        } catch (Failure2 failure2) {
            failure2.printStackTrace();
        }
        ProcessRunner<Integer,Failure3,Failure4> runner2 =
                new ProcessRunner<Integer,Failure3,Failure4>();
        for(int i = 0; i < 3; i++)
            runner2.add(new Processor2());
        try {
            System.out.println(runner2.processAll());
        } catch (Failure3 failure3) {
            failure3.printStackTrace();
        } catch (Failure4 failure4) {
            failure4.printStackTrace();
        }
    }
}
