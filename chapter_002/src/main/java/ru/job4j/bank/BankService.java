package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        var accounts = new ArrayList<Account>();
        users.putIfAbsent(user, accounts);
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);

        if (user == null)
            return;

        List<Account> accounts = users.get(user);

        if (!accounts.contains(account)) {
            accounts.add(account);
        }
    }

    public User findByPassport(String passport) {
        User rst = null;

        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                rst = user;
                break;
            }
        }

        return rst;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);

        if (user == null)
            return null;

        List<Account> accounts = users.get(user);

        if (accounts == null)
            return null;

        int index = accounts.indexOf(new Account(requisite, 0));
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
