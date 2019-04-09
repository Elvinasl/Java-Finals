package Attractions;

import java.time.DayOfWeek;

public class FloatingPoint implements IAttraction {

    private int minAge = 16;
    private int maxAge = -1;
    private int minLength = -1;
    private boolean isForPregnant = false;
    private boolean isForDisabled = true;


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
        // every two days
        return DayOfWeek.of(2);
    }
}
