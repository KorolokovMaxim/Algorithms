package search.binarysearch;

public class BinarySearch {

    private  final long[] a;
    private int nElems;

    public BinarySearch(int max) {
        a = new long[max];
        nElems = 0;
    }

    public int size() {
        return nElems;
    }

    public int find(long searchKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn] == searchKey) {
                return curIn;
            } else if (lowerBound > upperBound) {
                return nElems;
            } else {
                if (a[curIn] < searchKey) {
                    lowerBound = curIn + 1;
                } else {
                    upperBound = curIn - 1;
                }
            }
        }
    }

    public void insert(long value) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (a[j] > value) {
                break;
            }
        }
        if (nElems - j >= 0) System.arraycopy(a, j, a, j + 1, nElems - j);
        a[j] = value;
        nElems++;
    }

    public boolean delete(long value) {
        int j = find(value);
        if (j == nElems) {
            return false;
        } else {
            if (nElems - j >= 0) System.arraycopy(a, j + 1, a, j, nElems - j);
            nElems--;
            return true;
        }
    }

    public void display(){
        for (int i = 0; i < nElems; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println(" ");
    }


}
