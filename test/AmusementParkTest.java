/*
  Name:
  StudentNr:
 */

import Attractions.*;
import Tickets.Man;
import Tickets.Ticket;
import Tickets.Woman;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;


public class AmusementParkTest
{
    private AmusementPark amusementPark;
    private static final Year THIS_YEAR = Year.of(LocalDate.now().getYear());
    private static final Month THIS_MONTH = LocalDate.now().getMonth();
    /**
     * Default constructor for test class AmusementParkTest
     */
    public AmusementParkTest()
    {
        List<AnAttraction> possibleAttractions = new ArrayList<>();
        possibleAttractions.add(new CasperGhost());
        possibleAttractions.add(new FloatingPoint());
        possibleAttractions.add(new JUnity());
        possibleAttractions.add(new Octabahn());
        possibleAttractions.add(new RiverIsEmpty());
        possibleAttractions.add(new SnakeByte());

        this.amusementPark = new AmusementPark("Elvis park", possibleAttractions);
    }

    @BeforeEach
    public void setUp()
    {

    }

    @AfterEach
    public void tearDown()
    {
    }

    @Test
    /*
      Assignment 6, Part 1
     */
    void getAverageLengthOfPregnantWomenTest()
    {
        Woman woman1 = new Woman(140, 18, true, false);
        Woman woman2 = new Woman(150, 18, true, false);
        Woman woman3 = new Woman(160, 18, true, false);

        amusementPark.addVisitor(woman1);
        amusementPark.addVisitor(woman2);
        amusementPark.addVisitor(woman3);

        Ticket ticket = new Ticket(woman1);
        woman1.setTicket(ticket);

        Ticket ticket2 = new Ticket(woman2);
        woman2.setTicket(ticket2);

        Ticket ticket3 = new Ticket(woman3);
        woman3.setTicket(ticket3);

        assert (amusementPark.getAverageLengthOfPregnantWomen() == 150);
    }

    @Test
    /*
      Assignment 6, Part 2
     */
    void getSuitableAttractionTest()
    {
        Man man = new Man(180, 17, true);

        Ticket ticket1 = new Ticket(man);
        man.setTicket(ticket1);

        amusementPark.addVisitor(man);

        assert (amusementPark.getSuitableAttraction(man).size() == 4);
    }

    @Test
    void addVisitorTest()
    {
        Woman woman = new Woman(150, 19, true, false);

        Ticket ticket2 = new Ticket(woman);
        woman.setTicket(ticket2);

        amusementPark.addVisitor(woman);

        assert (amusementPark.getVisitors().size() == 1);
    }

    @Test
    void getAttractionsToBeServicedTest()
    {
        assert (amusementPark.getAttractionsToBeServiced(LocalDate.of(2019, 4, 8)).size() == 1);
    }

    @Test
    void getRevenuePerMonthTest()
    {
        Man men1 = new Man(180, 22, false);
        Man men2 = new Man(190, 33, false);

        Ticket ticket = new Ticket(men1);
        men1.setTicket(ticket);

        Ticket ticket2 = new Ticket(men2);
        men2.setTicket(ticket2);

        amusementPark.addVisitor(men1);
        amusementPark.addVisitor(men2);

        assert (amusementPark.getRevenuePerMonth(THIS_MONTH, THIS_YEAR) == 50);
    }

    @Test
    void getAmountOfChildrenPerMonthTest()
    {
        Woman woman1 = new Woman(160, 5, false, false);
        Woman woman2 = new Woman(160, 6, false, true);

        Ticket ticket3 = new Ticket(woman1);
        woman1.setTicket(ticket3);

        Ticket ticket4 = new Ticket(woman2);
        woman2.setTicket(ticket4);

        amusementPark.addVisitor(woman1);
        amusementPark.addVisitor(woman2);

        assert (amusementPark.getAmountOfChildrenPerMonth(THIS_MONTH, THIS_YEAR) == 2);
    }
}
