package Lesson_11;

public class Lab_11 {
    /**
     * Please use Strategy Design Pattern to solve below problem
     * ILOgin: login
     * NormalLogin implements ILOgin
     * SSOLogin implements ILOgin
     * LoginPage - abstract
     * InternalLoginPage use normal login type
     * ExternalLoginPage use SSO type
     */
    public static void main(String[] args) {
        ExternalLoginPage exLogin = new ExternalLoginPage();
        InternalLoginPage inLogin = new InternalLoginPage();
        exLogin.login();
        inLogin.login();
    }
}
