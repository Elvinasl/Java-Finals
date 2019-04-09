package Attractions;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class JUnity implements IAttraction {

    private int minAge = 6;
    private int maxAge = -1;
    private int minLength = 135;
    private boolean isForPregnant = false;
    private boolean isForDisabled = false;
    private DayOfWeek lastServiceMade = DayOfWeek.MONDAY;
    private DayOfWeek dayOfService = DayOfWeek.FRIDAY;


    @Override
    public int getMinAge() {
        return minAge;
    }

    @Override
    public int getMaxAge() {
        return maxAge;
    }

    @Override
    public int getMinLength() {
        return minLength;
    }

    @Override
    public boolean isForPregnant() {
        return isForPregnant;
    }

    @Override
    public boolean isForDisabled() {
        return isForDisabled;
    }

    @Override
    public DayOfWeek getServiceDay() {
        return dayOfService;
    }

//    @Override
//    public void serviceCompleted() {
//        lastServiceMade = LocalDate.now().getDayOfWeek();
//    }
}
