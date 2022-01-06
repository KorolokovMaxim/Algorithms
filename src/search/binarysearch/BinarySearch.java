package search.binarysearch;

public class BinarySearch {

    private long[] array; // link for array
    private int countElement; // number element's

    public BinarySearch(int max) {
        array = new long[max]; // create array
        countElement = 0;
    }

    public int size(){
        return countElement;
    }

    public int find(long searchKey){ // find number
        int lowerBound = 0;
        int upperBound = countElement - 1;
        int currentInt;

        while (true){
            currentInt = (lowerBound + upperBound) / 2;
            if(currentInt == searchKey){
                return currentInt; // it is number
            }else if(lowerBound > upperBound){
                return countElement; // element not found
            } else{
              if(array[countElement] < searchKey){
                  lowerBound = currentInt + 1; // searching upper bound
              }else{
                  upperBound = currentInt - 1; // searching lower bound
              }
            }
        }
    }
}
