package bbw.cw.cluedomvc.DataModel;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class DataService {

    private List<Person> personList = new ArrayList<>(
            Arrays.asList(
                    new Person("scarlett", "Miss", "25", "blonde", "red"),
                    new Person("Green", "rev", "80", "grey", "green"),
                    new Person("Mustard", "Colonel", "85", "grey", "brown"),
                    new Person("Plum", "Professor", "70", "Black", "violett"),
                    new Person("Peacock", "Misses", "50", "Brown", "Blue"),
                    new Person("White", "Misses", "70", "grey", "White")));
    public List<Person> getPersonList() {
        return personList;
    }
}
