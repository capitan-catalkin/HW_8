package tests;

import org.junit.jupiter.api.Test;
import page.TextBoxPage;

public class TextBoxTest extends TestBase{
    TextBoxPage textBoxPage = new TextBoxPage();

    @Test
    void successfulFormAll(){
        textBoxPage.openPage()
                .setFullName("Full Name")
                .setEmail("qqqq@mail.ru")
                .setCurrent("Current Address")
                .setPermanent("Permanent Address")
                .setSubmit();

        textBoxPage.checkResult("Name:", "Full Name")
                .checkResult("Email:", "qqqq@mail.ru")
                .checkResult("Current Address :", "Current Address")
                .checkResult("Permananet Address :", "Permananet Address");



    }

}
