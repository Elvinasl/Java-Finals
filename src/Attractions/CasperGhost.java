package Attractions;

import java.time.LocalDate;

public class CasperGhost extends AnAttraction {

    // no service needed
    public CasperGhost() {
        super(-1, 12, -1, false, true);
    }

    @Override
    public boolean needsService(LocalDate serviceDate) {
        return false;
    }

    @Override
    public boolean needsService() {
        return false;
    }
}
