

public class Main {
    public static void main(String[] args) {
        Person adam = new Person(1, "Adam");
        System.out.println(Person.instance);
        System.out.println(adam);
        Person jakub = new Person(2, "Jakub");
        System.out.println(Person.instance);
        System.out.println(jakub);
        Person guest = jakub;
        System.out.println(guest);
        System.out.println(guest.toString(adam, guest));

    }
}
