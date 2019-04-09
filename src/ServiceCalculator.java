import java.time.LocalDate;

public class ServiceCalculator implements ServiceIntervalCalculator {
    @Override
    public boolean needsService(LocalDate date) {
        return false;
    }

    @Override
    public boolean needsService() {
        return false;
    }
}
