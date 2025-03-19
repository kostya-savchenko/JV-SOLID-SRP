package mate.academy.service;

import mate.academy.dao.AccountDao;
import mate.academy.db.Storage;
import mate.academy.model.Account;

import java.math.BigDecimal;

public class BankServiceImpl implements BankService {
    private AccountDao accountDao;

    public BankServiceImpl(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transfer(String fromAccountNumber, String toAccountNumber, BigDecimal amount) {
//        1. Get accounts from storage
        Account fromAccount = accountDao.get(fromAccountNumber);
        Account toAccount = accountDao.get(toAccountNumber);

        //        2. Transfer money between accounts
        fromAccount.setAmount(newValueFrom);

        BigDecimal newValueTo = toAccount.getAmount().add(amount);
        toAccount.setAmount(newValueTo);

        accountDao.update(fromAccount);
        accountDao.update(toAccount);

    }
}
