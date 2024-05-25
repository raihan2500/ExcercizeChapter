import java.util.*;

public class RandomPermutation {
    public static void main(String[] args) {
        int [] array = new int[10];
        Random in = new Random();
        for(int i = 0; i < 10; i++){
            array[i] = in.nextInt(10) + 1;
        }
        for(var a : array){
            System.out.printf("%d ", a);
        }
    }
}