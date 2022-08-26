package Transportation;

public class Plain extends Transportation{

    @Override
    public void transportationCalc(int budget) {

        int plaintTotal;
        plaintTotal = budget - 1000;

        if (plaintTotal >= 0) {
        System.out.println("You can ride the Plain");
    } else {
        System.out.println("You cannot ride the Plain");
    }

    }
}
