package week3.hw;

import java.util.Scanner;

/**
 * Created by Tordlin on 11/07/2015.
 */

/*Написать метод, который проверяет является ли строка палиндромом*/

public class HW3 {
    public static void main(String[] args) {
        System.out.println("Enter word.");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        int partLength;
        String firstPart;
        String secondPart;
        int count = 0;


        if(word.length() % 2 == 0){
            System.out.println("Not a palindrom");
        }else{
            partLength = word.length() / 2 + 1;
            firstPart = word.substring(0,partLength);
            System.out.println(firstPart);
            secondPart = word.substring(partLength - 1,word.length());
            System.out.println(secondPart);

            for(int i = 0; i < firstPart.length(); i++){
                if(firstPart.charAt(i) == secondPart.charAt(firstPart.length() - 1 - i)){

                }else{
                    count++;
                }
            }
            if(count == 0){
                System.out.println("Palindrom!");
            }else{
                System.out.println("Not a palindrom");
            }
        }
    }
}
