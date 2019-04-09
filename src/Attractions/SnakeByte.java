package Attractions;

import java.time.DayOfWeek;

public class SnakeByte extends AnAttraction {

    private DayOfWeek dayOfService = DayOfWeek.MONDAY;

    public SnakeByte() {
        super(18, -1, 135, true, false);
    }
}
