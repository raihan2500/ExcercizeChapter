import java.util.*;

public class AlternatingSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[9];
        for(int i = 0; i < 9; i++){
            array[i] = in.nextInt();
        }
        int sum = 0;

        for(int i = 0; i < 9; i++){
            if(i%2 == 1){
                sum +=array[i];
            }
            else {
                sum -= array[i];
            }
        }
        System.out.println(sum);

        for(int i = 0, j = array.length-1; i < array.length / 2; i++ ){

            int temp = array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i];
            array[i] = temp;

        }
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
