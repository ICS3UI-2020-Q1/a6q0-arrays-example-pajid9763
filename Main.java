import java.util.Scanner;
/**
 * program that finds your average grade
 * @author Darian
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // create the array for the grades to be stored
    double grades[] = new double[5];

    // get grades from the user and store them in an array
    for (int i = 0; i < grades.length; i++){
      System.out.println("Please enter grade " + (i + 1));
      grades[i] = input.nextDouble();
    }

    // create the sum for the running total of the grades 
    double sum = 0;

    // add up all of the grades into sum 
    for (int i = 0; i < grades.length; i++){
      sum = sum + grades[i];
    } 
    
    // determine the average grade and let the user know
    double average = sum/grades.length;
    System.out.println("Your average grade is " + average);
  }
}
