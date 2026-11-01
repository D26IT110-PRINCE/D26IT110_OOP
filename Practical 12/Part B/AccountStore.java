import java.util.*;

public class AccountStore {

    private HashMap<String, Account> accounts;

    private ArrayList<String> transactionHistory;

    public AccountStore() {
        accounts = new HashMap<>();
        transactionHistory = new ArrayList<>();
    }

    public void add(Account account) {

        accounts.put(
                account.getAccountNumber(),
                account
        );

        transactionHistory.add(
                "Added account: " +
                account.getAccountNumber()
        );
    }

    public Account get(String accountNumber) {

        return accounts.get(accountNumber);
    }

    public ArrayList<Account> getAll() {

        return new ArrayList<>(accounts.values());
    }

    public ArrayList<String> getTransactionHistory() {

        return transactionHistory;
    }

    public ArrayList<Account> sortedByBalance() {

        ArrayList<Account> result =
                new ArrayList<>(accounts.values());

        result.sort(
                Comparator.comparingDouble(
                        Account::getBalance
                ).reversed()
        );

        return result;
    }
}