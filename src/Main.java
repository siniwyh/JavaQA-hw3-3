public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println("Срок кредита = 1 год");
        System.out.println("Ежемесячный платеж " + service.calculate(1_000_000, 1, 9.99) + " Р");
        System.out.println();

        System.out.println("Срок кредита = 2 года");
        System.out.println("Ежемесячный платеж " + service.calculate(1_000_000, 2, 9.99) + " Р");
        System.out.println();

        System.out.println("Срок кредита = 3 года");
        System.out.println("Ежемесячный платеж " + service.calculate(1_000_000, 3, 9.99) + " Р");
        System.out.println();

    }
}
