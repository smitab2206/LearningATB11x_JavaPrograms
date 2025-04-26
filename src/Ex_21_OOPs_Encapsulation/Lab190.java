package Ex_21_OOPs_Encapsulation;

public class Lab190 {
    public static void main(String[] args) {
        ICICIBank smita=new ICICIBank("Smita",100);
        //System.out.println(smita.name);//not allowed as its private. Create getter setter to access them

        smita.setBal(500,true);
        System.out.println(smita.getBal());

        long bal_updated= smita.getBal();
        System.out.println(bal_updated);
    }
}

class ICICIBank{
    //## Encapsulation
    //- Encapsulation is a fundamental concept in object-oriented programming (OOP).
    //- Bundling of data and methods that operate on that data within a single unit.
    //- Data members should be private in nature.
    //- Methods with getter and setter only, you can access the data members / attributes.

    private String name;
    private long bal;

    ICICIBank(String name,long bal){
        this.name=name;
        this.bal=bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal,boolean isCashier) {
        if (isCashier) {
            this.bal = bal;
        }else {
            System.out.println("Not allowed to change the bal");
        }

    }
}
