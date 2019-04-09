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
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class AmusementParkTest
{
    private AmusementPark amusementPark;
    /**
     * Default constructor for test class AmusementParkTest
     */
    public AmusementParkTest()
    {
        List<IAttraction> possibleAttractions = new ArrayList<>();
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
        fail("This test is not implemented yet!");
    }

    @Test
    void getAmountOfChildrenPerMonthTest()
    {

//        Woman woman1 = new Woman(160, 20, true, false);
//        Woman woman2 = new Woman(160, 15, false, true);
//
//        Ticket ticket3 = new Ticket(woman1);
//        woman1.setTicket(ticket3);
//
//        Ticket ticket4 = new Ticket(woman2);
//        woman2.setTicket(ticket4);
        fail("This test is not implemented yet!");
    }
}
