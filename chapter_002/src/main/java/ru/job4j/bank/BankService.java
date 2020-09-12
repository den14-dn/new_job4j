package ru.job4j.bank;

import java.util.*;
import java.util.stream.Collectors;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        var accounts = new ArrayList<Account>();
        users.putIfAbsent(user, accounts);
    }

    public void addAccount(String passport, Account account) {
        Optional<User> opt = findByPassport(passport);

        if (opt.isPresent()) {
            List<Account> accounts = users.get(opt.get());

            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    public Optional<User> findByPassport(String passport) {
        Optional<User> rst = Optional.empty();
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                rst = Optional.of(user);
                break;
            }
        }
        return rst;
    }

    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        return user.isEmpty() ? Optional.empty() : users.get(user.get()).stream()
                .filter(account -> account.getRequisite().equals(requisite))
                .findFirst();
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rst = false;

        Optional<Account> srcAccount = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAccount = findByRequisite(destPassport, destRequisite);

        if (srcAccount.isPresent() && destAccount.isPresent() && srcAccount.get().getBalance() >= amount) {
            srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
            destAccount.get().setBalance(destAccount.get().getBalance() + amount);
            rst = true;
        }

        return rst;
    }
}
