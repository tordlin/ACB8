package week2.day2;

/**
 * Created by Tordlin on 28/06/2015.
 */
public class MethodExample {
    public static void main(String[] args) {
        int res = sum(2,3);
        System.out.println(res);
    }

    public static int sum(int a, int b){
        int result = a + b;
        return result;
    }
}
