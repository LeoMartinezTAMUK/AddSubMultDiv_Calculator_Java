import java.util.Scanner;
import java.text.*;

public class addCalc extends Calculator{

    DecimalFormat df = new DecimalFormat("#.##");

    public void calculate(){
    double fnum, snum, total;
    Scanner addition = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    fnum = addition.nextDouble();
    System.out.print("Enter the second number: ");
    snum = addition.nextDouble();
    total = fnum + snum;
    System.out.println("Your total is: " + df.format(total));
    System.exit(0);
    }

}
