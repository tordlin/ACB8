package week1.hw1;

import java.util.Scanner;

/**
 * Created by Tordlin on 23/06/2015.
 */

/*4.5. ������ 2 �����. ���� ������ ����� ������ �������,
�� ������� �� ����� ������� �����. ���� ������ ������, �� ������� �����.*/

public class HW45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first value");
        int first = sc.nextInt();
        System.out.println("Enter second value");
        int second = sc.nextInt();

        if(first > second){
            System.out.println(first - second);
        }else if(second > first){
            System.out.println(first + second);
        }
    }
}
