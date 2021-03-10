package ro.unibuc.lab4.abstractclasses;

public class ING extends Bank {

    @Override
    public int configureInterestRate() {
        interestRate = 7;
        return interestRate;
    }
}
