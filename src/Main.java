import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Instancja:" + Person.countObject);
        Scanner scan_str = new Scanner(System.in);
        Scanner scan_int = new Scanner(System.in);

        System.out.println("Podaj imie: ");
        String name_user = scan_str.nextLine();
        System.out.println("Podaj ID");
        int id_user = scan_int.nextInt();


        Person adam = new Person(id_user, name_user);
        Person jakub = new Person(2, "Jakub");

        Person employ = new Person(adam);
        Person emptyEmploy = new Person();

        Person guest = new Person(jakub);
        System.out.println(guest);
        System.out.println(jakub);

        System.out.println(emptyEmploy);

        System.out.println(guest.toString(guest, employ));
        guest = adam;
        System.out.println(guest.toString(guest, employ));

        System.out.println(Person.countObject);

    }
}
