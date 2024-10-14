// 1. Lite om OOP:n - inga setters - de fixas via withdraw/deposit
// 2. Hur fixa fel #1??? OM uttag > balance?
// 3. Hur fixa fel #2??? OM uttag > 3000 kr (maxuttag per gång)
// 4. lös 2 och 3 med felkoder
// 5. lös 2 och 3 med exceptions - IllegalArgumentException + egen exception TooMuchDepositException


public class App {
    public static void main(String[] args) throws Exception {
        try{
            var bankAccount = new BankAccount("243423423-423423");
            bankAccount.Deposit(50);
        
            bankAccount.Withdraw(100);
            bankAccount.Withdraw(5000);
    
    
            System.out.println(bankAccount.getBalance());
            }
        catch(AmountHigherThanBalanceException e){
            System.out.println(e.getMessage());
        }
        catch(AmountHigherThanDailyLimitException e){
            System.out.println(e.getMessage());
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Hej då");

    }
}
