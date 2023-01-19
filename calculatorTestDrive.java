import java.util.Scanner;
import java.text.*;

public class calculatorTestDrive{

  public static void main(String[] args){
    TimedExit exitTimer = new TimedExit();
    String[] arg = new String[0];
    Calculator calculator = new Calculator();
    addCalc add = new addCalc();
    subCalc sub = new subCalc();
    multiCalc multi = new multiCalc();
    divCalc div = new divCalc();

    String x;
    Scanner input = new Scanner(System.in);
    System.out.println("Do you need to add, multiply. subtract, or divide?");
    System.out.print("Please enter 'a', 'm', 's', or 'd': ");
    x = input.nextLine();

    if(x.equals("a") || x.equals("A")){
    calculator.Calc(add);}

    else if(x.equals("m") || x.equals("M")){
    calculator.Calc(multi);}

    else if(x.equals("s") || x.equals("S")){
    calculator.Calc(sub);}

    else if(x.equals("d") || x.equals("D")){
    calculator.Calc(div);}

    else if(x.equals("q") || x.equals("Q")){
    System.out.println(" ");
    System.out.println("The program will shut down automatically in 3 seconds...");
    exitTimer.TimedExit1();}

    else {
      System.out.println("");
      System.out.println("Invalid input, please try again. or enter 'q' to quit.");
      System.out.println("");
      main(arg);
    } 
  }
}
