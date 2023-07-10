package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;

public class DashboardPage {
    private SelenideElement heading = $$("h2").find(exactText("Путешествие дня"));
    private SelenideElement paymentButton = $$("button").find(exactText("Купить"));
    private SelenideElement creditButton = $$("button").find(exactText("Купить в кредит"));

    public DashboardPage() {
        heading.shouldBe(visible);
    }

    public PaymentPage openPaymentForm() {
        paymentButton.click();
        return new PaymentPage();
    }

    public CreditPage openCreditForm() {
        creditButton.click();
        return new CreditPage();
    }
}
