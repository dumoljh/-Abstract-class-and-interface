package Transportation;

public class Bus extends Transportation {

    @Override
    public void transportationCalc(int budget) {

        int busTotal;
        busTotal = budget - 300;

        if (busTotal >= 0) {
            System.out.println("You can ride the Bus");
        } else {
            System.out.println("You cannot ride the Bus");
        }
    }
}
