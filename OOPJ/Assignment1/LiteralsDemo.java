public class LiteralsDemo {
    public static void main(String[] args) {
        int binaryNum = 0b1010;  
        int octalNum = 012;     
        int hexNum = 0xA;        
        float floatNum = 10.5f; 
        double doubleNum = 20.123; 
        double scientificNum = 1.2e3; 
        System.out.println("Binary (0b1010)      = " + binaryNum); 
        System.out.println("Octal (012)          = " + octalNum);   
        System.out.println("Hexadecimal (0xA)    = " + hexNum);    
        System.out.println("Float (10.5f)        = " + floatNum); 
        System.out.println("Double (20.123)      = " + doubleNum);
        System.out.println("Scientific (1.2e3)   = " + scientificNum); 
    }
}