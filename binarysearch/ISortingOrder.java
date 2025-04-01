public interface ISortingOrder {

    public <T extends Comparable<T>> int compare(T vector, T value);

}