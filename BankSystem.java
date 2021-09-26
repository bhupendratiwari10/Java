class AccountSystem{
    double total_balance;
   public void insert(int acc_no,String name,double deposit_amount){
System.out.println("Account Holder name - " + name +"\n" + "Account Number - " + acc_no + "\n" + "Total Available Balance is " + deposit_amount);
total_balance=deposit_amount;
    }
    void deposit(double amount){
total_balance=total_balance+(amount);
System.out.println(total_balance);

    }
    void withraw(double amount){
        if (total_balance > (amount)){
            
            System.out.println("Amount Withrawn -" +amount );}
            else {
                System.out.println("Insufficiant Balance");
            }
             System.out.println();
        }
       
    
    void  checkBalance(){

    }
}
public class BankSystem {
   public static void main(String[] args){
       AccountSystem cust1=new AccountSystem();
       cust1.insert(121534,"Bhuvi",1000);
   } 
}
