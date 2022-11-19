

public class Main {
    public static void main(String[] args) {
        Person adam = new Person(1, "Adam");
        Person jakub = new Person(2, "Jakub");
        Person emptyPerson = new Person(0, "");
        Person guest = jakub;
        System.out.println(guest);
        System.out.println(guest.toString(adam, guest));
        System.out.println(guest.toString(jakub , emptyPerson));

    }
}
