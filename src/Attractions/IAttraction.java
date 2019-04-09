package Attractions;

import java.time.LocalDate;

public interface IAttraction {

    public LocalDate needsService(LocalDate serviceDate);
    public int getMinAge();
    public int getMaxAge();
    public int getMinLength();
    public boolean isForPregnant();
    public boolean isForDisabled();
}
