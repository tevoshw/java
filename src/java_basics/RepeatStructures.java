package java_basics;

public class RepeatStructures {
    static void main(String[] args) {

        for (int i = 0; i < 10; i++){
            System.out.println("The i actual is: " + i);
        }

        int i2 = 0;
        do{
            i2 += 1;
            System.out.println("The i2 actual is: " + i2);
        } while (i2 < 10);


        int i3 = 0;
        while (i3 < 10){
            i3 += 1;
            System.out.println("The i3 actual is: " + i3);
        }



    }
}
