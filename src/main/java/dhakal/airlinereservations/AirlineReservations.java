/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package dhakal.airlinereservations;

/**
 *
 * @author tikad
 */
import java.util.Scanner;
import java.util.Arrays;
public class AirlineReservations {
 private static boolean []seatingChart = new boolean [10];
    public static void main(String[] args) {
      Scanner scanner = new Scanner (System.in);
      Arrays.fill (seatingChart, false);
      
      int passengers = 0;
      while (passengers <10){
         System.out.println ("Please type 1 for First class or 2 for Ecomony:");
         int section = scanner.nextInt();
         
         int seatNumber = assignSeat (section, scanner);
         
         if (seatNumber == -1){
             
             System.out.println ("Sorry, aLL Seats are full. Next flight leaves in 3 hours.");
             
         }
         else{
             String sectionName = (section == 1) ? "First class": "Economy";
             System.out.println ("Boarding pass:");
             System.out.println ("Section:" + sectionName);
             System.out.println ("Seat number:" + seatNumber);
             passengers ++;
         }
      
      }
       
      }

private static int assignSeat ( int section, Scanner scanner){
    int seatNumber = -1;
    if (section == 1){
        
        for (int i = 0; i < 5; i++){
            if (seatingChart [i] == false){
                
                seatingChart[i] = true;
                seatNumber = i + 1;
                break;
            }
            
        }
    }
    else if (section == 2){
        
        for (int i = 5; i < 10; i ++){
            if (seatingChart [i]==false){
                
                seatingChart[i] = true;
                seatNumber = i +1;
                break;
            }
        
    }
    if (seatNumber == -1){
      System.out.println("Economy section is full. Would you like to be placed in the first class section instead? (y/n)");
      String input = scanner.next();
      if (input.equalsIgnoreCase ("Y")){
          seatNumber = assignSeat (1, scanner);
          
      }
      else {
          
          System.out.println ("Next flight leave in 3 hours.");
      }
    
    }
    
    }
return seatNumber;
}



}
