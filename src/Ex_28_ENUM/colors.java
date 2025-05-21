package Ex_28_ENUM;

public enum colors {
    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");

    private String hexCode;

    colors(String hexCode){
        this.hexCode=hexCode;
    }

    String getHexCode(){
        return this.hexCode;
    }
}
