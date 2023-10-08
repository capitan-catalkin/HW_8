package tests;


import org.junit.jupiter.api.Test;
import page.RegistrationPage;


public class RegistrationTests extends TestBase{

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void fillFormTest(){

        registrationPage.openPage()
                        .setFirstName("Sergey")
                        .setLastName("Esenin")
                        .setEmail("esenin@mail.ru")
                        .setGender("Male")
                        .setUserNumber("1234567890")
                        .setDateOfBirth("21", "September", "1900")
                        .setSubjects("b")
                        .setHobbies("Reading")
                        .setLoadFile("cat1.jpg")
                        .setAddress("Konstantinovo")
                        .setState("Uttar Pradesh")
                        .setCity("Lucknow")
                        .setSubmit();


        registrationPage.checkResult("Student Name","Sergey Esenin")
                .checkResult("Student Email", "esenin@mail.ru")
                .checkResult("Gender", "Male")
                .checkResult("Mobile", "1234567890")
                .checkResult("Date of Birth", "21 September,1900")
                .checkResult("Subjects", "Biology")
                .checkResult("Hobbies", "Reading")
                .checkResult("Picture", "cat1.jpg")
                .checkResult("Address", "Konstantinovo")
                .checkResult("State and City", "Uttar Pradesh Lucknow");
    }
}
