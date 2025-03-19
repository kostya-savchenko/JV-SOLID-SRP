package mate.academy.service;

import mate.academy.model.Account;
import mate.academy.service.commission.CommissionHandler;

import java.util.HashMap;
import java.util.Map;

public class CommissionStrategyImpl implements CommissionStrategy {
    private Map<Account.Type, CommissionHandler> commissionHandlerMap;

    public CommissionStrategyImpl(Map<Account.Type, CommissionHandler> commissionHandlerMap) {
        this.commissionHandlerMap = commissionHandlerMap;
    }

    @Override
    public CommissionHandler get(Account.Type type) {
        return commissionHandlerMap.get(type);
    }
}
