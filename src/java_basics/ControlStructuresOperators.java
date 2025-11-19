package java_basics;

public class ControlStructuresOperators {
    static void main(String[] args) {

        int age = 18;
        boolean pass = false;

        if(age == 18 && pass == true){
            System.out.println("You can enter at the party, because your age is: " + age + "and your pass are: " + pass);
        } else{
            System.out.println("You can enter at the party, because your age is: " + age + "and your pass are: " + pass);
        }

        int money = 90;
        boolean descont100 = true;
        if (money >= 100 || descont100){
            System.out.println("Yo can buy your playstation");
        } else{
            System.out.println("You cannot buy your playsation");
        }


    }
}
