package data;

import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataHelper {
    private DataHelper() {}
    public static Faker faker = new Faker(new Locale("en"));

    public static Card getApprovedCard() {
        return new Card("4444 4444 4444 4441", "04", "28", "Daria Krotova", "688");
    }

    public static Card getDeclinedCard() {
        return new Card("4444 4444 4444 4442", "04", "28", "Daria Krotova", "688");
    }
    public static Card getCardWithCardholderWithDash() {
        return new Card (generateCardNumber(), getShiftedMonth(0), getShiftedYear(2), "Daria Krotova-Yakusheva", generateCvcCode());
    }

    public static Card getCardWithNotNumber() {
        return new Card("", getShiftedMonth(0), getShiftedYear(2), generateCardholder(), generateCvcCode());
    }

    public static Card getCardWithNotMonth() {
        return new Card(generateCardNumber(), "", getShiftedYear(2), generateCardholder(), generateCvcCode());
    }

    public static Card getCardWithNotYear() {
        return new Card(generateCardNumber(), getShiftedMonth(0), "", generateCardholder(), generateCvcCode());
    }

    public static Card getCardWithNotCardholder() {
        return new Card(generateCardNumber(), getShiftedMonth(0), getShiftedYear(2), "", generateCvcCode());
    }

    public static Card getCardWithNotCvc() {
        return new Card(generateCardNumber(), getShiftedMonth(0), getShiftedYear(2), generateCardholder(), "");
    }

    public static Card getRandomValidData() {
        return new Card(generateIncompleteCardNumber(), getShiftedMonth(0), getShiftedYear(2), generateCardholder(), generateCvcCode());
    }

    public static Card getRandomInvalidData() {
        return new Card(generateIncompleteCardNumber(), getShiftedMonth(0), getShiftedYear(2), generateCardholder(), generateCvcCode());
    }

    public static Card getCardWithMonthLessThanCurrentMonth() {
        return new Card(generateCardNumber(), getShiftedMonth(-1), getShiftedYear(0), generateCardholder(), generateCvcCode());
    }

    public static Card getCardWithYearLessThanCurrentYear() {
        return new Card(generateCardNumber(), getShiftedMonth(0), getShiftedYear(-1), generateCardholder(), generateCvcCode());
    }

    public static Card getCardWithYearMore() {
        return new Card(generateCardNumber(), getShiftedMonth(0), getShiftedYear(6), generateCardholder(), generateCvcCode());
    }

    public static Card getCardWithCardholderByCyrillic() {
        return new Card(generateCardNumber(), getShiftedMonth(0), getShiftedYear(2), generateCardholderCyrillic(), generateCvcCode());
    }

    public static Card getCardWithCardholderBySpecialSymbol() {
        return new Card(generateCardNumber(), getShiftedMonth(0), getShiftedYear(2), generateCardholderWithSpecialSymbols(), generateCvcCode());
    }

    public static Card getCardWithCardholderByNumbers() {
        return new Card(generateCardNumber(), getShiftedMonth(0), getShiftedYear(2), generateCardholderWithNumbers(), generateCvcCode());
    }

    public static Card getCardWithIncompleteCvc() {
        return new Card(generateCardNumber(), getShiftedMonth(0), getShiftedYear(2), generateCardholder(), generateIncompleteCvcCode());
    }


    public static String generateCardNumber() {
        return (faker.numerify("#### #### #### ####"));
    }

    public static String generateIncompleteCardNumber() {
        return (faker.numerify("#### #### #### ##"));
    }

    public static String getShiftedMonth(int monthCount) {
        return LocalDate.now().plusMonths(monthCount).format(DateTimeFormatter.ofPattern("MM"));
    }

    public static String getShiftedYear(int yearCount) {
        return LocalDate.now().plusYears(yearCount).format(DateTimeFormatter.ofPattern("yy"));
    }

    public static String generateCardholder() {
        return (faker.name().firstName() + " " + faker.name().lastName());
    }

    public static String generateCardholderCyrillic() {
        Faker faker = new Faker(new Locale("ru"));
        return (faker.name().firstName() + " " + faker.name().lastName());
    }

    public static String generateCardholderWithSpecialSymbols() {
        return (faker.name().firstName() + "*?!%");
    }

    public static String generateCardholderWithNumbers() {
        return (faker.name().firstName() + "111");
    }

    public static String generateCvcCode() {
        return (faker.numerify("###"));
    }

    public static String generateIncompleteCvcCode() {

        return (faker.numerify("##"));
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Card {
        private String number;
        private String month;
        private String year;
        private String cardholder;
        private String cvc;
    }
}
