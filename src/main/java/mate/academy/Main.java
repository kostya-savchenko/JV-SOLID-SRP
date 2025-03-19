package mate.academy;

import mate.academy.dao.AccountDao;
import mate.academy.dao.AccountDaoImpl;
import mate.academy.db.Storage;
import mate.academy.model.Account;

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


        // Виведення початкових балансів
        System.out.println("Початковий баланс:" + "\n" + accountDao.get("12345") + "\n" + accountDao.get("67890"));

        // Переказ грошей

        // Виведення балансів після переказу
        System.out.println("\nБаланс після переказу:");
        System.out.println(accountDao.get("12345"));
        System.out.println(accountDao.get("67890"));

        //Переказ грошей в зворотньому напрямку

        //Виведення балансів після зворотнього переказу
        System.out.println("\nБаланс після зворотнього переказу:");
        System.out.println(accountDao.get("12345"));
        System.out.println(accountDao.get("67890"));
    }
}
