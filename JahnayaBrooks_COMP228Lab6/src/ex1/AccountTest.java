package ex1;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AccountTest {
    public static void main(String[]args) {
        Account account = new Account(100.0);

        ArrayList<Transaction> list = new ArrayList<>();

        list.add(new Transaction(account, "deposit", 50));
        list.add(new Transaction(account, "withdraw", 30));
        list.add(new Transaction(account, "deposit", 80));
        list.add(new Transaction(account, "deposit", 100));

        ExecutorService executor = Executors.newCachedThreadPool();
        for (Transaction t: list) {
            executor.execute(t);
        }
        executor.shutdown();
        }
}

