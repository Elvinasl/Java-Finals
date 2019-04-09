package Attractions;

import java.time.LocalDate;

public class Octabahn extends AnAttraction {

    // every two days
    private LocalDate lastServiceMade = null;

    public Octabahn() {
        super(6, 12, -1, false, false);
    }

    @Override
    public boolean needsService(LocalDate serviceDate) {
        // returns true if given date is the date for service
        return serviceDate.equals(LocalDate.of(getDateOfService().getYear(), getDateOfService().getMonth(), getDateOfService().getDayOfMonth()));
    }

    @Override
    public boolean needsService() {
        return LocalDate.now().equals(getDateOfService());
    }

    private LocalDate getDateOfService() {
        if(lastServiceMade == null) {
            // service was never done, do it now
            serviceCompleted();
        }
        // last day of service + 2 days
        return lastServiceMade.plusDays(2);
    }

    private void serviceCompleted() {
        lastServiceMade = LocalDate.now();
    }
}
