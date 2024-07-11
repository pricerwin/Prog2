public class Area {
    public static double getArea(double radius){
        double area;
        area=(3.14159)*(radius)*(radius);
        return area;
    }

    public static double getArea(double length, double width){
        double area;
        area=length*width;
        return area;
    }

    public static double getArea(double base1, double base2, double height){
        double area;
        area=((base1+base2)*height)/2;
        return area;
    }

    public static void main(String[] args){
        System.out.printf("%.2f",getArea(3.0));
        System.out.println();
        System.out.printf("%.1f",getArea(2.0, 4.0));
        System.out.println();
        System.out.printf("%.1f",getArea(3.0, 4.0, 5.0));
    }
}
