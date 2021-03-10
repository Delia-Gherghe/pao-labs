package ro.unibuc.lab4.practising;

public class Example6 {

    public static void main(String[] args) {
        SubscriptionFactory configurator = new SubscriptionFactory();
        Subscription myChosenOne = configurator.configureSubscription("full");
        if(myChosenOne != null) {
            System.out.println(myChosenOne.getInvoice());
        } else {
            System.out.println("Please try with: plus/full/day");
        }
    }
}