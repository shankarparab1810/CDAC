import java.util.*;

class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 3};
        findDuplicates(arr);
    }

    static void findDuplicates(int[] arr) {
        Arrays.sort(arr);  
        boolean found = false;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.print(arr[i] + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("-1"); 
        }
    }
}