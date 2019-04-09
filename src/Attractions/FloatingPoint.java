package Attractions;

import java.time.LocalDate;

public class FloatingPoint extends AnAttraction {

    // every three days
    private LocalDate lastServiceMade = null;

    private void serviceCompleted() {
        lastServiceMade = LocalDate.now();
    }

    public FloatingPoint() {
        super(16, -1, -1, false, true);
    }

    @Override
    public LocalDate needsService(LocalDate serviceDate) {
        if(lastServiceMade == null) {
            // service was never done, do it now
            serviceCompleted();
            return LocalDate.now();
        }

        // last day of service + 2 days
        LocalDate dateOfService = lastServiceMade.plusDays(2);
        return LocalDate.of(dateOfService.getYear(), dateOfService.getMonth(), dateOfService.getDayOfMonth());
    }
}
