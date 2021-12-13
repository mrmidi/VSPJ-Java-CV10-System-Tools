package pj.cv10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Faktura {
    LocalDate creation_date;
    LocalDate valid_to_date;
    DateTimeFormatter dtf;

    Faktura() {
        this.creation_date = LocalDate.now();
        this.valid_to_date = creation_date.plus(10, ChronoUnit.DAYS);
    }

    Faktura(LocalDate date) {
        this.creation_date = date;
        this.valid_to_date = this.creation_date.plusDays(10);
    }

    @Override
    public String toString() {
        dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Faktura od: " + this.creation_date.format(dtf) + "\nPlatnost do: " + this.valid_to_date.format(dtf);
    }
}
