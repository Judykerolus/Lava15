package class12;

import java.util.Scanner;

public class Car {
    // inside the class the sequence doesn't matter as long as it comes before the method
  String make;
  String model;
  String color;
  int year;

  void moveForward(){
      System.out.println("Car is moving forward");}// this is method
    void applyBrakes(){
        System.out.println("Applying the brakes");
        System.out.println("Car stopped");

    }
}
