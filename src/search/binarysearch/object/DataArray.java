package search.binarysearch.object;

public class DataArray {
    private final Person[] people;
    private int nElem;

    public DataArray(int max) {
        people = new Person[max];
        nElem = 0;
    }

    public Person find(String searchName){
        int j;
        for (j = 0; j < nElem; j++){
            if(people[j].getLastName().endsWith(searchName)){
                break;
            }
        }
        if(j == nElem){
            return null;
        }else{
            return people[j];
        }
    }

    public void insert(String lastName, String firstName, int age){
        people[nElem] = new Person(lastName, firstName , age);
        nElem++;
    }

    public boolean delete(String searchName){
        int j;
        for (j = 0; j < nElem; j++){
            if(people[j].getLastName().equals(searchName)){
                break;
            }
        }
        if(j == nElem){
            return false;
        }else{
            for (int i = j; i < nElem; i++) {
                people[i] = people[i + 1];
                nElem--;

            }
            return true;
        }
    }

    public void displayPeople(){
        for (int i = 0; i < nElem; i++) {
            people[i].displayPerson();
        }
    }
}
