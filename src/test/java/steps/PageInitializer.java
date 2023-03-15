package steps;

import pages.LoginPage;

public class PageInitializer {

    public static LoginPage login;


    public static void intializePageObjects(){
        login = new LoginPage();

    }

    }