package edu.slovak;
import edu.slovak.model.LowCost;
import edu.slovak.model.BusinessClass;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 *   Task: 6. Air fly : low-cost and business-class.
 *
 *
 *@version 1.0 [22] [06] [2020]
 * @author Vladyslav Zavada
 */
public class Main {

    public static void main(String[] args) {
        LowCost L1 = new LowCost ("Low1",7000);
        LowCost L2 = new LowCost ("Low2plus",6000);
        LowCost L3 = new LowCost ("Low3norm",4000);
        LowCost L4 = new LowCost ("Low4norm+)",5500);
        LowCost L5 = new LowCost ("Low5++",4800);

        BusinessClass LowerBusiness = new BusinessClass ("LowerBusiness",12000,2);
        BusinessClass LowerBusiness2 = new BusinessClass ("LowerBusiness2",15000,1);
        BusinessClass PLusBusiness = new BusinessClass ("PLusBusiness",17000,2);
        BusinessClass PLusBusiness2 = new BusinessClass ("PLusBusiness2",10000,3);
        BusinessClass BigBusiness = new BusinessClass ("BigBusiness",25000,1);

        List<IAccounting> tickets = new ArrayList<>();
        tickets.add(L1);
        tickets.add(L2);
        tickets.add(L3);
        tickets.add(L4);
        tickets.add(L5);

        tickets.add(LowerBusiness);
        tickets.add(LowerBusiness2);
        tickets.add(PLusBusiness);
        tickets.add(PLusBusiness2);
        tickets.add(BigBusiness);

// Calculate sum price tickets

        int ticket = tickets.stream().mapToInt(IAccounting::getTicket).sum();

// Find the highest price ticket

        IAccounting highestTickets = tickets.stream()
                .max(Comparator.comparingInt(IAccounting::getTicket)).
                        orElse(null);

// Find the lowest price ticket

        IAccounting lowestTicket = tickets.stream()
                .min(Comparator.comparingInt(IAccounting::getTicket)).
                        orElse(null);

// The average price ticket

        double avg = tickets.stream().mapToInt(IAccounting::getTicket)
                .average().orElse(0);

// Who get more price ticket, low-cost or business ticket

        int lowCostTicket = tickets.stream().filter(el -> el instanceof LowCost)
                .mapToInt(IAccounting::getTicket).sum();

        int businessClassTicket = tickets.stream().filter(el -> el instanceof BusinessClass)
                .mapToInt(IAccounting::getTicket).sum();

        if (lowCostTicket < businessClassTicket) {
            System.out.println("Low-cost ticket get greater price than business tickets." + lowCostTicket);
        } else if (businessClassTicket > lowCostTicket) {
            System.out.println("Business ticket get greater price than low-cost ticket." + businessClassTicket);
        }
    }
}
