package ro.unibuc.proiect;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        PlatformService service = new PlatformService();
        String[] eventTypes = {"VIP", "GENERAL", "EARLY"};
        Random rand = new Random();
        Event[] events = service.initEvents(5);
        for (Event e : events){
            System.out.println(e);
            System.out.println();
        }

        Client[] clients = service.initClients(3);
        for (Client c : clients){
            System.out.println(c);
            System.out.println();
        }

        for(Event e : events){
            clients[1].buyTicket(e, eventTypes[rand.nextInt(eventTypes.length)]);
        }

        System.out.println(clients[1]);
        Arrays.sort(clients[1].getTickets());
        System.out.println(clients[1]);
    }
}
