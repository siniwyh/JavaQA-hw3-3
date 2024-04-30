public class CreditPaymentService {
    public int calculate(int value, int periodYears, double percent) {
        int periodM = periodYears * 12; // Считаем срок кредита в месяцах
        double percentInMounth = percent / 100 / 12; // Считаем проценты в месяц
        int result = (int) (value * (percentInMounth * Math.pow((1 + percentInMounth), periodM) / (Math.pow((1 + percentInMounth), periodM) - 1))); // Считаем ежемесячный по формуле
        return result;
    }
}
