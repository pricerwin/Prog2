import java.util.Scanner;

public class ArrayOperationPt2 {
    public static void main(String[] args){
        //create Scanner object...
        Scanner keyboard = new Scanner(System.in);

        //create string...
        int[][] sales = new int[3][4];

        //Prompt the user to enter a value for each quarter for 3 years...
        for(int i=0; i<3; i++){
            System.out.println("Year "+(i+1)+":");
            for(int j=0; j<4; j++){
                sales[i][j]=keyboard.nextInt();
            }
        }
        
        //Calculate sales for year 1...
        int yr1Sales = 0;

        for(int i=0; i<4; i++){
            yr1Sales+=sales[0][i];
        }

        System.out.println("Year 1 total sales: "+yr1Sales);

        //Calculate sales for year 2...
        int yr2Sales = 0;

        for(int i=0; i<4; i++){
            yr2Sales+=sales[1][i];
        }

        System.out.println("Year 2 total sales: "+yr2Sales);

        //Calculate sales for year 3...
        int yr3Sales = 0;

        for(int i=0; i<4; i++){
            yr3Sales+=sales[2][i];
        }

        System.out.println("Year 3 total sales: "+yr3Sales);

        //Calculate total quarter 1 sales...
        int q1Sales = 0;

        for(int i=0; i<3; i++){
            q1Sales+=sales[i][0];
        }

        System.out.println("Quarter 1 total sales: "+q1Sales);

        //Calculate total quarter 2 sales...
        int q2Sales = 0;

        for(int i=0; i<3; i++){
            q2Sales+=sales[i][1];
        }

        System.out.println("Quarter 2 total sales: "+q2Sales);

        //Calculate total quarter 3 sales...
        int q3Sales = 0;

        for(int i=0; i<3; i++){
            q3Sales+=sales[i][2];
        }

        System.out.println("Quarter 3 total sales: "+q3Sales);

        //Calculate total quarter 4 sales...
        int q4Sales = 0;

        for(int i=0; i<3; i++){
            q4Sales+=sales[i][3];
        }

        System.out.println("Quarter 4 total sales: "+q4Sales);

        //Finding and printing highest sales value in array...
        int highest = 0;

        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                if(sales[i][j] > highest){
                    highest=sales[i][j];
                }
                else
                    continue;
            }
        }

        System.out.println("Highest sales: "+highest);

        //Finding and printing lowest sales value in array...
        int lowest = sales[0][0];

        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                if(sales[i][j] < lowest){
                    lowest=sales[i][j];
                }
                else
                    continue;
            }
        }

        System.out.println("Lowest sales: "+lowest);
    }
}
