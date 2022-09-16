import java.util.Random;
public class SortingIntegers {    
    public static void main(String[] args) {        
        //define original array  
        Random rd = new Random();   
        int [] intArray = new int [5] ;     
        int temp = 0;    
 
        //print original array    
       System.out.println("Original array: ");    
       for (int i = 0; i <intArray.length; i++) { 
           intArray[i] = rd.nextInt();     
           System.out.print(intArray[i] + " ");    
        }    
        //Sort the array in ascending order using two for loops    
        
    }    
}    