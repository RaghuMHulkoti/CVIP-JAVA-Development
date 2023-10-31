
import java.util.Scanner;
import java.util.*;

public class bmicalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("BMI Calculator");
        System.out.print("Enter your weight (kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Enter your height (m): ");
        double height = scanner.nextDouble();

        double bmi = calculate(weight, height);
        String Conclusion = result(bmi);

        System.out.println("Your BMI is: " + String.format("%.2f", bmi));
        System.out.println("Interpretation: " + Conclusion );

        scanner.close();
    }

    public static double calculate(double weight, double height) {
        return weight / (height * height);
    }

    public static String result(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 24.9) {
            return "Normal Weight";
        } else if (bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
