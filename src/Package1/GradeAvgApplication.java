package Package1;


public class GradeAvgApplication {
    public static void main(String[] args) {
        int grade1 = 85;
        int grade2 = 77;
        int grade3 = 78;
        int grade4 = 92;
        int grade5 = 88;

        double average = (double)(grade1 + grade2 + grade3 + grade4 + grade5) / 5;

        
        System.out.println("The average of the grades is: " + average);
    }
}