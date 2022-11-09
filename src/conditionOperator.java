public class conditionOperator {
    public static void main ( String[] args ) {

        String name = "jack" ;
        // same same
        Boolean welcome = name.equals ( "jack" ) ? true : false ;
        System.out.println ( welcome ) ;
        
        if ( name.equals ( "jack" ) ) {
            Boolean welcomeB = true ;
            System.out.println ( welcomeB ) ;
        }else {
            Boolean welcomeB = false ;
            System.out.println ( welcomeB ) ;
        }
    }
}
