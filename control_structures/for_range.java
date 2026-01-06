package control_structures;

import java.util.Scanner;

public class for_range{
    public static void main(String[] args) {

        // INICIALIZE THE SCANNER FOR INPUT
        Scanner input = new Scanner(System.in);

        // GET THE INPUT
        System.out.print("Enter a number between 1-10: ");
        int number = input.nextInt();
        input.close();

        for (int x = 0; x <= number; x++ ){
            System.out.println("The number you chose: " + number + " the number we are: " + x);
        }


    }
}
