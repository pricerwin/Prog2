import java.util.Scanner;

public class Average {
    private int[] data = new int[5];
    private double mean;

    public Average(){
        for(int i=0; i<data.length; i++){
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Enter value #"+(i+1)+": ");
            data[i]=keyboard.nextInt();
        }

        selectionSort();
        calculateMean();
    }

    public void calculateMean(){
        double total=0;
        
        for(int i=0; i<data.length; i++){
            total+=data[i];
        }

        mean=(total/data.length);
    }

    public String toString(){
        String sentence="The test scores in "+"descending order are \n";

        for(int i=0; i<data.length; i++){
            sentence+=data[i]+"     ";
        }

        sentence+="\nThe average is "+mean;

        return sentence;
    }

    public void selectionSort(){
        for(int i=0; i<data.length; i++){
            int max=i;
            for(int j=i+1; j<data.length; j++){
                if(data[j]>data[max])
                    max=j;
            }
            int temp=data[max];
            data[max]=data[i];
            data[i]=temp;      
        }
    }
}
