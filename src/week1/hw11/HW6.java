package week1.hw11;

import java.util.Scanner;

/**
 * Created by Tordlin on 27/06/2015.
 */

/*� ��� ���� �������� � ���������, �� ����� ����� �� �������� � ���� ����������*/

public class HW6 {
    public static void main(String[] args) {
        System.out.println("Enter v and s");
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int s = sc.nextInt();

        System.out.println("Time = " + s / v);
    }
}
