public class TestProgram {

    /*
     * The Strategy design pattern defines a set of algorithms and allows to select the algorithm at run-time.
     *
     */ 
    private static <T> String vectorToString(String name, T[] vector) {
        String s = name + " {";

        for (int i=0; i<vector.length; i++)
            s = s + vector[i] + ((i < vector.length - 1) ? ", " : "");

        s = s + "} \n";

        return s;
    }



    
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Integer number;

        System.out.println("BinarySearch using a vector sorted in ascending order \n");

        Integer [] numbersAscending = { 5, 7, 9, 10, 15, 19, 21, 23, 31, 45, 56, 67, 70 };
        
        @SuppressWarnings({ "rawtypes", "unchecked" })
        IBinarySearch ascending = new BinarySearch(numbersAscending, new AscendingOrder());
        
        System.out.println(vectorToString("Data", numbersAscending));
        
        number = 99;
        System.out.println(number + (ascending.search(number) ? " found " : " not found"));
        number = 15;
        System.out.println(number + (ascending.search(number) ? " found " : " not found"));
        number = 70;
        System.out.println(number + (ascending.search(number) ? " found " : " not found"));
        number = 3;
        System.out.println(number + (ascending.search(number) ? " found " : " not found"));
        number = 45;
        System.out.println(number + (ascending.search(number) ? " found " : " not found"));
        number = 65;
        System.out.println(number + (ascending.search(number) ? " found " : " not found") + "\n");

        System.out.println("BinarySearch using a vector sorted in descending order \n");

        Integer [] numbersDescending = { 70, 67, 56, 45, 31, 23, 21, 19, 15, 10, 9, 7, 5 };
        
        @SuppressWarnings({ "rawtypes", "unchecked" })
        IBinarySearch descending = new BinarySearch(numbersDescending, new DescendingOrder());
        
        System.out.println(vectorToString("Data", numbersDescending));
        
        number = 99;
        System.out.println(number + (descending.search(number) ? " found " : " not found"));
        number = 15;
        System.out.println(number + (descending.search(number) ? " found " : " not found"));
        number = 70;
        System.out.println(number + (descending.search(number) ? " found " : " not found"));
        number = 3;
        System.out.println(number + (descending.search(number) ? " found " : " not found"));
        number = 45;
        System.out.println(number + (descending.search(number) ? " found " : " not found"));
        number = 65;
        System.out.println(number + (descending.search(number) ? " found " : " not found")); 
        
        

        System.out.println("BinarySearch using a double vector sorted in ascending order \n");

        Double [] DnumbersAscending = { 5.0, 7.0, 9.0, 10.0, 15.0, 19.0, 21.0, 23.0, 31.0, 45.0, 56.0, 67.0, 70.0 };
        @SuppressWarnings({ "rawtypes", "unchecked" })
        IBinarySearch Dascending = new BinarySearch(DnumbersAscending, new AscendingOrder());

        System.out.println(vectorToString("Data", DnumbersAscending));
        Double number_2;

        number_2 = 99.0;
        System.out.println(number_2 + (Dascending.search(number_2) ? " found " : " not found"));
        number_2 = 15.0;
        System.out.println(number_2 + (Dascending.search(number_2) ? " found " : " not found"));
        number_2 = 70.0;
        System.out.println(number_2 + (Dascending.search(number_2) ? " found " : " not found"));
        number_2 = 3.0;
        System.out.println(number_2 + (Dascending.search(number_2) ? " found " : " not found"));
        number_2 = 45.0;
        System.out.println(number_2 + (Dascending.search(number_2) ? " found " : " not found"));
        number_2 = 65.0;
        System.out.println(number_2 + (Dascending.search(number_2) ? " found " : " not found") + "\n");



    }


    
}