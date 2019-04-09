/*
  Name:
  StudentNr:
 */

import Attractions.AnAttraction;
import Attractions.IAttraction;
import Tickets.Ticket;
import Tickets.Visitor;
import Tickets.Woman;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;


public class AmusementPark
{

    private static final int CHILD_AGE = 7;
    private List<Visitor> visitors;
    private String name;
    private List<AnAttraction> attractions;

    public AmusementPark(String name, List<AnAttraction> attractions)
    {
        this.name = name;
        this.visitors = new ArrayList<>();
        this.attractions = attractions;
    }

    public void addVisitor(Visitor visitor) {
        visitors.add(visitor);
    }

    public void addVisitors(List<Visitor> visitors) {
        Visitor cheapestVisitor = visitors.get(0);

        for (Visitor visitor : visitors) {
            Ticket newTicket = new Ticket(visitor);
            visitor.setTicket(newTicket);

            if (newTicket.getPrice() < cheapestVisitor.getTicket().getPrice()) {
                cheapestVisitor = visitor;
            }
            this.visitors.add(visitor);
        }

        if(visitors.size() >= 5) {
            cheapestVisitor.getTicket().setFreeTicket();
        }
    }

    /**
     * Assignment 2
     * @param date The date of which you want to know what attractions need to be serviced
     * @return a list of attractions that need to be serviced on the supplied date
     */
    public List<AnAttraction> getAttractionsToBeServiced(LocalDate date) {
        List<AnAttraction> attractionsToBeServiced = new ArrayList<>();
        for(AnAttraction attraction : attractions) {
            if(attraction.needsService(date)) {
                attractionsToBeServiced.add(attraction);
            }
        }
        return attractionsToBeServiced;
    }

    /**
     * Assignment 3, part 1
     * @param month the month of which the revenue must be calculated
     * @param year the year where the month is in
     * @return The revenue of the park in the specified month and year given
     */
    public int getRevenuePerMonth(Month month, Year year)
    {
        int ravenue = 0;
        for(Visitor visitor : visitors) {
            LocalDate ticketDate = visitor.getTicket().getPurchaseDate();
            if(ticketDate.getMonth().equals(month) &&  Year.of(ticketDate.getYear()).equals(year)) {
                ravenue += visitor.getTicket().getPrice();
            }
        }
        return ravenue;
    }

    /**
     * Assignment 3, part 2
     * @param month the month of which the number of children must be counted
     * @param year the year where the month is in
     * @return The amount of children that visited the park in the month and year given
     */
    public int getAmountOfChildrenPerMonth(Month month, Year year)
    {
        int amountOfChildren = 0;
        for(Visitor visitor : visitors) {
            if(visitor.getAge() <= CHILD_AGE) {
                // this visitor is a child
                LocalDate childTicketDate = visitor.getTicket().getPurchaseDate();
                if(childTicketDate.getMonth().equals(month) &&  Year.of(childTicketDate.getYear()).equals(year)) {
                    amountOfChildren++;
                }
            }
        }
        return amountOfChildren;
    }

    /**
     * Assignment 4
     * @return The average length of all the pregnant women that have visited the park
     */
    public double getAverageLengthOfPregnantWomen() {
        int totalPregnantWomens = 0;
        double avgLength = 0.0;
        for (Visitor visitor : visitors) {
            if(visitor instanceof Woman) {
                Woman womanVisitor = (Woman) visitor;
                if (womanVisitor.isPregnant()) {
                    avgLength += womanVisitor.getLength();
                    totalPregnantWomens++;
                }
            }
        }
        return avgLength / totalPregnantWomens;
    }

    /**
     * Assignment 5
     * @param visitor the visitor that needs the list of attractions
     * @return the list of attractions that are suitable for the supplied visitor
     */
    public List<IAttraction> getSuitableAttraction(Visitor visitor)
    {
        AttractionValidator attractionValidator = new AttractionValidator();
        List<IAttraction> suitableAttractions = new ArrayList<>();

        for (IAttraction attraction : attractions) {
            if (attractionValidator.validate(visitor, attraction)) {
                suitableAttractions.add(attraction);
            }
        }
        return suitableAttractions;
    }

    public List<Visitor> getVisitors() {
        return visitors;
    }
}
