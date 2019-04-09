package Attractions;

import java.time.DayOfWeek;
import java.time.LocalDate;

public abstract class AnAttraction implements IAttraction {
    private int minAge;
    private int maxAge;
    private int minLength;
    private boolean isForPregnant;
    private boolean isForDisabled;

    public AnAttraction(int minAge, int maxAge, int minLength, boolean isForPregnant, boolean isForDisabled) {
        this.minAge = minAge;
        this.maxAge = maxAge;
        this.minLength = minLength;
        this.isForPregnant = isForPregnant;
        this.isForDisabled = isForDisabled;
    }

    @Override
    public int getMinAge() {
        return this.minAge;
    }

    @Override
    public int getMaxAge() {
        return this.maxAge;
    }

    @Override
    public int getMinLength() {
        return this.minLength;
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
    public LocalDate needsService() {
        return null;
    }
}