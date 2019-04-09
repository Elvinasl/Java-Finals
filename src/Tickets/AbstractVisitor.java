package Tickets;

/**
 * Name:
 * StudentNr:
 */

public abstract class AbstractVisitor implements Visitor
{

    private int length;
    private int age;
    private boolean isDisabled;
    private Ticket ticket;

    public AbstractVisitor(int length, int age, boolean isDisabled) {
        this.length = length;
        this.age = age;
        this.isDisabled = isDisabled;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public int getLength() {
        return length;
    }

    public int getAge() {
        return age;
    }

    public boolean isDisabled() {
        return isDisabled;
    }
}
