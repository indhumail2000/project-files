import java.util.Scanner;
public class BMICalculater{
    public static void main (String [] args)
    throws Exception{
        calculateBMI();

    }
    private static void calculateBMI() throws Exception
    {
        System.out.println("Enter weight in kg:");
        Scanner scan = new Scanner(System.in);
        float weight = scan.nextFloat();
        System.out.println("Enter height in cm:");
        float height = scan.nextFloat();

        float bmi = (100*100*weight)/(height*height);

        System.out.println("your BMI is:");
        printBMICategory(bmi);

    }

    private static void printBMICategory(float bmi){
        if (bmi < 18.5) {
            System.out.println("you are underweight");
        }else if (bmi < 25) {
            System.out.println("you are normal");
        }else if (bmi < 30) {
            System.out.println("you are over weight");
        }else {
            System.out.println("you are obese");
        }
    }
}