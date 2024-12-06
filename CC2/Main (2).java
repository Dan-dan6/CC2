
public class Main {
    public static void main(String[] args) {
        
        // Decalre and determine the dimension of the Garden
        double length = 20.0; 
        double width = 10.0; 

        //Formula of the calculation of the Length and width
        double area = length * width;
        double perimeter = 2 * (length + width);

        //Prints the over all output         
        System.out.println("Garden Length: " + length + " meters");
        System.out.println("Garden Width: " + width + " meters");
        System.out.println("Area of the Garden: " + area + " square meters");
        System.out.println("Perimeter of the Garden: " + perimeter + " meters");
    }
}
