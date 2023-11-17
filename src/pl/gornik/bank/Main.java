package pl.gornik.bank;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("1112223334445556667778880",
                5000);
        boolean numer = cyfryNumeruKlienta(bankAccount.getNumberAccount());

        if(numer){
            System.out.println("Numer konta jest poprawny");
        }else{
            System.out.println("Numer konta nie jest poprawny");
        }

        System.out.println(bankAccount);

        System.out.println("Twój numer konta: \n" + bankAccount.getNumberAccount());

        bankAccount.setAccountBalance(-5500);
        System.out.println(bankAccount.getAccountBalance());

        bankAccount.deposit(500);
        System.out.println("Saldo po wpłacie: " + bankAccount.getAccountBalance());

        bankAccount.payCheck(1000);
        System.out.println("Saldo po wypłacie: " + bankAccount.getAccountBalance());

        int timeDeposit = 2;
        double amountDeposit = 2000;
        double termPercent = 10;
        LocalTime startTime = LocalTime.now();
//        System.out.println(startTime);
        LocalTime endTime = startTime.plusMinutes(timeDeposit);
//        System.out.println(endTime);

        //zalozenie lokaty
        TermDeposit termDeposit = new TermDeposit(timeDeposit, amountDeposit, termPercent, startTime);

        // odjęcie kwoty od stanu konta
        bankAccount.setAccountBalance(bankAccount.getAccountBalance() - amountDeposit);
        System.out.printf("Stan konta po założeniu lokaty %.2f \n", bankAccount.getAccountBalance());

        String end = "";
        Scanner scanner = new Scanner(System.in);
        while(!end.equals("stop")){
            System.out.printf("Poczekaj %d minuty i potem wpisz \'stop'", timeDeposit);
            end = scanner.nextLine();
        }

        LocalTime timeNow = LocalTime.now();
        if(timeNow.isBefore(endTime)){
            System.out.println("Lokata terminowa jeszcze trwa");
        }else{
            bankAccount.setAccountBalance(bankAccount.getAccountBalance() + termDeposit.calculateProfit());
        }

        //stan konta po zakończeniu lokaty
        System.out.printf("Saldo z lokatą terminową: %.2f", bankAccount.getAccountBalance());
    }

    public static boolean cyfryNumeruKlienta(String accountNumber){
        accountNumber = accountNumber.replaceAll("[^\\d]", "");
        if(accountNumber.length() == 26){
            return true;
        }else{
            return false;
        }
    }
}