package Polymorphism;

public interface Payment {
    public static void pay()
    {

    }
}
class CashPayment implements Payment{
    public static void pay()
    {
        System.out.println("This is for Cash Payment");
    }
}
class CreditPayment implements Payment{
    public static void pay()
    {
        System.out.println("This is for Credit payment");
    }
}
class Polymorphism{
    public static void main(String[] args) {
        CashPayment cashPay = new CashPayment();
        cashPay.pay();
        CreditPayment credPay = new CreditPayment();
        credPay.pay();



    }
}

