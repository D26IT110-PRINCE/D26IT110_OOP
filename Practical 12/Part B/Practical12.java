import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Practical12 {

    public static void main(String[] args) {

        AccountStore store = new AccountStore();

        Account a1 =
                new Account("AC0001", "Prince", 5000);

        Account a2 =
                new Account("AC0002", "Rahul", 2000);

        Account a3 =
                new Account("AC0003", "Amit", 9000);

        store.add(a1);
        store.add(a2);
        store.add(a3);

        System.out.println("Account AC0002:");

        System.out.println(
                store.get("AC0002")
        );

        System.out.println("\nSorted by balance:");

        for (Account account : store.sortedByBalance()) {

            System.out.println(account);
        }

        ConcurrentHashMap<String, Account>
                concurrentAccounts =
                new ConcurrentHashMap<>();

        concurrentAccounts.put(
                a1.getAccountNumber(), a1
        );

        concurrentAccounts.put(
                a2.getAccountNumber(), a2
        );

        concurrentAccounts.put(
                a3.getAccountNumber(), a3
        );

        TransactionProcessor processor =
                new TransactionProcessor(
                        concurrentAccounts
                );

        processor.deposit("AC0001", 1000);

        System.out.println(
                "\nAfter deposit:"
        );

        System.out.println(
                concurrentAccounts.get("AC0001")
        );
    }
}