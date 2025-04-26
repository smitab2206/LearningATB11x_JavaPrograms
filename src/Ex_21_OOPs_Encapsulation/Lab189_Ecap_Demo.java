package Ex_21_OOPs_Encapsulation;

public class Lab189_Ecap_Demo {
    public static void main(String[] args) {
        VWOLogin vwoLogin=new VWOLogin("smita","smita123");
        System.out.println(vwoLogin.password);
        vwoLogin.password="654";
        System.out.println(vwoLogin.password);

        GoodVWOLogin GoodLogin=new GoodVWOLogin("prisha","prisha123");
        //System.out.println(GoodLogin.username);
        //System.out.println(GoodLogin.password);

        GoodLogin.setUsername("pramod");
        System.out.println(GoodLogin.getUsername());

        GoodLogin.setPassword("pramod123",true);
        System.out.println(GoodLogin.getPassword());

        GoodLogin.setPassword("546456",false);
        System.out.println(GoodLogin.getPassword());

    }
}

class VWOLogin{
    public String username;
    public String password;

    VWOLogin(String UN,String pswd){
        this.username=UN;
        this.password=pswd;
    }
}

class GoodVWOLogin{
    private String username;
    private String password;


    GoodVWOLogin(String UN,String pswd){
        this.username=UN;
        this.password=pswd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password,boolean isAdmin) {
        if (isAdmin){
            this.password = password;
        }else {
            System.out.println("Not Allowed to change the password");
        }

    }
}
