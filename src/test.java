import java.util.Scanner;

public class test {
    public static void main ( String[] args ) {
        System.out.println ( "Please enter your password: " ) ;
        String password = "let me in" ;
        Scanner scanner = new Scanner ( System.in ) ;
        String userPassword = scanner.nextLine ( ) ;

        System.out.println ( userPassword.equals ( password ) ) ;
    }
}


