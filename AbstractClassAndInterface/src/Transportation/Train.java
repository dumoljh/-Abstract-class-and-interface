package Transportation;

public class Train extends Transportation {

    @Override
    public void transportationCalc(int budget) {
        int trainTotal;
        trainTotal = budget - 400;

        if (trainTotal >= 0) {
            System.out.println("You can ride the Train");
        } else {
            System.out.println("You cannot ride the Train");
        }
    }
}
