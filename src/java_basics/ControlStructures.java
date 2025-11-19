package java_basics;

public class ControlStructures {
    static void main(String[] args) {
        int age = 18;

        if(age < 18){
            System.out.println("You cannot enter at the party because your age is: " + age);
        } else{
            System.out.println("You can enter at the party, because your age is: " + age);
        }


        int week = 3;
        switch (week){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.printf("Sunday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.printf("Incorret input");
                break;

        }

    }
}
