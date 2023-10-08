package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxPage {
    SelenideElement fullName = $("#userName"),
    emailInput =  $("#userEmail"),
    currentAddressInput = $("#currentAddress"),

    permanentAddressInput = $("#permanentAddress"),
    buttonSubmit = $("#submit");

    public TextBoxPage openPage() {
        open("/text-box");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    public TextBoxPage setFullName(String value) {
        fullName.setValue(value);
        return  this;
    }

    public TextBoxPage setEmail(String value) {
        emailInput.setValue(value);
        return  this;
    }

    public TextBoxPage setCurrent(String value) {
        currentAddressInput.setValue(value);
        return  this;
    }

    public TextBoxPage setPermanent(String value) {
        permanentAddressInput.setValue(value);
        return  this;
    }

    public TextBoxPage setSubmit() {
        buttonSubmit.click();
        return  this;
    }

    public TextBoxPage checkResult(String key, String value) {
        $("#output").$(byText(key))
                .shouldHave(text(value));
        return  this;
    }

}
