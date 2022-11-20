public class Person {
    private int id;
    private String name;
    public static int countObject = 0;

    public Person(){
        id = 0;
        name = null;
        countObject++;

    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
        countObject++;

    }

    Person(Person copy) { //Przywołanie konstruktora kopiującego
        id = copy.id;
        name = copy.name;
        countObject++;
    }

    public String toString(Person client, Person person) {

        //WARUNKI DLA TESTU
      boolean person_test_null = person.name != null && person.name != "";
      boolean argument_test_null = client.name != null && client.name != "";

//        boolean person_test_null = !person.name.equals(null) && !person.name.equals("");
//        boolean argument_test_null = !client.name.equals(null) && !client.name.equals("");

        System.out.println("id goscia: " + client.id + ", name: " + client.name );
        System.out.println("id pracownika: " + person.id + ", name: " + person.name );
        //SPRAWDZENIE CZY OSOBA POSIADA IMIE
        //ZWRÓCENIE ODPOWIEDNIEJ WARTOSCI
        if (person_test_null && argument_test_null) {
            return "Czesc " + client.name + ", mam na imie " + person.name + ".";
        } else return "BRAK DANYCH";
    }
}
