package corejava_finaltest;

public class Customer  {

    private String name;
    private int accNo;
    private double bankBalance;

    public Customer(String name, int accNo, double bankBalance) {
        this.name = name;
        this.accNo = accNo;
        this.bankBalance = bankBalance;
    }

    public Customer() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public double getBankBalance() {
        return this.bankBalance;
    }

    public double setBankBalance(double bankBalance) {
        this.bankBalance = bankBalance;


        return bankBalance;
    }



    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", accNo=" + accNo +
                ", bankBalance=" + bankBalance +
                '}';
    }
}
