package mate.academy.service.commission;

import java.math.BigDecimal;

public class UltraCommissionStrategy implements CommissionHandler {
    @Override
    public BigDecimal getCommission(BigDecimal amount) {
        return new BigDecimal(100);
    }
}
