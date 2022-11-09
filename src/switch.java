import java.util.Scanner;

public class MySweetProgram { 
    public static void main ( String[] args ) {
        System.out.println ( "What's your name?" ) ;
        Scanner scanner = new Scanner ( System.in ) ;

        String name = scanner.nextLine( ) ;

        switch ( name ) {
            
            case "Jack" :
            case "JackChau" :
            // code
            System.out.println ( "Welcome my man" ) ;
            break ;
            
            case "Caleb" :
            System.out.println ( "Go away" ) ;
            break ;
            
            default:
                System.out.println ( "Try again later" ) ;
                break ;
        }
    }
}