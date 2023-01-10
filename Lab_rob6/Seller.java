package Lab_rob6;

public class Seller extends AutoSalon{


    public Seller(String name, String surName,double length, double width, int numberOfCars) {
        super(length, width, numberOfCars, name,surName);

    }

    public String props(){
        return name + " " + surName;
    }
    public void cars(){
        System.out.println("Кількість автомобілів у салоні: " + numberOfCars);
    }
    public double square(){
        double s = length*width;
        return s;
    }
}


