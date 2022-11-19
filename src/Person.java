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

    public String toString(Person argument, Person imie) {
        instance++;
        if (imie != null) {
            return "Czesc " + argument.name + " mam na imie " + imie.name + ".";
        } else return "BRAK DANYCH";
    }


}
