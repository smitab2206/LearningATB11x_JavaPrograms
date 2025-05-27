package Ex_30_Exceptions;

public class Lab235_Custom_Exception_Example {
    public static void main(String[] args) {
        Bank sbi=new Bank("INR",100);
        Bank icici=new Bank("INR",123);
        int total= sbi.add(icici);
        System.out.println(total);
        Bank JPMorgan=new Bank("USD",200);
        total= sbi.add(JPMorgan);
        System.out.println(total);
    }
}

class Bank{
    private String currency;
    private Integer amount;

    public Bank(String currency,Integer amount){
        this.currency=currency;
        this.amount=amount;
    }
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer add(Bank bankName) {
        if (bankName.currency.equals("INR")) {
            return bankName.amount + this.amount;
        } else {
            try {
                throw new currencyMismatchCustomException("Currency Mismatch!!");
            } catch (currencyMismatchCustomException e) {
                System.out.println(e.getMessage());
            }
        }
        return 0;
    }
    }

    class currencyMismatchCustomException extends Exception{
        currencyMismatchCustomException(String msg){
            super(msg);
        }
    }

    class NotValidAgeException extends Exception{
        NotValidAgeException(String e){
            super(e);
        }
    }