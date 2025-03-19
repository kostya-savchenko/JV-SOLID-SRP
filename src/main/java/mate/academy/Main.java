package mate.academy;

import mate.academy.dao.AccountDao;
import mate.academy.dao.AccountDaoImpl;
import mate.academy.db.Storage;
import mate.academy.model.Account;
import mate.academy.service.AccountService;
import mate.academy.service.AccountServiceImpl;
import mate.academy.service.BankService;
import mate.academy.service.BankServiceImpl;

import java.lang.reflect.Type;
import java.math.BigDecimal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Створення AccountDao
        AccountDao accountDao = new AccountDaoImpl();

        // Створення BankService
        BankService bankService = new BankServiceImpl(accountDao);

        // Додавання рахунків
        AccountService accountService = new AccountServiceImpl(accountDao);

        accountService.createNewAccount("12345", new BigDecimal("1000.00"), Account.Type.GOLD);
        accountService.createNewAccount("67890", new BigDecimal("500.00"), Account.Type.REGULAR);

        // Виведення початкових балансів
        System.out.println("Початковий баланс:" + "\n"+accountDao.get("12345") + "\n"+accountDao.get("67890"));

        // Переказ грошей
        BigDecimal amountTransfer = new BigDecimal("200.00");
        bankService.transfer("12345", "67890", amountTransfer);

        // Виведення балансів після переказу
        System.out.println("\nБаланс після переказу:");
        System.out.println("Переказ: " + amountTransfer);
        System.out.println(accountDao.get("12345"));
        System.out.println(accountDao.get("67890"));

        //Переказ грошей в зворотньому напрямку
        amountTransfer = new BigDecimal("100");
        bankService.transfer("67890", "12345", amountTransfer);

        //Виведення балансів після зворотнього переказу
        System.out.println("\nБаланс після зворотнього переказу:");
        System.out.println("Переказ: " + amountTransfer);
        System.out.println(accountDao.get("12345"));
        System.out.println(accountDao.get("67890"));
    }
}
