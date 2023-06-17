package corejava_finaltest;



import java.util.*;

public class ICICIBank implements Bank {
    static Customer c1 = new Customer();


   ArrayList <Customer> data = new ArrayList();

    {

        data.add(new Customer("Rahul", 123, 5000));
        data.add(new Customer("Rohit", 456, 6000));
        data.add(new Customer("Sagar", 789, 8000));
        data.add(new Customer("Vaibhav", 289, 50000));
        data.add(new Customer("Abhay", 416, 30000));
    }


    @Override
    public void deposit(int accNo, double amt) {

        for (Customer c1:data)
            if (c1.getAccNo()==accNo) {
                double bankbal = c1.getBankBalance() + amt;
                c1.setBankBalance(bankbal);
                return;
            }
        }



    @Override
    public void withdraw(int accNo, double amt) {
        for (Customer c1:data) {
            if (c1.getAccNo() == accNo) {
                if (c1.getBankBalance() > amt) {
                    double bankabal = c1.getBankBalance() - amt;
                    c1.setBankBalance(bankabal);
                    c1.getBankBalance();
                    return;

                }
            }
        }
    }


    @Override
    public void checkBalance(int accNo) {
        for (Customer c1:data) {

            if (c1.getAccNo()==accNo) {
                System.out.println(c1.getBankBalance());
            }
        }
    }


}








