package search.binarysearch.object;

public class DataObjecBsearch {

    public static void main(String[] args) {
        int size = 100;
        DataArray array = new DataArray(size);

        array.insert("Evans" , "Patty", 24);
        array.insert("Smith" , "Lorraine", 37);
        array.insert("Yee" , "Tom", 43);
        array.insert("Adams" , "Henry", 63);
        array.insert("Hashimoto" , "Sato", 21);
        array.insert("Stimson" , "Henry", 29);
        array.insert("Velasquez" , "Jose", 72);
        array.insert("Lamarque" , "Henry", 54);
        array.insert("Vang" , "Minh", 22);
        array.insert("Creswell" , "Lucinda", 18);

        array.displayPeople();
        String searchKey = "Stimson";
        Person found = array.find(searchKey);
        if(found != null){
            System.out.println("Found");
            found.displayPerson();
        }else{
            System.out.println("Can't find " + searchKey);
        }

    }

}
