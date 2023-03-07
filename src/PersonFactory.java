import java.util.ArrayList;

public class PersonFactory {

    private ArrayList<Person> allPersons;

    public PersonFactory() {
        allPersons = new ArrayList<>();
    }

    public void addPerson(Person person) {
        int i;
        for(i = 0; i <= allPersons.size(); i = i + 1){
            if(person.getLastName().compareTo((allPersons.get(i)).getLastName()) < 1){
                allPersons.add(i,person);
            }
        }
    }

    public ArrayList<Person> under18() {
        ArrayList<Person> under18 = new ArrayList<>();
        for(int i = 0; i <= allPersons.size(); i = i + 1){
            if(allPersons.get(i).getAge() < 18){
                under18.add(allPersons.get(i));
            }
        }
        return under18;
    }

    public boolean checkLastName(String lastName) {
        boolean yes = false;
        for(int i = 0; i <= allPersons.size(); i = i + 1){
            if (lastName.compareTo(allPersons.get(i).getLastName()) == 0){
                yes = true;
            }
        }
        return yes;
    }
}
