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

        System.out.println("*****************************************************************************************************");
        System.out.println("Bem vindo ao conversor de moedas, insira o valor e a moeda de origem para converter o valor em USD!");
        System.out.println("*****************************************************************************************************");
        System.out.print("Digite a quantidade a ser convertida: ");
        double amount = scanner.nextDouble();

        System.out.print("Digite a moeda de origem (EUR, GBP, BRL, CAD, INR, JPY, CNY, AUD): ");
        String currencyFrom = scanner.next().toUpperCase();

        double convertedAmount = convertCurrency(amount, currencyFrom);
        System.out.println("Valor convertido: " + convertedAmount);

        scanner.close();
    }
    private static double convertCurrency(double amount, String currencyFrom) {
        double convertedAmount = 0.0;

        switch (currencyFrom) {
            case "USD":
                convertedAmount = amount;
                break;
            case "EUR":
                convertedAmount = amount / USD_TO_EUR;
                break;
            case "GBP":
                convertedAmount = amount / USD_TO_GBP;
                break;
            case "BRL":
                convertedAmount = amount / USD_TO_BRL;
                break;
            case "CAD":
                convertedAmount = amount / USD_TO_CAD;
                break;
            case "INR":
                convertedAmount = amount / USD_TO_INR;
                break;
            case "JPY":
                convertedAmount = amount / USD_TO_JPY;
                break;
            case "CNY":
                convertedAmount = amount / USD_TO_CNY;
                break;
            case "AUD":
                convertedAmount = amount / USD_TO_AUD;
                break;
            default:
                System.out.println("Moeda de origem inválida.");
        }

        return convertedAmount;
    }

};
