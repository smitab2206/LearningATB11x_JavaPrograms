package Ex_20_OOPs_Polymorphism.MethodOverriding_RunTime;

public class Lab190_MethodOverriding_Automation {

    public static void main(String[] args) {
        Chrome c=new Chrome();
        c.OpenBrowser();

        Firefox f=new Firefox();
        f.OpenBrowser();

        CommonToAll common=new CommonToAll();
        common.OpenBrowser();

        //Dynamic Dispatch
        CommonToAll c2=new Chrome();
        c2.OpenBrowser();

        CommonToAll f2=new Firefox();
        f2.OpenBrowser();

    }
}

class CommonToAll{
    void OpenBrowser(){
        System.out.println("Open IE Browser!!");
    }
}


class Chrome extends CommonToAll{
    @Override
    void OpenBrowser() {
        System.out.println("Chrome will open now!!");
    }
}

class Firefox extends CommonToAll{
    void OpenBrowser(){
        System.out.println("Firefox will open now!!");
    }
}