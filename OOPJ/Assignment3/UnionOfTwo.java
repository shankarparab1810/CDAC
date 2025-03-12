class UnionOfTwo {
    public static void main(String[] args) {
        int[] array1 = {5, 3, 8, 6, 3};
        int[] array2 = {8, 3, 9, 4};

        
        System.out.print("Union: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " "); 
        }
        for (int i = 0; i < array2.length; i++) {
            boolean found = false;
            for (int j = 0; j < array1.length; j++) {
                if (array2[i] == array1[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(array2[i] + " "); 
            }
        }
        System.out.println();

       
        System.out.print("Intersection: ");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.print(array1[i] + " "); // Print common elements
                    break;
                }
            }
        }
        System.out.println();
    }
}
