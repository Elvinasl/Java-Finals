import Attractions.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Name:
 * StudentNr:
 */

public class Attraction {

    private final ServiceIntervalCalculator serviceIntervalCalculator;
    private List<IAttraction> attractions;

    /**
     * @param serviceIntervalCalculator The intervalcalculater
     */
    public Attraction(ServiceIntervalCalculator serviceIntervalCalculator) {
        this.serviceIntervalCalculator = serviceIntervalCalculator;
        this.attractions = getPossibleAttractions();

    }

    private List<IAttraction> getPossibleAttractions() {
        List<IAttraction> possibleAttractions = new ArrayList<>();
        possibleAttractions.add(new CasperGhost());
        possibleAttractions.add(new FloatingPoint());
        possibleAttractions.add(new JUnity());
        possibleAttractions.add(new Octabahn());
        possibleAttractions.add(new RiverIsEmpty());
        possibleAttractions.add(new SnakeByte());
        return possibleAttractions;
    }

    public List<IAttraction> getAttractions(){
        return attractions;
    }

}
