package search.binarysearch;


public class BinarySearchMain {
    public static void main(String[] args) {
        int size = 10;
        BinarySearch binarySearch = new BinarySearch(size);

       binarySearch.insert(11);
       binarySearch.insert(33);
       binarySearch.insert(44);
       binarySearch.insert(66);
       binarySearch.insert(55);
       binarySearch.insert(77);
       binarySearch.insert(88);
       binarySearch.insert(99);
       binarySearch.insert(0);

        int searchKey = 88;

        if(binarySearch.find(searchKey) != binarySearch.size()){
            System.out.println("Found " + searchKey);
        }else{
            System.out.println("Can't find " + searchKey);
        }

        binarySearch.display();

        binarySearch.delete(0);
        binarySearch.delete(55);
        binarySearch.delete(33);

        binarySearch.display();

    }

}
