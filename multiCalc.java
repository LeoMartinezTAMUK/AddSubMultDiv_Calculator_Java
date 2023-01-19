import java.util.Scanner;
import java.text.*;

public class multiCalc extends Calculator{

  DecimalFormat df = new DecimalFormat("#.##");

  public void calculate(){
  double fnum, snum, total;
  Scanner multiply = new Scanner(System.in);
  System.out.print("Enter the first number: ");
  fnum = multiply.nextDouble();
  System.out.print("Enter the second number: ");
  snum = multiply.nextDouble();
  total = fnum * snum;
  System.out.println("Your total is: " + df.format(total));
  System.exit(0);
  }

}
