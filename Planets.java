import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * class Planets.
 * @author  BenHilderman
 * @version 1.0
 * @since 2020-03-15 
 */

public class Planets {

  // Variables
  static String planetOrder;
  static int counter;

  /**
  * This prints all 8 planets in correct order.
  */

  public static void main(String[] args) {

    double[][] differentPlanets = new double[8][1];


    for (int planet = 0; planet < differentPlanets.length; planet++) {
      System.out.print("Planet " + (planet + 1) + " :");
  
      if (counter == 0) {
        planetOrder = "Mercury";
      }
      
      if (counter == 1) {
        planetOrder = "Venus";
      }
  
      if (counter == 2) {
        planetOrder = "Earth";
      }
  
      if (counter == 3) {
        planetOrder = "Mars";
      }
  
      if (counter == 4) {
        planetOrder = "Jupiter";
      }
  
      if (counter == 5) {
        planetOrder = "Saturn";
      }
  
      if (counter == 6) {
        planetOrder = "Uranus";
      }
  
      if (counter == 7) {
        planetOrder = "Neptune";
      }
      
      for (double assignment: differentPlanets[planet]) {
        System.out.print(" " + planetOrder);

      }

      System.out.println();
      counter = counter + 1;

    }

  }

}