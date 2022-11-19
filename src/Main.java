

public class Main {
    public static void main(String[] args) {
        System.out.println("Instancja:" + Person.instance);

        Person adam = new Person(1, "Adam");
        Person jakub = new Person(2, "Jakub");
        Person employ = new Person();

        Person guest = jakub;
        System.out.println(guest);
        System.out.println(guest.toString(guest, employ));
        guest = adam;
        System.out.println(guest.toString(guest, employ));



    }
}
