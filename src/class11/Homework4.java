package class11;

import java.util.Arrays;

public class Homework4 {
    public static void main(String[] args) {
        String[][] cars = {{"Lincoln", "Chevrolet", "GMC"},
                {"Audi", "BMW", "Mercedes",},
                {"Kia", "Hyundai", "Genesis"},
                {"Ferrari", "Lamborghini", "Maserati"}};
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("****************");
        for (String[] arr : cars) {
            for (String names : arr) {
                System.out.print(names + " ");
            }
            System.out.println();
        }
    }
}
