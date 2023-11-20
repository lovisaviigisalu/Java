package week8.Exercise12;

public class Purchase {
    private String product;
    private int amount;
    private int unitPrice;
    public Purchase (String product, int amount, int unitPrice){
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }
    public int price(){
        int s =unitPrice * amount;
        return s;
    }
    public void increaseAmount(){
        amount++;
    }

    @Override
    public String toString() {
        return product + ": " + amount;
    }
}
