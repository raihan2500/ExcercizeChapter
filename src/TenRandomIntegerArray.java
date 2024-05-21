import java.util.*;

public class TenRandomIntegerArray {
    public static void main(String[] args) {
        Random in = new Random();
        int[] array = new int[10];

        for(int i = 0; i < 10; i++){
            array[i] = in.nextInt(100);
        }

        //• Every element at an even index.
        for (int i = 0; i < 10; i += 2){
            System.out.print(array[i] + " ");
        }
        System.out.println();

        //• Every even element.
        for(int i = 0; i < 10; i++){
            if(array[i] % 2 == 0){
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        //• All elements in reverse order.
        for(int i = 9; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
        System.out.println();

        //• Only the first and last element.
        System.out.println(array[0] + " " + array[9]);

    }



}
