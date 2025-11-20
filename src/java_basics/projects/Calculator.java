package java_basics.projects;
import java.util.Scanner;


public class Calculator {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // GET THE FIRST NUMBER
        System.out.println("Enter your first number: ");
        int number_one = input.nextInt();


        // GET THE SECOND NUMBER
        System.out.println("Enter your second number: ");
        int number_two = input.nextInt();

        // GET THE OPERATOR
        System.out.println("Wich operator you want to use?");
        System.out.println("1 -> + " +
                "2 -> - " +
                "3 -> / " +
                "4 -> * ");
        int operator = input.nextInt();


        // GET THE RESULT
        switch (operator){
            case 1:
                int result_addiction = number_one + number_two;
                System.out.println("The result: " + result_addiction);
            case 2:
                int result_subtraction = number_one - number_two;
                System.out.println("The result: " +result_subtraction);
            case 3:
                try{
                    int result_divison = number_one /  number_two;
                    System.out.println("The result: " +result_divison);
                }
                catch (ArithmeticException e){
                    System.out.println("Error, your cant divide theses 2 numbers");
                    break;
                }

            case 4:
                int result_multiplication = number_one * number_two;
                System.out.println("The result: " + result_multiplication);
        }
    }
}
