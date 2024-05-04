package pages;

import com.codeborne.selenide.SelenideElement;
import pages.component.CalendarComponent;
import pages.component.CheckResultComponent;

import static com.codeborne.selenide.Condition.cssClass;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormRegistration {

    //private final String endPoint = "/automation-practice-form";
    private final  SelenideElement
            firstName = $("#firstName"),
            lastName = $("#lastName"),
            userEmail =  $("#userEmail"),
            genderWrapper = $("#genterWrapper"),
            userNumber = $("#userNumber"),
            calendarType = $("#dateOfBirthInput"),
            subjectsContainer = $("#subjectsContainer"),
            subjectsInput = $("#subjectsInput"),
            hobbiesWrapper = $("#hobbiesWrapper"),
            uploadPicture = $("#uploadPicture"),
            currentAddress = $("#currentAddress"),
            state = $("#state"),
            stateCityWrapper = $("#stateCity-wrapper"),
            city = $("#city"),
            submit = $("#submit"),
            userForm = $("#userForm");


    CalendarComponent calendarComponent = new CalendarComponent();
    CheckResultComponent checkResult = new CheckResultComponent();


    public PracticeFormRegistration openPage(){
        open("/automation-practice-form");
        executeJavaScript("$('footer').remove();");
        executeJavaScript("$('#fixedban').remove();");
        return this ;
    }

    public PracticeFormRegistration setFirstName(String value){
        firstName.setValue(value);
        return this;
    }

    public PracticeFormRegistration setLastName(String value){
        lastName.setValue(value);
        return this;
    }

    public PracticeFormRegistration setUserEmail(String value){
        userEmail.setValue(value);
        return this ;
    }

    public PracticeFormRegistration setGenterWrapper(String value){
        genderWrapper.$(byText(value)).click();
        return this ;
    }

    public PracticeFormRegistration setUserNumber(String value){
        userNumber.setValue(value);
        return this ;
    }

    public PracticeFormRegistration setDateOfBirth(String day, String month, String year){
        calendarType.click();
        calendarComponent.setDate(day, month, year);
        return this ;
    }

    public PracticeFormRegistration setSubjectsContainer(String value){
        subjectsContainer.click();
        subjectsInput.setValue(value).pressEnter();
        return this ;
    }

    public PracticeFormRegistration setHobbiesWrapper(String value){
        hobbiesWrapper.$(byText(value)).click();
        return this ;
    }

    public PracticeFormRegistration uploadPicture(String value){
        uploadPicture.uploadFromClasspath(value);
        return this ;
    }

    public PracticeFormRegistration setCurrentAddress(String value){
        currentAddress.setValue(value);
        return this ;
    }

    public PracticeFormRegistration setState(String value){
        state.click();
        stateCityWrapper.$(byText(value)).click();
        return this ;
    }

    public PracticeFormRegistration setCity(String value){
        city.click();
        stateCityWrapper.$(byText(value)).click();
        return this ;
    }

    public PracticeFormRegistration submit(){
        submit.click();
        return this ;
    }

    public PracticeFormRegistration checkResult(String key, String value){
      checkResult.result(key,value);
    return this ;
}

//public PracticeFormRegistration checkValidation(){
//    userForm.shouldHave(cssClass("was-validated"));
//    return this;
}

