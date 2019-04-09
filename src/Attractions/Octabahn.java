package Attractions;

import java.time.LocalDate;

public class Octabahn extends AnAttraction {

    // every two days
    private LocalDate lastServiceMade = null;

    private void serviceCompleted() {
        lastServiceMade = LocalDate.now();
    }


    public Octabahn() {
        super(6, 12, -1, false, false);
    }

    @Override
    public LocalDate needsService(LocalDate serviceDate) {
        if(lastServiceMade == null) {
            // service was never done, do it now
            serviceCompleted();
        }

        // last day of service + 3 days
        LocalDate dateOfService = lastServiceMade.plusDays(3);
        return LocalDate.of(dateOfService.getYear(), dateOfService.getMonth(), dateOfService.getDayOfMonth());
    }
}
