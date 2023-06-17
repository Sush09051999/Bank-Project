package corejava_finaltest;

import java.util.Scanner;

public class Customer_mainapp {
    static Scanner sc1 = new Scanner(System.in);

     static ICICIBank i1=new ICICIBank();
    public static void main(String[] args) {

        boolean status = true;

        while (status) {
            System.out.println("Enter the Number of operation to be performed");
            System.out.println("1:Deposit Money");
            System.out.println("2:WithDraw Money");
            System.out.println("3:Display BankBalance");
            System.out.println("4:Exit");
            int choice = sc1.nextInt();

            switch (choice) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                   chechBalance();

                break;
                case 4:
                  //  createaccount(String name11,int account_number,)
                    break;
                case 5:
                    status = false;
                    System.out.println("Thank you for using our Bank");

            }

        }
    }

    private static void chechBalance() {
        System.out.println("Enter the Account Number");
        int accNo = sc1.nextInt();
        i1.checkBalance(accNo);
    }

    private static void deposit() {
        System.out.println("Enter the Account number");
        int accNo = sc1.nextInt();

        System.out.println("Enter the Amount to be Deposited");
        double amt = sc1.nextDouble();

        i1.deposit(accNo, amt);
        System.out.println(amt+ " Amount Deposited Successfully");
    }

    private static void withdraw() {
        Customer c1=new Customer();
        System.out.println("Enter the Account Number");
        int accNo = sc1.nextInt();
        System.out.println("Enter the Amount to be Withdraw");
        double amt = sc1.nextDouble();
        if(amt<c1.getBankBalance()) {
            i1.withdraw(accNo, amt);
            System.out.println(amt+ " Amount Withdrawn Successfully");
        }else {
            System.out.println("You have Insufficient Balance");
        }
    }

}


