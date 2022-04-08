package Lesson_12.Interface;

public class TestSth implements EnvironmentNames{
    public static void main(String[] args) {

        sendApiReq(qaEnv);
        sendApiReq(stagingEnv);
    }

    private static void sendApiReq(String qaEnv) {
        System.out.println(qaEnv);
    }
}
