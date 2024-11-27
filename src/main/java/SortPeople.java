import java.util.Arrays;
import java.util.Comparator;

public class SortPeople {
    public static void main(String[] args) {
        Person[] people = {
                // Tilføj flere personer, som deler nogle af de samme egenskaber f.eks. samme fornavn, men hvor deres andre egenskaber er unikke.
                new Person("Hans", "Filipson", 30, 1.70),
                new Person("Merete", "Poulsen", 12, 1.22),
                new Person("Ibsen", "Poulsen", 55, 1.20),
                new Person("Sixten", "Ottesen", 15, 1.90),
                new Person("Aníta Ósk", "Logadóttir", 24, 158),
                new Person("Alexander Örn", "Birgisson", 26, 176),
                new Person("Arnar Gauti", "Breiðfjörð Alexandersson", 2, 76)
        };

        System.out.println("Usorteret liste af personer:");
        for (Person person : people) {
            System.out.println(person);
        }

        // skriv kode herunder

        /*
        //comparing alder
        Comparator<Person> ageCompare = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        };

        // sortering alder
        Arrays.sort(people, ageCompare);

                //print sorteret alder
        System.out.println("\nSorteret efter alder: ");
        for (Person person : people) {
            System.out.println(person);
        }
        */

        Arrays.sort(people, new SortLastName());

        //print sorteret efternavn
        System.out.println("\nSorteret efter efternavn: ");
        for (Person person : people) {
            System.out.println(person);
        }

    }


}
