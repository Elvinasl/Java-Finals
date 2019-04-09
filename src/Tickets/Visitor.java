package Tickets;

/**
 * Name:
 * StudentNr:
 */

public interface Visitor
{
    int getLength();
    int getAge();
    boolean isDisabled();
    Ticket getTicket();
    void setTicket(Ticket ticket);
}
