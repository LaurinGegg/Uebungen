import java.util.Random;

public class Rennschnecke {

    private String name;
    protected double vMax;
    private double strecke;

    public Rennschnecke(String name, double vMax) {
        this.name = name;
        this.vMax = vMax;

    }

    public double getvMax() {
        return vMax;
    }

    public void setvMax(double vMax) {
        this.vMax = vMax;
    }

    public void krieche() {
        Random random = new Random();
        strecke += vMax * (random.nextInt(100) + 1) / 100;
    }

    public String toString() {
        return "Name: " + name + ", vMax: " + vMax + ", Strecke: " + strecke;
    }

    public static void main(String[] args) {
        Rennschnecke s1 = new Rennschnecke("Carlo", 12);
        Turboschnecke t1 = new Turboschnecke("Turbomax", 14);
        

        s1.krieche();
        t1.krieche(2);
        

        System.out.println(s1);
        System.out.println(t1);
        }
}
