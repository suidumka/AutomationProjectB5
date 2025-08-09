package io.loop.Utilities;

public class DocuportConstants {

    // url for test env
    public static final String DOCUPORT_TEST = "https://beta.docuport.app";

    // usernames for roles
    public static final String USERNAME_CLIENT = "b1g1_client@gmail.com";
    public static final String USERNAME_ADVISOR = "b1g1_advisor@gmail.com";
    public static final String USERNAME_SUPERVISOR = "b1g1_supervisor@gmail.com";
    public static final String USERNAME_EMPLOYEE = "b1g1_employee@gmail.com";

    public static final String PASSWORD_FOR_LOGIN = "Group1";



    //messages:
    public static final String ERROR_MESSAGE_FOR_EMPTY_PASSWORD  = "Please enter your password";
    public static final String EXPECTED_LOGO_DOCUPORT = "Docuport";
    public static final String EXPECTED_USERNAME_PLACEHOLDER = "Username or email";
    public static final String EXPECTED_PASSWORD_PLACEHOLDER = "Password";

    public static final String EXPECTED_ERROR_USERNAMEMESSAGE = "Please enter your username or email address";
    public static final String EXPECTED_ERROR_PASSWORDMESSAGE = "Please enter your password";

    // general:
    public static final String EXPECTED_DROP_DOWN_MENU = "BG";

    public static final String BATCH_NUMBER = "Batch1 Group1";


    int wait;

    public DocuportConstants(int wait) {
        this.wait = wait;
    }
}
