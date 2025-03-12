class SmallLarge { 
    public static void main(String[] args) { 
        int[] arr = {12, 45, 2, 89, 34, 7, 99, 23}; 
 
        int min = arr[0], max = arr[0]; 
 
        for (int num : arr) { 
            if (num < min) min = num; 
            if (num > max) max = num; 
        } 
 
        System.out.println("Smallest element: " + min); 
        System.out.println("Largest element: " + max); 
    } 
} 
