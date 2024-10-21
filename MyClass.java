import java.io.File;
import java.util.Random;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
import java.util.Scanner;

public class MyClass {
  public static void main(String args[]) {
    String animalType = "Camel";
    String time = "4:37";
    Random temp = new Random();
    double min = 50.0;
    double max = 100.0;
    double randNum = temp.nextDouble();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm a");  
    LocalDateTime now = LocalDateTime.now();  
    double showTemp = min + (max - min) * randNum;
    System.out.println("Animal type: " + animalType);
    System.out.println("Current time: " + dtf.format(now));
    System.out.printf("Habitat temperature: %.2fF" ,showTemp);
      System.out.println();

    Scanner habby = new Scanner(System.in);
    System.out.println("Please enter the number of the habitat you would like to view: \n1. Hippo\n2. Camel\n3. Elephant\n4. Monkey");
    int hab = habby.nextInt();
    if (hab == 1)
        File file = new File("hippo.txt");
        try{
            Scanner fr = new Scanner(file);
            while(fr.hasNextLine()){
                String i = fr.nextLine();
                System.out.println(i);
            }
        } catch (Exception e){
            System.out.println("No file");
        }
    else if (hab == 2)
        File file = new File("camel.txt");
        try{
            Scanner fr = new Scanner(file);
            while(fr.hasNextLine()){
                String i = fr.nextLine();
                System.out.println(i);
            }
        } catch (Exception e){
            System.out.println("No file");
        }
    if (hab == 3)
        File file = new File("elephant.txt");
        try{
            Scanner fr = new Scanner(file);
            while(fr.hasNextLine()){
                String i = fr.nextLine();
                System.out.println(i);
            }
        } catch (Exception e){
            System.out.println("No file");
        }
    else if (hab == 4)
        File file = new File("monkey.txt");
        try{
            Scanner fr = new Scanner(file);
            while(fr.hasNextLine()){
                String i = fr.nextLine();
                System.out.println(i);
            }
        } catch (Exception e){
            System.out.println("No file");
        }
  }
}
