package mate.academy.model;

import java.lang.reflect.Type;
import java.math.BigDecimal;

public class Account {
    private String number;
    private BigDecimal amount = new BigDecimal(0);
    private Type type;

    public Account(String number, BigDecimal amount) {
        this.number = number;
        this.amount = amount;
    }

    public Account(String number, BigDecimal amount, Type type) {
        this.number = number;
        this.amount = amount;
        this.type = type;
    }

    public Account() {

    }

    @Override
    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                ", amount=" + amount +
                ", type=" + type +
                '}';
    }

    public String getNumber() {
        return number;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Type getType() {
        return type;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public enum Type {
        REGULAR, GOLD, PLATINUM
    }

}

