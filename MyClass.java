import java.util.Random;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;   
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
  }
}
