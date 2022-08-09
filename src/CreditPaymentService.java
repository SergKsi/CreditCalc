public class CreditPaymentService {
    public double calculate(int sumCredit, int dateCredit, double procentCredit) {
        // Формула расчёта суммы ежемесячного платежа при аннуитетной схеме погашения следующая:
        //annuitetPay = K * sumCredit
        //где annuitetPay – сумма ежемесячного аннуитетного платежа,
        //К - коэффициент аннуитета,
        //sumCredit - сумма кредита.
        //Сумма кредита известна. А для расчёта К – коэффициента аннуитета, используется следующая формула:
        //где procentCredit - процентная ставка по кредиту в месяц (рассчитывается как годовая, делённая на 12 месяцев),
        //n - количество периодов (месяцев) погашения кредита.
        // k = (procentCredit * (1+procentCredit)^n) / ((1+procentCredit)^n -1)
        double procentMonthCredit;
        double k; // коэфициент
        double powCredit; // возведение в степень
        double annuitetPay; // сумма ежемесячного аннуитетного платежа

        procentMonthCredit = procentCredit / (12*100);
        powCredit = Math.pow((1 + procentMonthCredit), dateCredit*12);
        k = (procentMonthCredit * powCredit) / (powCredit - 1);
        annuitetPay = k * sumCredit;
        return annuitetPay;
    }
}
