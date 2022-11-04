public class staticMethod {
    public static void main ( String[] args ) {
        String x = "my oh my chicken pot pie";
        System.out.println ( x.charAt ( 0 ) ) ;
        System.out.println ( x.charAt ( x.length ( ) -1 ) ) ;
        
        String fullAd = x + " Now with 20% more chicken" ;
        System.out.println ( fullAd ) ;
        System.out.println ( fullAd.contains ( "chicken" ) ) ;
        // find "my", ignore the first one
        System.out.println ( fullAd.indexOf ( "my", fullAd.indexOf ( "my" ) +1 ) ) ;

        System.out.println ( fullAd.lastIndexOf ( "my" ) ) ;
    }
}
