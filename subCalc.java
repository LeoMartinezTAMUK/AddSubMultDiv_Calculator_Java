import java.util.Scanner;
import java.text.*;

public class subCalc extends Calculator{

  DecimalFormat df = new DecimalFormat("#.##");

  public void calculate(){
  double fnum, snum, total;
  Scanner subtract = new Scanner(System.in);
  System.out.print("Enter the first number: ");
  fnum = subtract.nextDouble();
  System.out.print("Enter the second number: ");
  snum = subtract.nextDouble();
  total = fnum - snum;
  System.out.println("Your total is: " + df.format(total));
  System.exit(0);
  }

}
