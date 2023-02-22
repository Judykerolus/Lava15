package project3;

public abstract class Car {
    double carPrice;
    String carColor;
    Car(double carPrice, String carColor) {
        this.carPrice = carPrice;
        this.carColor = carColor;
    }
    abstract double calculateSalePrice();
}
class Truck extends Car {
    double weight;

    Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight = weight;
    }

    @Override
    double calculateSalePrice() {
        double discount = (carPrice * 10) / 100;
        double discount1 = (carPrice * 20) / 100;
        if (weight > 2000) {
            System.out.println("The sale price of Truck " + carColor + " is $" + discount);
            return discount;
        } else {
            System.out.println("The sale price of Truck " + carColor + " is $" + discount1);
            return discount1;
        }
    }
}

    class Sedan extends Car {
        double length;

        Sedan(double carPrice, String carColor, double length) {
            super(carPrice, carColor);
            this.length = length;
        }

        double calculateSalePrice() {
            double discount = (carPrice * 5) / 100;
            double discount1 = (carPrice * 10) / 100;
            if (length > 20) {
                System.out.println("The sale price of Sedan " + carColor + " is $" + discount);
                return discount;
            } else {
                System.out.println("The sale price of Sedan " + carColor + " is $" + discount1);
                return discount1;
            }
        }

    public static void main(String[] args) {
        Car[] cars={new Truck(15000.00,"Silver",80.5),new Sedan(10000.00,"Red",12)};
        for (Car c:cars){
            c.calculateSalePrice();
        }
    }
}
