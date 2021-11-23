package br.com.pfemeiros.cases;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public class Dates {

    public Boolean isUserUnderAge(LocalDate birthday) {
        // TODO implement
        return null;
    }

    // The warranty time is one year
    public Boolean isWarrantyExpired(LocalDate today, LocalDate startWarranty) {
        // TODO implement
        return null;
    }

    public Integer getDaysRemainingForBirthday(LocalDate today, LocalDate birthDay) {
        // TODO implement
        return 0;
    }

    public String formatDateByPattern(LocalDate date, String datePattern) {
        return "";
    }

    public String formatDateTimeByPattern(LocalDateTime date, String datePattern) {
        return "";
    }

}
