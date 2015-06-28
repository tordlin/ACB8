package week2.day1;

/**
 * Created by Tordlin on 27/06/2015.
 */
public class Array {
    public static void main(String[] args) {
        int[] mainArray = new int[6];
        int value;

        for(int i = 0; i < 5; i++){
            value = (int)(Math.random() * 10);
            if(value % 2 == 0 && i % 2 == 0){
                mainArray[i] = value;
            }else if(value % 2 != 0 && i % 2 == 0){
                mainArray[i] = value * 2;
            }else if(value % 2 != 0 && i % 2 != 0){
                mainArray[i] = value;
            }else if(value % 2 == 0 && i % 2 != 0){
                mainArray[i] = value + 1;
            }
        }

        /*for(int i = 0; i < 5; i++){
            value = (int)(Math.random() * 10);
            //System.out.println(value);
            if(value % 2 == 0 && i % 2 == 0){
                mainArray[i] = value;
            }else if(value % 2 == 0 && i % 2 != 0){
                mainArray[i + 1] = value;
            }else if(value % 2 != 0 && i % 2 != 0){
                mainArray[i] = value;
            }else if(value % 2 != 0 && i % 2 == 0){
                mainArray[i + 1] = value;
            }
        }*/

        for(int i = 0; i < 5; i++){
            System.out.println(mainArray[i]);
        }


    }
}
