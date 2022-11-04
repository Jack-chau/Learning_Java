import java.util.Scanner;

public class inputAndOutput {
    public static void main ( String[] args ) {
        System.out.println ( "What is your name?" ) ;

        Scanner scanner = new Scanner ( System.in ) ;

        String name = scanner.nextLine ( ) ; // grep next line's contents

        System.out.println ( "Hello " + name ) ;
    }
}
