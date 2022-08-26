package Transportation;

public class Main {
    public static void main(String[] args) {

        int budget = 500;

        Car car = new Car();
        Bus bus = new Bus();
        Plain plain = new Plain();
        Train train = new Train();

        car.transportationCalc(budget);
        bus.transportationCalc(budget);
        plain.transportationCalc(budget);
        train.transportationCalc(budget);

    }
}
