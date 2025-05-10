package ex12;

class Product {
    private String name;
    private double price;
    private PaymentMethod paymentMethod;

    public Product(String name, double price, PaymentMethod paymentMethod) {
        this.name = name;
        this.price = price;
        this.paymentMethod = paymentMethod;
    }

    public double calculateAmountToBePaid() {
        double amountToBePaid = this.price;
        if (this.paymentMethod == PaymentMethod.CASH_PIX) {
            amountToBePaid -= this.price * 0.15;
        } else if (this.paymentMethod == PaymentMethod.CREDIT_CARD_ONE_TIME_PAYMENT) {
            amountToBePaid -= this.price * 0.10;
        } else if (this.paymentMethod == PaymentMethod.CREDIT_CARD_TWO_INSTALLMENT) {
        } else {
            amountToBePaid += this.price * 0.10;
        }
        return amountToBePaid;
    }

    public void display() {
        System.out.println("-----------------------------------------");
        System.out.println("Product: " + this.name);
        System.out.println("Price: R$" + this.price);
        System.out.println("Payment method: " + getPaymentMethod());
        System.out.println("According to your payment method, you get " + getPaymentMethod().description + "! \nThe amount to be paid is R$: " + calculateAmountToBePaid());
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }
}

enum PaymentMethod {
    CASH_PIX("15% discount"),
    CREDIT_CARD_ONE_TIME_PAYMENT("10% discount"),
    CREDIT_CARD_TWO_INSTALLMENT("regular product price"),
    CREDIT_CARD_ABOVE_TWO_INSTALLMENT("regular product price plus 10% surcharge.");

    public String description;

    PaymentMethod(String description) {

        this.description = description;
    }
}

public class Main {
    public static void main(String[] args) {

        Product[] videoGames = {
                new Product("Nintendo Switch", 2000, PaymentMethod.CASH_PIX),
                new Product("Playstation 5", 3000, PaymentMethod.CREDIT_CARD_ONE_TIME_PAYMENT),
                new Product("Xbox Series X", 4000, PaymentMethod.CREDIT_CARD_TWO_INSTALLMENT),
                new Product("Nintendo Switch 2", 5000, PaymentMethod.CREDIT_CARD_ABOVE_TWO_INSTALLMENT),
        };

        for (Product videoGame : videoGames) {
            videoGame.display();
        }
    }
}