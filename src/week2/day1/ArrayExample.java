package week2.day1;

/**
 * Created by Tordlin on 27/06/2015.
 */
public class ArrayExample {
    public static void main(String[] args) {
        //data_type[] name = new data_type[array_size];

        int[] powerUsages = new int[5];

        System.out.println(powerUsages[0]);

        powerUsages[1] = 11;

        powerUsages[2] = (int)(Math.random() * 300);
        powerUsages[3] = (int)(Math.random() * 300);
        powerUsages[4] = (int)(Math.random() * 300);
    }
}
