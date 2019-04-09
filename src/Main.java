import Attractions.*;
import Tickets.Man;
import Tickets.Ticket;
import Tickets.Visitor;
import Tickets.Woman;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<IAttraction> possibleAttractions = new ArrayList<>();
        possibleAttractions.add(new CasperGhost());
        possibleAttractions.add(new FloatingPoint());
        possibleAttractions.add(new JUnity());
        possibleAttractions.add(new Octabahn());
        possibleAttractions.add(new RiverIsEmpty());
        possibleAttractions.add(new SnakeByte());

        AmusementPark amusementPark = new AmusementPark("Elvis park", possibleAttractions);


        Man man = new Man(180, 17, false);
        Woman woman = new Woman(150, 19, true, false);
        Woman woman1 = new Woman(160, 20, true, false);

        Ticket ticket1 = new Ticket(man);
        man.setTicket(ticket1);

        Ticket ticket2 = new Ticket(woman);
        woman.setTicket(ticket2);


        List<Visitor> multipleVisitors = new ArrayList<>();
        multipleVisitors.add(man);
        multipleVisitors.add(woman);
        multipleVisitors.add(woman1);

        amusementPark.addVisitors(multipleVisitors);


        amusementPark.getSuitableAttraction(woman).size();

        amusementPark.addVisitor(woman);
        amusementPark.addVisitor(woman1);
        amusementPark.getAverageLengthOfPregnantWomen();

        amusementPark.getAttractionsToBeServiced(LocalDate.of(2019, 4, 8));

    }
}
