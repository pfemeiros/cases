package br.com.pfemeiros.cases;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DatesTest {

    @InjectMocks
    private Dates dates;

    @Test
    void checkUnderAgeUser_shouldReturnTrue() {
        var birthday = LocalDate.of(2010, 11, 11);
        boolean isUnderAge = dates.isUserUnderAge(birthday);
        assertTrue(isUnderAge);
    }

    @Test
    void checkOfAgeUser_shouldReturnFalse() {
        var birthday = LocalDate.of(1997, 11, 11);
        boolean isUnderAge = dates.isUserUnderAge(birthday);
        assertFalse(isUnderAge);
    }

    @Test
    void checkExpiredWarranty_shouldReturnTrue() {
        LocalDate today = LocalDate.of(2021, 11, 23);
        LocalDate warrantyStart = LocalDate.of(2021, 11, 22);
        Boolean isExpired = dates.isWarrantyExpired(today, warrantyStart);
        assertTrue(isExpired);
    }

    @Test
    void checkActiveWarranty_shouldReturnFalse() {
        LocalDate today = LocalDate.of(2021, 11, 23);
        LocalDate warrantyStart = LocalDate.of(2021, 11, 23);
        Boolean isExpired = dates.isWarrantyExpired(today, warrantyStart);
        assertFalse(isExpired);
    }

    @Test
    void checkDaysRemaining_shouldReturnThirtyDays() {
        LocalDate today = LocalDate.of(2021, 11, 23);
        LocalDate birthday = LocalDate.of(2021, 12, 23);
        Integer daysRemainingForBirthday = dates.getDaysRemainingForBirthday(today, birthday);
        assertEquals(30, daysRemainingForBirthday);
    }

    @Test
    void checkDateFormat_shouldReturnBrazilianPattern() {
        LocalDate today = LocalDate.of(2021, 11, 23);
        String dateInBrazilianFormat = dates.formatDateByPattern(today, "dd-MM-yyyy");
        assertEquals("23-11-2021", dateInBrazilianFormat);
    }

    @Test
    void checkDateFormat_shouldReturnAmericanPattern() {
        LocalDate today = LocalDate.of(2021, 11, 23);
        String dateInBrazilianFormat = dates.formatDateByPattern(today, "yyyy-MM-dd");
        assertEquals("2021-11-23", dateInBrazilianFormat);
    }

    @Test
    void checkDateTimeFormat_shouldReturnPatternWithTime() {
        LocalDateTime now = LocalDateTime.of(2021, 11, 23, 8, 58, 10);
        String dateInBrazilianFormat = dates.formatDateTimeByPattern(now, "HH:mm dd.MM.yyyy");
        assertEquals("08:58 23-11-2021", dateInBrazilianFormat);
    }

}
