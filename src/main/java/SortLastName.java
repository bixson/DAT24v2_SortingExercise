import java.util.Comparator;

public class SortLastName implements Comparator<Person> {

    //implement compare method from comparator interface
    @Override
    public int compare(Person o1, Person o2) {
        //compares lastnames of two person objects
        return o1.getLastName().compareTo(o2.getLastName());
    }
}
