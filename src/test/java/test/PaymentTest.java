package test;

import com.codeborne.selenide.logevents.SelenideLogger;
import data.DataHelper;
import data.DBHelper;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;
import page.DashboardPage;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaymentTest {

    @BeforeAll
    static void setUpAll() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @BeforeEach
    void setUp() {
        open("http://localhost:8080");
    }

    @BeforeEach
    void cleanDatabase() {
        DBHelper.cleanDatabase();
    }

    @AfterAll
    static void tearDownAll() {
        SelenideLogger.removeListener("allure");
    }

    @Test
    void shouldOccurPaymentWithStatusApproved() {
        var dashboardPage = new DashboardPage();
        var payment = dashboardPage.openPaymentForm();
        payment.fillingFields(DataHelper.getApprovedCard());
        payment.waitSuccessfullyNotification();

        String expectedStatus = "APPROVED";
        String actualStatus = DBHelper.getPaymentStatus();
        assertEquals(expectedStatus, actualStatus);
    }

    @Test
    void shouldNotOccurPaymentWithStatusDeclined() {
        var dashboardPage = new DashboardPage();
        var payment = dashboardPage.openPaymentForm();
        payment.fillingFields(DataHelper.getDeclinedCard());
        payment.waitErrorNotification();

        String expectedStatus = "DECLINED";
        String actualStatus = DBHelper.getPaymentStatus();
        assertEquals(expectedStatus, actualStatus);
    }
    @Test
    void shouldOccurPaymentWithCardholderWithDash() {
        var dashboardPage = new DashboardPage();
        var payment = dashboardPage.openPaymentForm();
        payment.fillingFields(DataHelper.getCardWithCardholderWithDash());
        payment.waitSuccessfullyNotification();

        String expectedStatus = "APPROVED";
        String actualStatus = DBHelper.getPaymentStatus();
        assertEquals(expectedStatus, actualStatus);
    }


    @Test
    void shouldShowAnErrorWhenPaymentWithNotFilledCardNumber() {
        var dashboardPage = new DashboardPage();
        var payment = dashboardPage.openPaymentForm();
        payment.fillingFields(DataHelper.getCardWithNotNumber());
        payment.waitWrongFormatError();
    }

    @Test
    void shouldShowAnErrorWhenPaymentWithNotFilledMonth() {
        var dashboardPage = new DashboardPage();
        var payment = dashboardPage.openPaymentForm();
        payment.fillingFields(DataHelper.getCardWithNotMonth());
        payment.waitWrongFormatError();
    }

    @Test
    void shouldShowAnErrorWhenPaymentWithNotFilledYear() {
        var dashboardPage = new DashboardPage();
        var payment = dashboardPage.openPaymentForm();
        payment.fillingFields(DataHelper.getCardWithNotYear());
        payment.waitWrongFormatError();
    }

    @Test
    void shouldShowAnErrorWhenPaymentWithNotFilledCardholder() {
        var dashboardPage = new DashboardPage();
        var payment = dashboardPage.openPaymentForm();
        payment.fillingFields(DataHelper.getCardWithNotCardholder());
        payment.waitRequiredFieldError();
    }

    @Test
    void shouldShowAnErrorWhenPaymentWithNotFilledCvc() {
        var dashboardPage = new DashboardPage();
        var payment = dashboardPage.openPaymentForm();
        payment.fillingFields(DataHelper.getCardWithNotCvc());
        payment.waitWrongFormatError();
    }

    @Test
    void shouldShowAnErrorWhenPaymentByRandomValidCard() {
        var dashboardPage = new DashboardPage();
        var payment = dashboardPage.openPaymentForm();
        payment.fillingFields(DataHelper.getRandomValidData());
        payment.waitErrorNotification();
    }

    @Test
    void shouldShowAnErrorWhenPaymentWithIncompleteCardNumber() {
        var dashboardPage = new DashboardPage();
        var payment = dashboardPage.openPaymentForm();
        payment.fillingFields(DataHelper.getRandomInvalidData());
        payment.waitWrongFormatError();
    }

    @Test
    void shouldShowAnErrorWhenPaymentWithMonthLessThanCurrentMonthForCurrentYear() {
        var dashboardPage = new DashboardPage();
        var payment = dashboardPage.openPaymentForm();
        payment.fillingFields(DataHelper.getCardWithMonthLessThanCurrentMonth());
        payment.waitCardExpirationDateError();
    }

    @Test
    void shouldShowAnErrorWhenPaymentWithYearLessThanCurrentYear() {
        var dashboardPage = new DashboardPage();
        var payment = dashboardPage.openPaymentForm();
        payment.fillingFields(DataHelper.getCardWithYearLessThanCurrentYear());
        payment.waitCardExpiredError();
    }
    @Test
    void shouldShowAnErrorWhenPaymentWithYearMoreThanCurrentYear() {
        var dashboardPage = new DashboardPage();
        var payment = dashboardPage.openPaymentForm();
        payment.fillingFields(DataHelper.getCardWithYearLessThanCurrentYear());
        payment.waitCardExpiredError();
    }


    @Test
    void shouldShowAnErrorWhenPaymentWithCardholderByCyrillic() {
        var dashboardPage = new DashboardPage();
        var payment = dashboardPage.openPaymentForm();
        payment.fillingFields(DataHelper.getCardWithCardholderByCyrillic());
        payment.waitWrongFormatError();
    }

    @Test
    void shouldShowAnErrorWhenPaymentWithCardholderBySpecialSymbol() {
        var dashboardPage = new DashboardPage();
        var payment = dashboardPage.openPaymentForm();
        payment.fillingFields(DataHelper.getCardWithCardholderBySpecialSymbol());
        payment.waitWrongFormatError();
    }

    @Test
    void shouldShowAnErrorWhenPaymentWithCardholderByNumbers() {
        var dashboardPage = new DashboardPage();
        var payment = dashboardPage.openPaymentForm();
        payment.fillingFields(DataHelper.getCardWithCardholderByNumbers());
        payment.waitWrongFormatError();
    }

    @Test
    void shouldShowAnErrorWhenPaymentWithIncompleteCvc() {
        var dashboardPage = new DashboardPage();
        var payment = dashboardPage.openPaymentForm();
        payment.fillingFields(DataHelper.getCardWithIncompleteCvc());
        payment.waitWrongFormatError();
    }
}