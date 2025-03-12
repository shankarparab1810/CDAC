import java.util.Scanner;
class PositiveEven{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter one number:");
		int num = sc.nextInt();
		/*String str = num>0?num%2==0?(num+" is positive and even"):(num+" is positive odd"):(num+" is negative");
		System.out.print(str);*/
		if (num > 0 && num % 2 == 0) {
            System.out.println("The number is positive and even.");
        } else if (num > 0 && num % 2 != 0) {
            System.out.println("The number is positive but odd.");
        } else if (num <= 0) {
            System.out.println("The number is not positive.");
        }
		
		
	}
}