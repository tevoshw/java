package data_structures;

public class arrays1 {

    public static void main(String[] args) {
        // TYPES OF DECLARATION A ARRAY
        // TYPE NAME =  NEW TYPE[SIZE]
        
        int[] array_1 = new int[5];
        int array_2[] = new int[6];
        int[] array_3 = {1,2,3,4,5,6,7};


        // SHOW THE NUMBERS
        for (int x = 0; x < array_1.length; x++){
            System.out.println(array_1[x]);

        }
        for (int x = 0; x < array_2.length; x++){
            System.out.println(array_2[x]);

        }
        for (int x = 0; x < array_3.length; x++){
            System.out.println(array_3[x]);

        }

    }
}