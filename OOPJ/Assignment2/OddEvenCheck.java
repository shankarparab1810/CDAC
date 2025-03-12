import java.util.Scanner; 
 
class OddEvenCheck { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
         
        System.out.print("Enter a number: "); 
        int num = scanner.nextInt(); 
         
        System.out.println((num & 1) == 0 ? "Even" : "Odd"); 
    } 
}