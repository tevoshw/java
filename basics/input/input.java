package basics.input;
import java.util.Scanner;


public class input {
    public static void main(String[] args) {


        // INITIALIZE THE CLASS OF THE INPUT
        Scanner input =  new Scanner(System.in);

        // GET THE NAME
        System.out.print("Digite seu nome: ");
        String name = input.nextLine();


        // GET THE AGE  
        System.out.print("Digite sua idade: ");
        int age = input.nextInt();

        // GET IF PASS
        System.out.print("Are you a student?, (true/false): ");
        boolean  IsStudent = input.nextBoolean();



        // PRINT ALL
        if (IsStudent) {        
            System.out.println("Bem-Vindo " + name + " sua idade é de: " + age + "e você tem acesso");
        } else{
            System.out.println("Você não possui acesso por não ser estudante");
        }

        input.close();

        
    }    
}
