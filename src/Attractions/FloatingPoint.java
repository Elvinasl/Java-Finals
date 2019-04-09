package Attractions;

import java.time.LocalDate;

public class FloatingPoint extends AnAttraction {

    // every three days
    private LocalDate lastServiceMade = null;

    public FloatingPoint() {
        super(16, -1, -1, false, true);
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
        // last day of service + 3 days
        return lastServiceMade.plusDays(3);
    }

    private void serviceCompleted() {
        lastServiceMade = LocalDate.now();
    }
}
