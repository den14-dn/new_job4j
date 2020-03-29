package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        if (!users.containsKey(user)) {
            var accounts = new ArrayList<Account>();
            users.put(user, accounts);
        }
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        List<Account> accounts = users.get(user);

        boolean isAccount = false;
        for (Account el : accounts) {
            if (el.equals(account)) {
                isAccount = true;
                break;
            }
        }

        if (!isAccount) {
            accounts.add(account);
        }
    }

    public User findByPassport(String passport) {
        User user = new User(passport, "");
        users.putIfAbsent(user, new ArrayList<Account>());
        return user;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        List<Account> accounts = users.get(user);

        int index = accounts.indexOf(new Account(requisite, 0));
        if (index == -1)
            return null;
        return accounts.get(index);
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rst = false;

        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);

        if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rst = true;
        }

        return rst;
    }
}
