package Attractions;

import java.time.DayOfWeek;

public class JUnity extends AnAttraction {

    private DayOfWeek lastServiceMade = DayOfWeek.MONDAY;
    private DayOfWeek dayOfService = DayOfWeek.FRIDAY;


    public JUnity() {
        super(6, -1, 135, false, true);
    }

//    @Override
//    public void serviceCompleted() {
//        lastServiceMade = LocalDate.now().getDayOfWeek();
//    }
}
