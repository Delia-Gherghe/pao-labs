package ro.unibuc.lab4.abstractclasses;

public class BCR extends Bank {

    private String salut;

    @Override
    public int configureInterestRate() {
        interestRate = 8;
        return interestRate;
    }
}
