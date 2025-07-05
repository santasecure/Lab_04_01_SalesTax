//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double purchasePrice = 100.00;
        double salesTaxRate = 0.05;     // 5% sales tax
        double salesTax = purchasePrice * salesTaxRate;
        double totalPrice = purchasePrice + salesTax;

        System.out.println("For a purchase of $" + purchasePrice + ", the sales tax is $" + salesTax + ", for a total price of $" + totalPrice + ".");
    }
}