public class CountEvenOdd { 
    public static void main(String[] args) { 
        int[] arr = {12, 45, 2, 89, 34, 7, 99, 23}; 
 
        int evenCount = 0, oddCount = 0; 
 
        for (int num : arr) { 
            if (num % 2 == 0) { 
                evenCount++; 
            } else { 
                oddCount++; 
            } 
        } 
 
        System.out.println("Even numbers count: " + evenCount); 
        System.out.println("Odd numbers count: " + oddCount); 
    } 
} 