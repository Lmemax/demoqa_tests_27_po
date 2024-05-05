package tests;


import org.junit.jupiter.api.Test;
import pages.PracticeFormRegistration;

public class PracticeFormTests extends TestBase {

    PracticeFormRegistration practiceFormRegistration = new PracticeFormRegistration();


    @Test
    void testPracticeForm() {

        practiceFormRegistration.openPage()
                .setFirstName("Max")
                .setLastName("Power")
                .setUserEmail("mp@mail.ru")
                .setGenterWrapper("Male")
                .setUserNumber("7999123456")
                .setDateOfBirth("13", "May", "1982")
                .setSubjectsContainer("Economics")
                .setHobbiesWrapper("Music")
                .uploadPicture("hwgit2.JPG")
                .setCurrentAddress("Moscow")
                .setState("NCR")
                .setCity("Delhi")
                .submit()
                .checkResult("Student Name", "Max Power")
                .checkResult("Student Email", "mp@mail.ru")
                .checkResult("Gender", "Male")
                .checkResult("Mobile", "7999123456")
                .checkResult("Date of Birth", "13 May,1982")
                .checkResult("Subjects", "Economics")
                .checkResult("Hobbies", "Music")
                .checkResult("Picture", "hwgit2.JPG")
                .checkResult("Address", "Moscow")
                .checkResult("State and City", "NCR Delhi");
    }

    @Test
    void testMinDataForm() {
        practiceFormRegistration.openPage()
                .setFirstName("Max")
                .setLastName("Power")
                .setUserEmail("mp@mail.ru")
                .setGenterWrapper("Male")
                .setUserNumber("7999123456")
                .setDateOfBirth("13", "May", "1982")
                .submit()
                .checkResult("Student Name", "Max Power")
                .checkResult("Student Email", "mp@mail.ru")
                .checkResult("Gender", "Male")
                .checkResult("Mobile", "7999123456")
                .checkResult("Date of Birth", "13 May,1982");
    }
    @Test
    void testNegativeDataForm () {
        practiceFormRegistration.openPage()
                .setFirstName("Max")
                .setLastName(" ")
                .setUserEmail("mp@mail.ru")
                .setGenterWrapper("Male")
                .setUserNumber("7999123456")
                .setDateOfBirth("13", "May", "1982")
                .submit()
                .checkResult("Student Name", "Max Power")
                .checkResult("Student Email", "mp@mail.ru")
                .checkResult("Gender", "Male")
                .checkResult("Mobile", "7999123456")
                .checkResult("Date of Birth", "13 May,1982");
    }
}
