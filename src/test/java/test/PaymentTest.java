package test;

import com.codeborne.selenide.logevents.SelenideLogger;
import data.DataHelper;
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

    @AfterAll
    static void tearDownAll() {
        SelenideLogger.removeListener("allure");
    }

    /*Позитивные сценарии*/

    @DisplayName("№1 Оплата по карте 4444 4444 4444 4441 с вводом валидных данных")
    @Test
    void shouldOccurPaymentWithStatusApproved() {
        var dashboardPage = new DashboardPage();
        var payment = dashboardPage.openPaymentForm();
        payment.fillingFields(DataHelper.getApprovedCard());
        payment.waitSuccessfullyNotification();

        String expectedStatus = "APPROVED";
    }