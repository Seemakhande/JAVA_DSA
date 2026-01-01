import java.util.Scanner;
public class Gst {
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the amount of pen: ");
        float pen=sc.nextInt();
        System.out.print("Enter the amount of pencil: ");
        float pencil=sc.nextInt();
        System.out.print("Enter the amount of eraser: ");
        float eraser=sc.nextInt();
        float total=pen+pencil+eraser;
        float gst=total*0.18f;
        System.out.println("The total GST is: "+gst);

    }
    
}
