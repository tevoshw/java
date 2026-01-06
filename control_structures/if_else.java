package control_structures;

import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {

        // INICIALIZE THE SCANNER FOR INPUT
        Scanner input = new Scanner(System.in);

        // GET THE INPUT
        System.out.print("Digite um número");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("EVEN NUMBER// NUMERO PAR");
        } else{
            System.out.println("ODD NUMBER// NUMERO ÍMPAR");
        }

        input.close();


    }
}
