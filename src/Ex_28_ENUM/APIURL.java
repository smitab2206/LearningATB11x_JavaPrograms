package Ex_28_ENUM;

public enum APIURL {
    vwo("https://app.vwo.com"),
    katalon("https://katalon.com"),
    google("https://google.com");

    private String url;
    APIURL(String url){
        this.url=url;
    }

    String getUrl() {
        return this.url;
    }
}
