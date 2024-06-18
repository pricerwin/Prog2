import java.util.Scanner;

/**
   This program demonstrates static methods
*/

public class Geometry
{
   public static void main(String[] args)
   {
      int choice;       // The user's choice
      double value = 0; // The method's return value
      char letter;      // The user's Y or N decision
      double radius;    // The radius of the circle
      double length;    // The length of the rectangle
      double width;     // The width of the rectangle
      double height;    // The height of the triangle
      double base;      // The base of the triangle
      double side1;     // The first side of the triangle
      double side2;     // The second side of the triangle
      double side3;     // The third side of the triangle

      // Create a scanner object to read from the keyboard
      Scanner keyboard = new Scanner(System.in);

      // The do loop allows the menu to be displayed first
      do
      {
         // TASK #1 Call the printMenu method
         printMenu();

         choice = keyboard.nextInt();

         switch(choice)
         {
            case 1:
               System.out.print("Enter the radius of " +
                                "the circle: ");
               radius = keyboard.nextDouble();

               // TASK #3 Call the circleArea method and
               // store the result in the value variable
               value=circleArea(radius);

               System.out.println("The area of the " +
                                  "circle is " + value);
               break;
            case 2:
               System.out.print("Enter the length of " +
                                "the rectangle: ");
               length = keyboard.nextDouble();
               System.out.print("Enter the width of " +
                                "the rectangle: ");
               width = keyboard.nextDouble();

               // TASK #3 Call the rectangleArea method and
               // store the result in the value variable
               value=rectangleArea(length, width);

               System.out.println("The area of the " +
                                  "rectangle is " + value);
               break;
            case 3:
               System.out.print("Enter the height of " +
                                "the triangle: ");
               height = keyboard.nextDouble();
               System.out.print("Enter the base of " +
                                "the triangle: ");
               base = keyboard.nextDouble();

               // TASK #3 Call the triangleArea method and
               // store the result in the value variable
               value=triangleArea(base, height);

               System.out.println("The area of the " +
                                  "triangle is " + value);
               break;
            case 4:
               System.out.print("Enter the radius of " +
                                "the circle: ");
               radius = keyboard.nextDouble();

               // TASK #3 Call the circumference method and
               // store the result in the value variable
               value=circleCircumference(radius);

               System.out.println("The circumference " +
                                  "of the circle is " +
                                  value);
               break;
            case 5:
               System.out.print("Enter the length of " +
                                "the rectangle: ");
               length = keyboard.nextDouble();
               System.out.print("Enter the width of " +
                                "the rectangle: ");
               width = keyboard.nextDouble();

               // TASK #3 Call the perimeter method and
               // store the result in the value variable
               value=rectanglePerimeter(length, width);

               System.out.println("The perimeter of " +
                                  "the rectangle is " +
                                  value);
               break;
            case 6:
               System.out.print("Enter the length of " +
                                "side 1 of the " +
                                "triangle: ");
               side1 = keyboard.nextDouble();
               System.out.print("Enter the length of " +
                                "side 2 of the " +
                                "triangle: ");
               side2 = keyboard.nextDouble();
               System.out.print("Enter the length of " +
                                "side 3 of the " +
                                "triangle: ");
               side3 = keyboard.nextDouble();

               // TASK #3 Call the perimeter method and
               // store the result in the value variable
               value=trianglePerimeter(side1, side2, side3);

               System.out.println("The perimeter of " +
                                  "the triangle is " +
                                  value);
               break;
            default:
               System.out.println("You did not enter " +
                                  "a valid choice.");
         }
         keyboard.nextLine(); // Consume the new line

         System.out.println("Do you want to exit " +
                            "the program (Y/N)?: ");
         String answer = keyboard.nextLine();
         letter = answer.charAt(0);

      } while(letter != 'Y' && letter != 'y');
   }

   // TASK #1 Create the printMenu method here
   public static void printMenu(){
      System.out.println("This is a geometry calculator");
      System.out.println("Choose what you would like to calculate");
      System.out.println("1. Find the area of the circle");
      System.out.println("2. Find the area of the rectangle");
      System.out.println("3. Find the area of the triangle");
      System.out.println("4. Find the circumference of a circle");
      System.out.println("5. Find the perimeter of a rectangle");
      System.out.println("6. Find the perimeter of a triangle");
      System.out.print("Enter the number of your choice: ");
   }
   //The method above prints out the menu to the user and asks them what they want to do.
   //This method doesn't require anything to call because it has no parameters. It also returns nothing because it is of type void.

   // TASK #2 Create the value-returning methods here
   public static double circleArea(double radius){
      double area;
      area=(3.14)*(radius*radius);
      return area;
   }
   //The method above calculates the area of the circle.
   //This method requires you to pass a double as the radius for the circle, then it returns a double value as the area.

   public static double rectangleArea(double length, double width){
      double area;
      area=length*width;
      return area;
   }
   //the method above calculates the Area of a rectangle.
   //This method requires you too pass 2 doubles (height & length) into it when called, and returns a double value as the area.
   
   public static double triangleArea(double base, double height){
      double area;
      area=(base*height)/2;
      return area;
   }
   //The method above calculates the area of a triangle.
   //This method requires you to pass it 2 doubles (base & height) into it when called, and returns a double as the area.

   public static double circleCircumference(double radius){
      double circumference;
      circumference=(3.14)*(2*radius);
      return circumference;
   }
   //The method above calculates the circumference of a circle.
   //This method requires you to pass it a double as the radius into it when called, and returns a double as the circumference.

   public static double rectanglePerimeter(double length, double width){
      double perimeter;
      perimeter=(2*length)+(2*width);
      return perimeter;
   }
   //The method above calculates the perimeter of a rectangle.
   //This method requires you to pass in 2 doubles when you call it. Then it returns a double as the perimeter.

   public static double trianglePerimeter(double side1, double side2, double side3){
      double perimeter;
      perimeter=side1+side2+side3;
      return perimeter;
   }
   //This method calculates the perimeter of a triangle.
   //This method requires you to pass in 3 doubles, one for each side of the triangle. Then it returns a double as the perimeter.


   // TASK #4 Write javadoc comments for each method
}