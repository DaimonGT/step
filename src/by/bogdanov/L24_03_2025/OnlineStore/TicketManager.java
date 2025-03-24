package by.bogdanov.L24_03_2025.OnlineStore;

import java.util.*;

public class TicketManager {
    private List<Ticket> soldTickets = new ArrayList<>();

    public void sellTicket(String name, TicketType type) {
        Ticket ticket = new Ticket(name, type);
        soldTickets.add(ticket);
    }

    public void printAllSales() {
        for (Ticket soldTicket : soldTickets) {
            System.out.println(soldTicket.getType());
        }
    }

    public Map<TicketType, Long> countByType() {
        Map<TicketType, Long> saleTickets = new EnumMap<>(TicketType.class);
        for (Ticket soldTicket : soldTickets) {
            saleTickets.put(soldTicket.getType(), saleTickets.getOrDefault(soldTicket.getType(), 0L) + 1);
        }
        return saleTickets;
    }

    public int totalRevenue() {
        int totalEarnMoney = 0;
        for (Ticket soldTicket : soldTickets) {
            totalEarnMoney += soldTicket.getType().getPrice();
        }
        return totalEarnMoney;
    }

    public Set<String> getVIPBuyers(){
        Set<String> names = new HashSet<>();
        for (Ticket soldTicket : soldTickets) {
            if(TicketType.VIP == soldTicket.getType()) {
                names.add(soldTicket.getBuyerName());
            }
        }
        return names;
    }
}

