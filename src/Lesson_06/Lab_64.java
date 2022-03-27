package Lesson_06;

import java.util.Scanner;

public class Lab_64 {
    /**
     * LAB 6.4
     * String url = "https://google.com";
     * Check http OR https; domain name, .com OR .net
     */
    public static void main(String[] args) {
        System.out.println("Please input url: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        checkHttp(input);
        checkDomainName(input);
        checkEnding(input);
    }
    public static void checkHttp(String url) {
        String http = url.substring(0,url.indexOf(":"));
        if (http.equalsIgnoreCase("http")) {
            System.out.println("Your url is: http");
        } else if(http.equalsIgnoreCase("https")) {
            System.out.println("Your url is: https");
        } else  {
            System.out.println("Wrong url");
        }
    }
    public static void checkDomainName(String url) {
        String domainName = url.substring((url.indexOf("/")+2),url.indexOf("."));
        System.out.println("Your Domain is: "+domainName);
    }

    public static void checkEnding(String url) {
        String temp = url.substring(url.indexOf("."));
        System.out.println("Your end is: "+temp);
    }
}
