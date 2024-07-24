package Steps;

import io.cucumber.java.ParameterType;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParameterTypes {
    @ParameterType(".*")
    public LocalDate date(String stringDate) throws Throwable {
        return LocalDate.parse(stringDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
