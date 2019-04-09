package Attractions;

import java.time.LocalDate;

// DON'T Change anything in this file!

public interface ServiceIntervalCalculator {

    /**
     * Needs service for given date
     *
     * @param date The date where service is needed
     * @return true if this attraction needs service on date
     */
    boolean needsService(LocalDate date);

    /**
     * Needs service today
     *
     * @return true if this attraction needs service today
     */
    boolean needsService();
}
