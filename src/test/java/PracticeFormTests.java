import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormTests extends TestBase {



    @Test
    void testPracticeForm() {

        open("/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        $("#firstName").setValue("Max");
        $("#lastName").setValue("Power");
        $("#userEmail").setValue("mp@mail.ru");
        $("#gender-radio-1+label").click();
        $("#userNumber").setValue("7999123456");
        $("#dateOfBirth #dateOfBirthInput").click();
        $(".react-datepicker__month-select").click();
        $(".react-datepicker__month-select").selectOption("May");
        $(".react-datepicker__month-select").click();
        $(".react-datepicker__year-select").click();
        $(".react-datepicker__year-select").selectOption("1982");
        $(".react-datepicker__year-select").click();
        $(".react-datepicker__day--008").click();
        $("#subjectsInput").setValue("Economics").pressEnter();
        $("#hobbies-checkbox-3+label").click();
        $("#uploadPicture").uploadFromClasspath("hwgit2.JPG");
        $("#currentAddress").setValue("Moscow");
        $("#react-select-3-input").setValue("NCR").pressEnter();
        $("#react-select-4-input").setValue("Delhi").pressEnter();
        $("#submit").click();

        $("[class=table-responsive]").shouldHave(text("Max Power"));
        $("[class=table-responsive]").shouldHave(text("mp@mail.ru"));
        $("[class=table-responsive]").shouldHave(text("Male"));
        $("[class=table-responsive]").shouldHave(text("7999123456"));
        $("[class=table-responsive]").shouldHave(text("08 May,1982"));
        $("[class=table-responsive]").shouldHave(text("Economics"));
        $("[class=table-responsive]").shouldHave(text("Music"));
        $("[class=table-responsive]").shouldHave(text("hwgit2.JPG"));
        $("[class=table-responsive]").shouldHave(text("Moscow"));
        $("[class=table-responsive]").shouldHave(text("NCR Delhi"));
    }
}
