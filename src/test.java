import java.util.Scanner ; 

public class test {
    public static void main ( String[] args ) {
        
        System.out.print ( "Please enter your name: " ) ;
        Scanner scanner = new Scanner ( System.in ) ;
        String name = scanner.nextLine ( ) ;

        switch ( name ) {
            case "JackChau" :
            case "Jack" :
                System.out.println ( "Hello Jack" ) ; 
                break ;

            case "noBody" :
                System.out.println ( "You are not no body!! " ) ;
                break ;

            default :
                System.out.println ( "please try again later!" ) ;
                break ;
        }
    }
}