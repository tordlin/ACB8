package week1.hw1;

import java.util.Scanner;

/**
 * Created by Tordlin on 23/06/2015.
 */

/*4.3. ������������ ������ �����. ������� �� ����� ��� ��������� ��������, ���� ����� ������� �� 7 ������.*/

public class HW43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        if(value % 7  == 0){
            System.out.println(value * value);
        }
    }
}
