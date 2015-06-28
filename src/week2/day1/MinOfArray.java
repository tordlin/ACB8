package week2.day1;

/**
 * Created by Tordlin on 27/06/2015.
 */
public class MinOfArray {
    public static void main(String[] args) {
        int[] array = new int [5];
        int min;

        for(int i = 0; i < 5; i++){
            array[i] = (int)(Math.random() * 10);
        }

        min = array[0];

        for(int i = 1; i < 5; i++){
            if(array[i] < min){
                min = array[i];
            }
        }

        for(int i = 0; i < 5; i++){
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println(min);
    }
}
