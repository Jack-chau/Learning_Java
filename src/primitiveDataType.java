public class primitiveDataType {

    public static void main ( String[] args ) {
        boolean isPizzaDelicious = true ;

        byte b = 127; // 10110011 9 bit word
        byte c = 'A'; // base on ASCII table
        
        char d = 'Z' ;

        short s = 32764 ; // for small number
        int i = 4343434 ; // is 32 bit number
        long l = 123123213123L ; // is 64 bit number (you have to put L at the end if it exceek the range of an inter)
        long l2 = 50 ; // it works because long will convert to integer

        float f = 20.5f; // 32 bit
        double dd = 20.05; // 64 bit 

        System.out.println ( c ) ;
        System.out.println ( d ) ;
        System.out.println ( l2 ) ;

        double xDouble = dd/s ;
        float xFloat = ( float )  ( dd / s ); // convert dd double to float
        

        System.out.println ( xDouble ) ;
        System.out.println ( xFloat ) ;

    }   
}

// boolean, byte, char, short, int, long, float and double