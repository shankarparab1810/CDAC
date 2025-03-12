class SubarrayWithSum {
    public static void main(String[] args) {
        int[] array = {1, 4, 20, 3, 10, 5};
        int S = 33;

        int start = 0;
        int currentSum = 0;
        boolean found = false;

        
        for (int end = 0; end < array.length; end++) {
            
            currentSum += array[end];

            while (currentSum > S && start < end) {
                currentSum -= array[start];
                start++;
            }
            if (currentSum == S) {
                found = true;
                System.out.println("Subarray with given sum found from index " + start + " to " + end);
                break;
            }
        }

        if (!found) {
            System.out.println("No subarray with the given sum found.");
        }
    }
}
