public class Car {
    String model;
    int year;


    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }


    public void drive() {
        if (year > 2020) {
            System.out.println("Машина " + model + " (" + year + ") едет!");
        } else {
            System.out.println("Машина " + model + " (" + year + ") НЕ едет!");
        }
    }

    public static void main(String[] args) {

        Car car1 = new Car("Toyota Camry", 2020);
        Car car2 = new Car("Honda Accord", 2018);


        car1.drive();
        car2.drive();


        car1.model = "Ford Mustang";
        car1.year = 2022;
        car2.model = "BMW X5";
        car2.year = 2021;


        car1.drive();
        car2.drive();
    }
}
