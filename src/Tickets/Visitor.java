package Tickets;

/**
 * Name:
 * StudentNr:
 */

public interface Visitor
{
    public int getLength();
    public int getAge();
    public boolean isDisabled();
    Ticket getTicket();
    void setTicket(Ticket ticket);
}
