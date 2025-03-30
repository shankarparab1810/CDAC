public class RearrangeArray {
    public static void rearrange(int[] arr) {
        int left = 0, right = arr.length - 1;
        
        while (left < right) {
           
            if (arr[left] < 0) {
                left++;
            }
            else if (arr[right] > 0) {
                right--;
            }
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
        System.out.println("Before rearranging:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        rearrange(arr);
        
        System.out.println("\nAfter rearranging:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}