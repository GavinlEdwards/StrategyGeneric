public class BinarySearch <T extends Comparable<T>>  implements IBinarySearch <T>  {
    private T[] vector;
    private ISortingOrder sorting;
    
    public BinarySearch(T[] vector, ISortingOrder sorting) {
        this.vector = vector;
        this.sorting = sorting;
    }
    
    @Override
    public boolean search(T value) {
        int mid, low = 0, high = this.vector.length - 1;

        while (low <= high) {
            mid = (low + high) / 2;
            if (this.sorting.compare(this.vector[mid], value) == 0) {
                return true;
            } else if (this.sorting.compare(this.vector[mid], value) > 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false;
    }

}