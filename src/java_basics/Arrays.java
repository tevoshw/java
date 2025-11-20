package java_basics;

public class Arrays {
    static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};
        for (int i = 0; i <5; i++){
            System.out.println(numbers[i]);
        }

        String[] names = {"Jose", "Josh", "Joseph"};
        for (int i = 0; i < 3; i++){
            System.out.println(names[i]);
        }

        // OR

        String[] names2 = {"Ana", "Anne", "Elizabeth"};
        for (String names_ : names2){
            System.out.println(names_);
        }





    }
}
