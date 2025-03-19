package mate.academy.service;

import mate.academy.dao.AccountDao;
import mate.academy.model.Account;

import java.lang.reflect.Type;
import java.math.BigDecimal;

public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;
    private BigDecimal amount;

    public AccountServiceImpl(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void createNewAccount(String accountNumber, BigDecimal amount, Account.Type type) {
        Account account = new Account();
        account.setNumber(accountNumber);
        account.setAmount(amount);
        account.setType(type);
        accountDao.add(account);
    }
}
