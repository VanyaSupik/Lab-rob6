package Lab_rob6;

public class ClientAndSTO implements STODemo,AutoSalon.method {
    String brand;
    int budget;

    int personal;
    int price;

    public ClientAndSTO(String brand, int budget, int personal, int price) {
        this.brand = brand;
        this.budget = budget;
        this.personal = personal;
        this.price = price;
    }

    public void showBudget() {
        System.out.println("Бюджет клієнта "+budget);
    }
    public String returnBrand() {
        return brand;
    }

    public void numb() {
        System.out.println("Кількість персоналу "+personal);
    }

    public int price() {
        return price;
    }

    public void service(String car) {
        System.out.println("Марка якій потрібне обслуговування- " + car);

    }
}
