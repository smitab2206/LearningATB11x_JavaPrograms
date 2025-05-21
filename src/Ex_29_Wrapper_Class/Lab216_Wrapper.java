package Ex_29_Wrapper_Class;

public class Lab216_Wrapper {
    public static void main(String[] args) {
        Mobile iphone=new Mobile(123455,"iPhone",120000.00);
        Mobile samsung=new Mobile(568678765,"Samsung",50000);

        iphone.setPrice(200000.00);
        iphone.display();
        samsung.display();

        System.out.println(Mobile.mobile_carrier);
        Mobile.switchOnAirplaneMode();
    }
}
class Old_phone implements SimCard{
    @Override
    public void enterCard() {
        System.out.println("Card entered..");
    }

    void calling(){
        System.out.println("dial Pad");
    }
}
class Mobile extends Old_phone{

    private Integer phone;
    private String name;
    private Double price;
    static String mobile_carrier = "airtel";

    Mobile(){
        System.out.println("DC");
    }

    public Mobile(Integer phone,String name,double price){//parameterised constructor
        this.phone=phone;
        this.name=name;
        this.price=price;
    }
    void display(){
        System.out.println(this.name+"  "+this.phone+"  "+this.price);
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    static void switchOnAirplaneMode(){
        System.out.println("Common Airplane mode");
    }

    void calling(){
        System.out.println("dialpad==> Touch dialpad now..");
    }
}

interface SimCard{
    void enterCard();
}


