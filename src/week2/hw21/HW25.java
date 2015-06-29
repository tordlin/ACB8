package week2.hw21;

/**
 * Created by Tordlin on 29/06/2015.
 */

/*2.5 Заменить в строке все символы 'a' на '@' и вывести новую строку // "array is a data type" -> "@rr@y is @ d@t@ type"*/

public class HW25 {
    public static void main(String[] args) {
        String word = "abacad";
        char check = 'a';
        char replace = '@';

        String res = word;

        /*for(int i = 0; i < length; i++){
            if(word.charAt(i) == check){
                System.out.print(replace);
            }else{
                System.out.print(word.charAt(i));
            }
        }*/

        for(int i = 0; i < res.length(); i++){
            if(res.charAt(i) == check){
                if(i == 0) {
                    res = replace + res.substring(1);
                }else if(i == res.length() - 1){
                    res = res.substring(0, i) + replace;
                }else{
                    res = res.substring(0, i) + replace + res.substring(i + 1);
                }
            }
        }

        System.out.println(res);

    }
}
