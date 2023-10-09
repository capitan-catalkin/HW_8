package page;

import com.codeborne.selenide.SelenideElement;
import page.components.CalendarComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {

    ///SelenideElements
    CalendarComponent calendar = new CalendarComponent();

    SelenideElement firstNameInput = $("#firstName"),
            lastNameInput =  $("#lastName"),
            userEmailInput =  $("#userEmail"),
            genderWrapper = $("#genterWrapper"),
            userNumberInput = $("#userNumber"),
            userDateOfBirth = $("#dateOfBirthInput"),
            subjectsInput =  $("#subjectsInput"),
            hobbiesInput = $("#hobbiesWrapper"),
            loadFile = $("#uploadPicture"),
            addressInpit = $("#currentAddress"),
            stateInput = $("#state"),
            stateCityWrapper = $("#stateCity-wrapper"),
            cityInput = $("#city"),
            submitButton = $("#submit"),
            responsive = $(".table-responsive");


    ///Actions
    public RegistrationPage openPage(){
        open("/automation-practice-form");
        return  this;
    }

    public RegistrationPage closeBanner() {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    public RegistrationPage setFirstName(String value) {
        firstNameInput.setValue(value);
        return  this;
    }


    public RegistrationPage setLastName(String value) {
        lastNameInput.setValue(value);
        return  this;
    }

    public RegistrationPage setEmail(String value) {
        userEmailInput.setValue(value);
        return  this;
    }

    public RegistrationPage setGender(String value) {
        genderWrapper.$(byText(value)).click();
        return  this;
    }

    public RegistrationPage setUserNumber(String value) {
        userNumberInput.setValue(value);
        return  this;
    }

    public RegistrationPage setDateOfBirth(String day, String month, String year) {
        userDateOfBirth.click();
        calendar.setDate(day, month, year);
        return  this;
    }

    public RegistrationPage setSubjects(String value) {
        subjectsInput.setValue(value).pressEnter();
        return  this;
    }

    public RegistrationPage setHobbies(String value) {
        hobbiesInput.$(byText(value)).click();
        return  this;
    }

    public RegistrationPage setLoadFile (String value) {
        loadFile.uploadFromClasspath(value);
        return  this;
    }

    public RegistrationPage setAddress(String value) {
        addressInpit.setValue(value);
        return this;
    }

    public RegistrationPage setState(String value) {
        stateInput.click();
        stateCityWrapper.$(byText(value)).click();
        return this;
    }

    public RegistrationPage setCity(String value) {
        cityInput.click();
        stateCityWrapper.$(byText(value)).click();
        return this;
    }

    public RegistrationPage setSubmit() {
        submitButton.click();
        return this;
    }

    public RegistrationPage checkResult(String key, String value) {
        responsive.$(byText(key)).parent()
                .shouldHave(text(value));
        return  this;
    }

}

