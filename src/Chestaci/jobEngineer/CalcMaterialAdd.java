package Chestaci.jobEngineer;

import java.text.DecimalFormat;

public class CalcMaterialAdd {
    private RawMaterial m1;
    private RawMaterial m2;
    private RawMaterial m3;
    private double batchWeight;
    private String name;
    private String vol;

    public CalcMaterialAdd(String name, String vol, RawMaterial m1, RawMaterial m2, RawMaterial m3, double batchWeight) {
        this.name = name;
        this.vol = vol;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.batchWeight = batchWeight;
    }

    public RawMaterial getM1() {
        return m1;
    }

    public void setM1(RawMaterial m1) {
        this.m1 = m1;
    }

    public RawMaterial getM2() {
        return m2;
    }

    public void setM2(RawMaterial m2) {
        this.m2 = m2;
    }

    public RawMaterial getM3() {
        return m3;
    }

    public void setM3(RawMaterial m3) {
        this.m3 = m3;
    }

    public double getBatchWeight() {
        return batchWeight;
    }

    public void setBatchWeight(double batchWeight) {
        this.batchWeight = batchWeight;
    }

    public RawMaterial maxDif() {
        double r1 = m1.calcDif();
        double r2 = m2.calcDif();
        double r3 = m3.calcDif();
        RawMaterial x = null;
        if ((r1 > r2) & (r1 > r3)) {
            x = m1;
        }
        if ((r2 > r1) & (r2 > r3)) {
            x = m2;
        }
        if ((r3 > r1) & (r3 > r2)) {
            x = m3;
        }
        System.out.println("Material kotoriy v ferrite v izbitke:");
        System.out.println(x.getName() + " " + "\r\n" + "Procent po TU" + " " + x.getTu() + " " + "\r\n" + "Procent po RFA" + " " + x.getRfa());
        return x;
    }

    public double calcOfASample(double percent, double requiredWeight) {
        double hitch = percent / 100 * requiredWeight;
        return hitch;
    }

    public double difference(RawMaterial obj, double requiredWeight) {
        double reqWeight = calcOfASample(obj.getTu(), batchWeight) - calcOfASample(obj.getRfa(), requiredWeight);
        return reqWeight;
    }

    public void calc(RawMaterial ob1, RawMaterial ob2, double weight){
        String f = "#0.00";
        double w1 = difference(ob1, weight);
        double w2 = difference(ob2, weight);
        String f1 = new DecimalFormat(f).format(w1);
        String f2 = new DecimalFormat(f).format(w2);
        String f3 = new DecimalFormat(f).format(weight);
        System.out.println("Naveski shihti = " + f3 + " gramm");
        System.out.println("Naveski materiala " + ob1.getName() + " " + "neobhodimo dobavit': " + f1 + " gramm");
        System.out.println("Naveski materiala " + ob2.getName() + " " + "neobhodimo dobavit': " + f2 + " gramm");
    }

    public void weightOfAdd() {
        RawMaterial x = maxDif();
        double q = calcOfASample(x.getTu(), batchWeight) * batchWeight / calcOfASample(x.getRfa(), batchWeight);
        System.out.println("Dlya doshihtovki ferrita marki" + " " + name + " " + "p." + vol + " " + " neobhodimo:");
        if (x.equals(m1)) {
            calc(m2, m3, q);
        }
        if (x.equals(m2)) {
            calc(m1, m3, q);
        }
        if (x.equals(m3)) {
            calc(m1, m2, q);
        }
    }
}