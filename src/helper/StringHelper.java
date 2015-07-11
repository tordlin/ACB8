package helper;

/**
 * Created by Tordlin on 11/07/2015.
 */
public class StringHelper {
    public static int[] findIndexSeparator(char[] word, String separator) {
        int[] index = new int[word.length];

        for (int i = 0; i < word.length; i++) {
            int counter = 0;
            if(separator.equals(word[i])){
                index[counter] = i;
                counter++;
            }
        }
        return index;
    }

    public static String[] takePartString(String word, int[] indexSeparator) {
        String[] parts = new String[word.length()/2];

        for (int i = 0; i < indexSeparator.length; i++) {
            if(i == indexSeparator.length - 1){
                parts[i] = word.substring(i,indexSeparator.length);
            }else{
                parts[i] = word.substring(i,i+1);
            }
        }
        return parts;
    }

    public static void printArrayOfString(String[] partString) {
        for(int i = 0; i < partString.length; i++){
            System.out.print(partString[i]);
        }
        System.out.println();
    }

    public static String findBiggerStringFromArray(String[] partString) {
        int indexMax = 0;
        int length = partString[0].length();

        for (int i = 1; i < partString.length; i++) {
            if(partString[i].length() > length){
                length = partString[i].length();
                indexMax = i;
            }
        }
        return partString[indexMax];
    }
}
