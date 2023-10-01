package ATM_Machine;


import java.sql.SQLOutput;
import java.util.Scanner;

class Atm{
    Double Balance =1200.50;
    int PIN=4916;

    public void CheckBalnce()
    {
        System.out.println("Enter A Pin");
        Scanner sc=new Scanner(System.in);
        int EnteredPin=sc.nextInt();
        if(EnteredPin==PIN)
        {
            menu();
        }
        else{
            System.out.println("Please Enter Currect Pin");
        }
    }
    public void menu()
    {
        System.out.println("Enter Your Choice");
        System.out.println("1.Checks A/C Balance");
        System.out.println("2.Withdraw Money");
        System.out.println("3.Deposit Money");
        System.out.println("4.Exit");

        Scanner Choice=new Scanner(System.in);
        int Opt=Choice.nextInt();

        if(Opt==1)
        {
            AccountBalance();
        }
        else if (Opt==2) {
            WithDraw_money();

        }
        else if (Opt==3) {
            Deposit();
        }
        else if (Opt==4) {
            return;
        }
        else{
            System.out.println("Please Enter Valid Choice");
        }
    }
    public void AccountBalance()
    {
        System.out.println("Balance"+Balance);
        menu();
    }
    public void WithDraw_money()
    {
        System.out.println("Enter a amount to Withdraw");
        Scanner Sc=new Scanner(System.in);
        float amount=Sc.nextFloat();
        if(amount>Balance)
        {
            System.out.println("InSufficent Balance");
        }
        else{
            Balance=Balance-amount;
            System.out.println("money Withdraw Sucessfully");
            System.out.println("Current Balance is "+Balance);
        }
        menu();
    }
    public void Deposit()
    {
        System.out.println("ENter Deposit Money");
        Scanner SC=new Scanner(System.in);
        float  amount= SC.nextFloat();
        Balance=Balance+amount;
        System.out.println("Deposite Sucessfully");
    }

}
public class ATM_Machine {
    public static void main(String[] args) {
        Atm user1=new Atm();
        user1.CheckBalnce();
        user1.menu();
        user1.AccountBalance();
        user1.WithDraw_money();
        user1.Deposit();

    }
}
