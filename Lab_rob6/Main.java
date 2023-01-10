package Lab_rob6;

public class Main {
    public static void main(String[] args) {
        AutoSalon a = new AutoSalon(15.4,16.7,25,"Іван","Супик");
        a.cars();
        System.out.println(a.square());
        System.out.println(a.props());

        System.out.println();

        Seller s = new Seller("Іван","Супик",25.5,15.4,17);
        s.cars();
        System.out.println(s.square());
        System.out.println(s.props());

        System.out.println();

        ClientAndSTO c = new ClientAndSTO("Renault",14000,6,2000);
        c.numb();
        System.out.println(c.price());
        System.out.println(c.returnBrand());
        c.showBudget();
        c.service("Renault");
    }
}
