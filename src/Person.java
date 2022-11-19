public class Person {
    private int id;
    private String name;
    public static int instance;


    public Person(int id, String name) {
        this.id = id;
        this.name = name;
        instance++;
    }

    Person(Person copy) { //Przywołanie konstruktora kopiującego
        id = copy.id;
        name = copy.name;
        instance++;
    }

    public String toString(Person argument, Person person) {
        instance++;
        System.out.println("instancja: " + instance);

        //WARUNKI DLA TESTU
        boolean person_test_null = person.name != null && person.name != "";
        boolean argument_test_null = argument.name != null && argument.name != "";

        //SPRAWDZENIE CZY OSOBA POSIADA IMIE
        //ZWRÓCENIE ODPOWIEDNIEJ WARTOSCI
        if (person_test_null && argument_test_null) {
            return "Czesc " + argument.name + " mam na imie " + person.name + ".";
        } else return "BRAK DANYCH";
    }


}
