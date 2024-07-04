import java.util.Scanner;
import java.io.*;

public class ArrayOperations {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        int[] intArray = new int[10];
        
        //Putting values into the array...
        System.out.println("Enter 10 integers greater than 0:");
        
        for(int i=0; i<intArray.length; i++){
            intArray[i]=keyboard.nextInt();
        }

        //Printing the values of the array...
        System.out.print("Array Elements: ");
        
        for(int i=0; i<intArray.length; i++){
            System.out.print(intArray[i]+" ");
        }

        //Totaling and printing the sum of the array...
        int sum = 0;

        for(int i=0; i<intArray.length; i++){
            sum+=intArray[i];
        }

        System.out.println();
        System.out.println("Sum of Array Elements: "+sum);

        //Finding and printing the highest value of the array...
        //This was a hard part, it took me some time on how I should approach it
        int highest = 0;

        for(int i=0; i<intArray.length; i++){
            if(intArray[i]>highest){
                highest=intArray[i];
            }
            else{
                continue;
            }
        }

        System.out.println("Highest value: "+highest);

        //Finding and printing the lowest value of the array...
        //This was a hard part, it took me some time on how I should approach it
        int lowest = intArray[0];

        for(int i=0; i<intArray.length; i++){
            if(intArray[i]<lowest){
                lowest=intArray[i];
            }
            else{
                continue;
            }
        }

        System.out.println("Lowest value: "+lowest);
    }
}
