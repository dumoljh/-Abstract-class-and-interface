package Transportation;

public class Car extends Transportation {

    @Override
    public void transportationCalc(int budget) {

        int carTotal;
        carTotal = budget - 500;

        if (carTotal >= 0) {
            System.out.println("You can ride the Car");
        } else {
            System.out.println("You cannot ride the Car");
        }
    }
}
