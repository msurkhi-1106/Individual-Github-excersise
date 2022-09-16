import java.util.Arrays;
public class SortingStrings{
    public static void main (String args[]){
        String[] stringArray = {"Liverpool", "Manchester", "Kelowna", "Toronto","Vancouver", "Leeds"};
        Arrays.sort (stringArray);
        System.out.println(Arrays.toString(stringArray));
    }
}