class SumAndAverage { 
    public static void main(String[] args) { 
        int[] arr = {12, 45, 2, 89, 34, 7, 99, 23}; 
 
        int sum = 0; 
         
        for (int num : arr) { 
            sum += num; 
        } 
 
        double average = (double) sum / arr.length; 
 
        System.out.println("Sum of elements: " + sum); 
        System.out.println("Average of elements: " + average); 
    } 
}