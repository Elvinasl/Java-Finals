import Attractions.IAttraction;
import Tickets.Visitor;
import Tickets.Woman;

public class AttractionValidator {
    private Visitor visitor;
    private IAttraction attraction;

    private boolean isMinAgeValid() {
        if (attraction.getMinAge() == -1) {
            return true;
        }
        return visitor.getAge() >= attraction.getMinAge();
    }

    private boolean isMaxAgeValid() {
        if (attraction.getMaxAge() == -1) {
            return true;
        }
        return attraction.getMaxAge() <= visitor.getAge();
    }

    private boolean isLengthValid() {
        if (attraction.getMinLength() == -1) {
            return true;
        }
        return attraction.getMinLength() <= visitor.getLength();
    }

    private boolean isForPregnant() {
        if(visitor instanceof Woman) {
            Woman womanVisitor = (Woman) visitor;
            return attraction.isForPregnant() || !womanVisitor.isPregnant();
        }
        return true;
    }

    private boolean isForDisabled() {
        return !visitor.isDisabled() || attraction.isForDisabled();
    }

    public boolean validate(Visitor visitor, IAttraction attraction) {
        this.visitor = visitor;
        this.attraction = attraction;
        return isForDisabled() && isForPregnant() && isLengthValid() && isMaxAgeValid() && isMinAgeValid();
    }
}
