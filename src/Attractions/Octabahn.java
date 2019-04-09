package Attractions;

import java.time.DayOfWeek;

public class Octabahn implements IAttraction {

    private int minAge = 6;
    private int maxAge = 12;
    private int minLength = -1;
    private boolean isForPregnant = false;
    private boolean isForDisabled = false;
//    private DayOfWeek dayOfService = DayOfWeek.values(1, 2, 3);


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
        return null;
    }
}
