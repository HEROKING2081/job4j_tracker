package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.IntPredicate;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.put(user, new ArrayList<Account>());
    }

    public IntPredicate deleteUser(String passport) {
        User user = findByPassport(passport);
        if (user != null) {
            users.remove(user);
        }
        return null;
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null && users.get(user).contains(account)) {
            users.get(user).add(account);
        }
    }

    public User findByPassport(String passport) {
        User user = null;
        for (User key : users.keySet()) {
            if (passport.equals(key.getPassport())) {
                user = key;
            }
        }
        return user;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account account = null;
        User user = findByPassport(passport);
        if (user != null) {
            for (Account acc : users.get(user)) {
                if (requisite.equals(acc.getRequisite())) {
                    account = acc;
                }
            }
        }
        return account;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Account accountSrc = findByRequisite(srcPassport, srcRequisite);
        Account accountDest = findByRequisite(destPassport, destRequisite);
        boolean rtn = false;
        if (accountDest != null && accountSrc != null && amount <= accountSrc.getBalance()) {
            accountDest.setBalance(accountDest.getBalance() + amount);
            rtn = true;
        }
        return rtn;
    }

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
