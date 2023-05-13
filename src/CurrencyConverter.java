import java.util.Scanner;

public class CurrencyConverter {
    private static final double USD_TO_EUR = 0.85;
    private static final double USD_TO_GBP = 0.72;
    private static final double USD_TO_BRL = 5.63;
    private static final double USD_TO_CAD = 1.25;
    private static final double USD_TO_INR = 73.13;
    private static final double USD_TO_JPY = 109.77;
    private static final double USD_TO_CNY = 6.46;
    private static final double USD_TO_AUD = 1.29;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade a ser convertida: ");
        double amount = scanner.nextDouble();

        System.out.print("Digite a moeda de origem (USD, EUR, GBP): ");
        String currencyFrom = scanner.next().toUpperCase();

        double convertedAmount = convertCurrency(amount, currencyFrom);
        System.out.println("Valor convertido: " + convertedAmount);

        scanner.close();
    }

};
