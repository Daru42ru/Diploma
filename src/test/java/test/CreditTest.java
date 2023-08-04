package test;

import com.codeborne.selenide.logevents.SelenideLogger;
import data.DataHelper;
import data.DBHelper;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;
import page.DashboardPage;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditTest {

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
    void shouldOccurCreditWithStatusApproved() {
        var dashboardPage = new DashboardPage();
        var credit = dashboardPage.openCreditForm();
        credit.fillingFields(DataHelper.getApprovedCard());
        credit.waitSuccessfullyNotification();

        String expectedStatus = "APPROVED";
        String actualStatus = DBHelper.getCreditStatus();
        assertEquals(expectedStatus, actualStatus);
    }

    @Test
    void shouldNotOccurCreditWithStatusDeclined() {
        var dashboardPage = new DashboardPage();
        var credit = dashboardPage.openCreditForm();
        credit.fillingFields(DataHelper.getDeclinedCard());
        credit.waitErrorNotification();

        String expectedStatus = "DECLINED";
        String actualStatus = DBHelper.getCreditStatus();
        assertEquals(expectedStatus, actualStatus);
    }
    @Test
    void shouldOccurCreditWithCardholderWithDash() {
        var dashboardPage = new DashboardPage();
        var payment = dashboardPage.openPaymentForm();
        payment.fillingFields(DataHelper.getCardWithCardholderWithDash());
        payment.waitSuccessfullyNotification();

        String expectedStatus = "APPROVED";
        String actualStatus = DBHelper.getPaymentStatus();
        assertEquals(expectedStatus, actualStatus);
    }

    @Test
    void shouldShowAnErrorWhenCreditWithNotFilledCardNumber() {
        var dashboardPage = new DashboardPage();
        var credit = dashboardPage.openCreditForm();
        credit.fillingFields(DataHelper.getCardWithNotNumber());
        credit.waitWrongFormatError();
    }

    @Test
    void shouldShowAnErrorWhenCreditWithNotFilledMonth() {
        var dashboardPage = new DashboardPage();
        var credit = dashboardPage.openCreditForm();
        credit.fillingFields(DataHelper.getCardWithNotMonth());
        credit.waitWrongFormatError();
    }

    @Test
    void shouldShowAnErrorWhenCreditWithNotFilledYear() {
        var dashboardPage = new DashboardPage();
        var credit = dashboardPage.openCreditForm();
        credit.fillingFields(DataHelper.getCardWithNotYear());
        credit.waitWrongFormatError();
    }

    @Test
    void shouldShowAnErrorWhenCreditWithNotFilledCardholder() {
        var dashboardPage = new DashboardPage();
        var credit = dashboardPage.openCreditForm();
        credit.fillingFields(DataHelper.getCardWithNotCardholder());
        credit.waitRequiredFieldError();
    }

    @Test
    void shouldShowAnErrorWhenCreditWithNotFilledCvc() {
        var dashboardPage = new DashboardPage();
        var credit = dashboardPage.openCreditForm();
        credit.fillingFields(DataHelper.getCardWithNotCvc());
        credit.waitWrongFormatError();
    }

    @Test
    void shouldShowAnErrorWhenCreditByRandomValidCard() {
        var dashboardPage = new DashboardPage();
        var credit = dashboardPage.openCreditForm();
        credit.fillingFields(DataHelper.getRandomValidData());
        credit.waitErrorNotification();
    }

    @Test
    void shouldShowAnErrorWhenCreditWithIncompleteCardNumber() {
        var dashboardPage = new DashboardPage();
        var credit = dashboardPage.openCreditForm();
        credit.fillingFields(DataHelper.getRandomInvalidData());
        credit.waitWrongFormatError();
    }

    @Test
    void shouldShowAnErrorWhenCreditWithMonthLessThanCurrentMonthForCurrentYear() {
        var dashboardPage = new DashboardPage();
        var credit = dashboardPage.openCreditForm();
        credit.fillingFields(DataHelper.getCardWithMonthLessThanCurrentMonth());
        credit.waitCardExpirationDateError();
    }

    @Test
    void shouldShowAnErrorWhenCreditWithYearLessThanCurrentYear() {
        var dashboardPage = new DashboardPage();
        var credit = dashboardPage.openCreditForm();
        credit.fillingFields(DataHelper.getCardWithYearLessThanCurrentYear());
        credit.waitCardExpiredError();
    }

    @Test
    void shouldShowAnErrorWhenCreditWithYearMoreBySixYearsThanCurrentYear() {
        var dashboardPage = new DashboardPage();
        var credit = dashboardPage.openCreditForm();
        credit.fillingFields(DataHelper.getCardWithYearMore());
        credit.waitCardExpirationDateError();
    }

    @Test
    void shouldShowAnErrorWhenCreditWithCardholderByCyrillic() {
        var dashboardPage = new DashboardPage();
        var credit = dashboardPage.openCreditForm();
        credit.fillingFields(DataHelper.getCardWithCardholderByCyrillic());
        credit.waitWrongFormatError();
    }

    @Test
    void shouldShowAnErrorWhenCreditWithCardholderBySpecialSymbol() {
        var dashboardPage = new DashboardPage();
        var credit = dashboardPage.openCreditForm();
        credit.fillingFields(DataHelper.getCardWithCardholderBySpecialSymbol());
        credit.waitWrongFormatError();
    }

    @Test
    void shouldShowAnErrorWhenCreditWithCardholderByNumbers() {
        var dashboardPage = new DashboardPage();
        var credit = dashboardPage.openCreditForm();
        credit.fillingFields(DataHelper.getCardWithCardholderByNumbers());
        credit.waitWrongFormatError();
    }

    @Test
    void shouldShowAnErrorWhenCreditWithIncompleteCvc() {
        var dashboardPage = new DashboardPage();
        var credit = dashboardPage.openCreditForm();
        credit.fillingFields(DataHelper.getCardWithIncompleteCvc());
        credit.waitWrongFormatError();
    }
}
