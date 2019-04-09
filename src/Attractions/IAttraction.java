package Attractions;

import java.time.DayOfWeek;

public interface IAttraction {
    public int getMinAge();
    public int getMaxAge();
    public int getMinLength();
    public boolean isForPregnant();
    public boolean isForDisabled();
    public DayOfWeek getServiceDay();
}
