package Lab_rob6;

public class AutoSalon implements AutoInterface {
    double length;
    double width;
    int numberOfCars;
    String name;
    String surName;

    public AutoSalon(double length, double width, int numberOfCars, String name, String surName) {
        this.length = length;
        this.width = width;
        this.numberOfCars = numberOfCars;
        this.name = name;
        this.surName = surName;
    }

    public void cars() {
        System.out.println("Кількість автомобілів у салоні: " + numberOfCars);
    }

    public double square() {
        double s = length * width;
        return s;
    }
    public String props() {
        return name + " " + surName;
    }
    public interface method{
        void service(String car);
    }
}
