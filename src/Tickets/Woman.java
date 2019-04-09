package Tickets;

/**
 * Name:
 * StudentNr:
 */

public class Woman extends AbstractVisitor
{
    private boolean isPregnant;

    public Woman(int length, int age, boolean isPregnant, boolean isDisabled) {
        super(length, age, isDisabled);
        this.isPregnant = isPregnant;
    }

    public boolean isPregnant() {
        return isPregnant;
    }
}
