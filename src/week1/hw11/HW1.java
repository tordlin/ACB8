package week1.hw11;

import java.util.Scanner;

/**
 * Created by Tordlin on 27/06/2015.
 */

/*������ � ���������� �������� ���� ������ ������������ a, b � c � ������-
����, �������� �� �� �������������. ����� ������� � ���� ���������.*/

public class HW1 {
    public static void main(String[] args) {
        System.out.println("Enter a, b, c");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if( c * c == (a * a) + (b * b)){
            System.out.println("Right triangle");
        }
    }
}
