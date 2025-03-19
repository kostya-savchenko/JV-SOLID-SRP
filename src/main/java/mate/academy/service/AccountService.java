package mate.academy.service;

import mate.academy.model.Account;

import java.lang.reflect.Type;
import java.math.BigDecimal;

public interface AccountService {
    void createNewAccount(String accountNumber, BigDecimal amount, Account.Type type);
}
