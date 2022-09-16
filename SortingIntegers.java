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
        for (int i = 0; i <intArray.length; i++) {     
          for (int j = i+1; j <intArray.length; j++) {     
              if(intArray[i] >intArray[j]) {      //swap elements if not in order
                 temp = intArray[i];    
                 intArray[i] = intArray[j];    
                 intArray[j] = temp;    
               }     
            }     
        }    
        //print sorted array    
        System.out.println("\nArray sorted in ascending order: ");    
        for (int i = 0; i <intArray.length; i++) {     
            System.out.print(intArray[i] + " ");    
        }    
    }    
}    