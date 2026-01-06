package control_structures;

import java.util.Scanner;

public class while_do{
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        // INICIALIZE THE SCANNER FOR INPUT
        Scanner input = new Scanner(System.in);

        // GET THE INPUT
        System.out.print("Enter a number between 1-10: ");
        int number = input.nextInt();
        input.close();


        while (x <= number) {
            System.out.println("The number you chose: " + number + " the number we are: " + x);
            x += 1;
        }

        System.out.println();
        System.out.println();

        // OR // BUT THIS RUN ONCE WHILE GET THE CONDITIONAL
        do {
            System.out.println("The number you chose: " + number + " the number we are: " + y);
            y += 1;
        } while (y <= number);



    }
}
