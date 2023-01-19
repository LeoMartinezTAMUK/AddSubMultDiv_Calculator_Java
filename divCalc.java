import java.util.Scanner;
import java.text.*;

public class divCalc extends Calculator{

  DecimalFormat df = new DecimalFormat("#.##");

  public void calculate(){
  double fnum, snum, total;
  Scanner divide = new Scanner(System.in);
  System.out.print("Enter the first number: ");
  fnum = divide.nextDouble();
  System.out.print("Enter the second number: ");
  snum = divide.nextDouble();
  total = fnum / snum;
  System.out.println("Your total is: " + df.format(total));
  System.exit(0);
  }

}
