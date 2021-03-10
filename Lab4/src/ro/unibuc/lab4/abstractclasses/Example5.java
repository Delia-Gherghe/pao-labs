package ro.unibuc.lab4.abstractclasses;

public class Example5 {

    public static void main(String[] args) {

        Bank b;
        b = new ING();
        b.configureInterestRate();
        b.displayInterestRate();

        b = new BCR();
        b.configureInterestRate();
        b.displayInterestRate();
    }
}
