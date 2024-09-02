import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usdToInrRate = 83.88; // Example exchange rate

        System.out.println("Welcome to the USD to INR Currency Converter!");
        System.out.print("Enter the amount in USD: ");
        double usdAmount = scanner.nextDouble();
        double inrAmount = usdAmount * usdToInrRate;

        System.out.println(usdAmount + " USD is equivalent to($) " + inrAmount + "Rupees");
    }
}
