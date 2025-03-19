package mate.academy.dao;

import mate.academy.model.Account;

public interface AccountDao {
    void add(Account account);
    Account get(String accountNumber);

    void update(Account account);
}
