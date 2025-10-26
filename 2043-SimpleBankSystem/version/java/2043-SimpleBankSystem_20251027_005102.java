// Last updated: 10/27/2025, 12:51:02 AM
class Bank {

    Map<Integer, Long> accounts; 
    int n; 

    public Bank(long[] balance) {
        accounts = new HashMap<>(); 
        n = balance.length; 
        for(int i = 0 ; i < n; i++){
            accounts.put(i + 1 , balance[i]); 
        }
    }
    
    public boolean transfer(int account1, int account2, long money) {
        if(account1 > n || account2 > n || accounts.get(account1) < money){
            return false; 
        }
        accounts.put(account1 , accounts.get(account1) - money); 
        accounts.put(account2 , accounts.get(account2) + money); 
        return true; 
    }
    
    public boolean deposit(int account, long money) {
        if(account > n) return false; 
        accounts.put(account , accounts.get(account) + money); 
        return true; 
    }
    
    public boolean withdraw(int account, long money) {
        if(account > n) return false; 
        if(accounts.get(account) < money){
            return false; 
        }
        accounts.put(account , accounts.get(account) - money); 
        return true; 
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */