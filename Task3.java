import java.util.Scanner;

interface ATM
{
    void deposit(int deposit);
    void withdraw(int withdraw);
    void checkbalance();
}

class Task3 implements ATM
{
    private int balance;
    {
        this.balance=10000;
    }
    public void deposit(int deposit)
    {
        balance = balance + deposit;
        System.out.println("your updated balance is " + balance);
        System.out.println();
    }
    public void withdraw(int withdraw)
    {
        if(balance>= withdraw)
        {
            balance= balance - withdraw;
            System.out.println("Required amount is withdrawed");
        }
        else
        {
            System.out.println("sorry! you don't have sufficient funds");
        }
    }
    public void checkbalance()
    {
        System.out.println("your account has balance of "+balance);
        System.out.println();
    }
}

class main
{
    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);
        Task3 u2=new Task3();
        System.out.println("hello!welcome to our bank");

        while(true)
        {
            System.out.println("click 1 for deposit");
            System.out.println("click 2 for withdraw");
            System.out.println("click 3 for balance check");
            System.out.println("click 4 for moving further");
            System.out.println("choose correct operations to perform");

            int choose = sc.nextInt();

            switch (choose)
            {

                case 1:
                    System.out.println("enter amount to deposit:");
                    int deposit =sc.nextInt();
                    u2.deposit(deposit);
                    break;

                case 2:
                    System.out.println("enter the amount to withdraw:");
                    int  withdraw = sc.nextInt();
                    u2.withdraw(withdraw);
                    break;

                case 3:
                    u2.checkbalance();
                    break;

                case 4:
                    System.exit(0);


            }
        }
    }
}