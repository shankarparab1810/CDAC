import java.util.Scanner;

class ArrayAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[20];
        int evenCount = 0, oddCount = 0, multiplesOfThreeCount = 0;

        System.out.println("Enter 20 integer numbers:");
        for (int i = 0; i < 20; i++) {
            numbers[i] = scanner.nextInt();

            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }


            if (numbers[i] % 3 == 0) {
                multiplesOfThreeCount++;
            }
        }
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
        System.out.println("Number of multiples of 3: " + multiplesOfThreeCount);
    }
}
