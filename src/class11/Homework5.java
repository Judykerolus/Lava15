package class11;

public class Homework5 {
    public static void main(String[] args) {
        String[][] shoppingL = {{"Tomatoes", "Lettuce", "Carrots"},
                {"Apples", "Bananas", "Oranges",},
                {"Milk", "Yogurt", "Cheese"},
                {"Chocolate", "Cake", "Candy"}};
        for (int i = 0; i < shoppingL.length; i++) {
            for (int j = 0; j < shoppingL[i].length; j++) {
                System.out.print(shoppingL[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("****************");
        for (String[] arr : shoppingL) {
            for (String names : arr) {
                System.out.print(names + " ");
            }
            System.out.println();
        }
    }
}
