import java.util.Arrays ;
import java.util.Scanner ;

public class array {
    public static void main ( String[] args ) {
    /*
        // initializing
        int[] grades = new int[100]; // 100 element in array
        
        // same as int grades[] = new int[100]; 
        // grades[0] =  10; 

        int[] grades2 = {10,9,8,7,6,5,4,3,2,1} ; //second way to define an array
        // System.out.println ( grades2[0] + "\n" + grades2[3] ) ;
        // System.out.println ( Arrays.toString( grades2 ) ) ;

        // two dimension array
        int[][] grades3 = { { 1, 2, 3 } , { 4, 5, 6 } } ;
        System.out.println ( Arrays.deepToString( grades3 ) ) ;
    */ 

    //  Assign user input into array

        int[] array_1 = new int[10] ; 

        Scanner input = new Scanner ( System.in ) ;

        for (int i = 0; i <10 ; i++ ) {
            System.out.println ( "Please input " + i + "th array: " ) ;

            int x = input.nextInt ( ) ;
            array_1[i] = x ;
        }
        System.out.println ( Arrays.toString( array_1 ) ) ;

        input.close() ;
    }
}


