import java.util.Scanner;

class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[60];
        int above75 = 0, below40 = 0;

        for (int i = 0; i < 60; i++) {
            marks[i] = scanner.nextInt();
        }

        for (int i = 0; i < 20; i++) {
            int physics = marks[i * 3];
            int chemistry = marks[i * 3 + 1];
            int maths = marks[i * 3 + 2];
            int total = physics + chemistry + maths;
            float percentage = (total / 3.0f);

            if (percentage >= 75) {
                above75++;
            }
            if (percentage <= 40) {
                below40++;
            }
        }

        System.out.println("Number of students 75% and above: " + above75);
        System.out.println("Number of students 40% and below: " + below40);
    }
}
