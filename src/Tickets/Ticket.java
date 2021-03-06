package Tickets;

import java.time.LocalDate;

/**
 * Name:
 * StudentNr:
 */

public class Ticket
{
    public static final int ADULT_PRICE = 25;
    private static final int CHILDREN_PRICE = 15;
    private static final int SHORT_PERSON_PRICE = 10;

    private static final int ADULT_AGE = 18;
    private static final int SHORT_PERSON = 135; //CM


    private int price;
    private LocalDate purchaseDate;

    public Ticket(Visitor visitor) {

        this.price = calcPrice(visitor.getLength(), visitor.getAge());
        this.purchaseDate = LocalDate.now();
    }

    private int calcPrice(int length, int age) {
        if (length <= SHORT_PERSON) {
            return SHORT_PERSON_PRICE;
        }

        if(age < ADULT_AGE) {
            return CHILDREN_PRICE;
        }
        return ADULT_PRICE;
    }

    public void setFreeTicket() {
        price = 0;
    }

    public int getPrice() {
        return price;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }
}
