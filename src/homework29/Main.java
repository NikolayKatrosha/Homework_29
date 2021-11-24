package homework29;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please:");
        System.out.println("1) write your system (Celsius, Kelvin, Fahrenheit)");
        System.out.println("2) how many degrees");
        System.out.println("3) choose one of the  system in which do you want to convert(Celsius, Kelvin, Fahrenheit)");
        String yourDegrees = in.next();
        double yourInput = in.nextDouble();
        String yourChoose = in.next();
        if (Objects.equals(yourDegrees, "Celsius")){
          if(Objects.equals(yourChoose, "Kelvin")){

          }
          else{
              Converter converter = new Converter();
          }
        }
    }
}
