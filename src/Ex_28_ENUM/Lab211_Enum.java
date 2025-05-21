package Ex_28_ENUM;

public class Lab211_Enum {
    public static void main(String[] args) {
        System.out.println(Locators.page_button.getLocators());
        System.out.println(Locators.page_input.getLocators());
        System.out.println("==========");

        System.out.println(APIURL.vwo.getUrl());
        System.out.println(APIURL.katalon.getUrl());
        System.out.println(APIURL.google.getUrl());
        System.out.println("=================");

        System.out.println(colors.RED);
        System.out.println(colors.BLUE);
        System.out.println(colors.GREEN);
        System.out.println(colors.YELLOW);
    }
}
