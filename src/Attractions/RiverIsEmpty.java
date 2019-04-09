package Attractions;

import java.time.DayOfWeek;

public class RiverIsEmpty implements IAttraction {

    private int minAge = -1;
    private int maxAge = 7;
    private int minLength = -1;
    private boolean isForPregnant = false;
    private boolean isForDisabled = true;
    private DayOfWeek dayOfService = DayOfWeek.SATURDAY;


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
}
