package mate.academy.service;

import mate.academy.model.Account;
import mate.academy.service.commission.CommissionHandler;

public interface CommissionStrategy {
    CommissionHandler get(Account.Type type);
}
