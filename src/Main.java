import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int sumCredit = 1_000_000; // сумма креита в рублях
        int dateCredit = 3; // срок кредита в годах
        double procentCredit = 9.9; // процент по кредиту

        CreditPaymentService service  = new CreditPaymentService();
        double annuitetPay = service.calculate(sumCredit, dateCredit, procentCredit);

        System.out.println("--------------------------------------------------------");
        System.out.println("Сумма кредита в руб. = " + sumCredit);
        System.out.println("Срок кредита в годах  = " + dateCredit);
        System.out.println("Процентная головая ставка  = " + procentCredit);
        System.out.println("--------------------------------------------------------");
        System.out.println("Сумма ежемесячного аннуитетного платежа в руб.= " + Math.ceil(annuitetPay));
        System.out.println("--------------------------------------------------------");

    }
}
