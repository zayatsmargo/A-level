package hw6;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(200 , "Petrol");
        Engine engine1 = new Engine(300,"Petrol");
        Car car = new Car("Italia", engine, "White");
        Car car1 = new Car("Germany",engine1,"Black");
        car.setColor("White");
        car.setManufacturer(Manufacturer.ITALIA.getRussianName());
        car.setPetrol(40);
        car1.setPetrol(50);
        car1.setManufacturer(Manufacturer.GERMANY.getRussianName());
        car1.setColor("Black");
        System.out.println(car.toString());
        System.out.println(car1.toString());
        car.startEngine("Audi");
        Garage.checkCar(car);
        Garage.checkCar(car1);

    }
}



