import java.util.Scanner;
class SeparateEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[20];
        int[] even = new int[20];
        int[] odd = new int[20];
        int evenCount = 0, oddCount = 0;

        System.out.println("Enter 20 numbers:");
        for (int i = 0; i < 20; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] % 2 == 0) {
                even[evenCount] = arr[i];
                evenCount++;
            } else {
                odd[oddCount] = arr[i];
                oddCount++;
            }
        }

        System.out.println("Even numbers:");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();

        System.out.println("Odd numbers:");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println();
    }
}
