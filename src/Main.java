public class Main {
    public static void main(String[] args) {
        Bicycle[] bicycles = {
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 2)
        };
        Car[] cars = {
                new Car("car1", 4),
                new Car("car2", 4)
        };
        Truck[] trucks = {
                new Truck("truck1", 6),
                new Truck("truck2", 8)
        };

        ServiceStation station = new ServiceStation();
        for (Bicycle bicycle : bicycles) {
            station.check(bicycle);
        }
        for (Car car : cars) {
            station.check(car);
        }
        for (Truck truck : trucks) {
            station.check(truck);
        }
    }
}