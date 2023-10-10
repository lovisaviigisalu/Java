package week5.exericise86;

public class CashRegister {
    private double cashInRegister;   // the amount of cash in the register
    private int economicalSold;      // the amount of economical lunches sold
    private int gourmetSold;         // the amount of gourmet lunches sold

    public CashRegister() {
        this.cashInRegister = 1000;
        this.economicalSold = 0;
        this.gourmetSold = 0;
    }

    public double payEconomical(double cashGiven) {
        //lunchPrice vaartus
        double lunchPrice = 2.50;
        //kui raha on piisavalt, et maksta, siis lisatakse kassale toidu hind, lisatakse loendajasse 1 ja arvutatakse, kui palju peab tagasi maksma
        if(cashGiven >=lunchPrice){
            cashInRegister +=lunchPrice;
            economicalSold ++;
            return cashGiven -lunchPrice;
            //kui raha ei anta piisavalt, siis returnitakse nii suur summa, kui maksmiseks anti
        }else {
            return cashGiven;
        }

    }

    public double payGourmet(double cashGiven) {
        //gourmetPrice vaartus
        double gourmetPrice = 4.00;
        //kui raha on piisavalt, et maksta, siis lisatakse kassale toidu hind, lisatakse loendajasse 1 ja arvutatakse, kui palju peab tagasi maksma
        if(cashGiven>=gourmetPrice){
            cashInRegister +=gourmetPrice;
            gourmetSold++;
            return cashGiven-gourmetPrice;
            //kui raha ei anta piisavalt, siis returnitakse nii suur summa, kui maksmiseks anti
        }else{
            return cashGiven;
        }
    }

    public String toString() {
        return "money in register "+cashInRegister+" economical lunches sold: "+economicalSold+" gourmet lunches sold: "+gourmetSold;
    }
    public boolean payEconomical(LyyraCard card) {
        double ecoLunch = 2.50;
        if(card.balance()>=ecoLunch){
            card.pay(ecoLunch);
            economicalSold++;
            return true;
        }else{
            return false;
        }
    }

    public boolean payGourmet(LyyraCard card) {
        double gourmetLunch = 4.00;
        if(card.balance()>=gourmetLunch){
            card.pay(gourmetLunch);
            gourmetSold++;
            return true;
        }else{
            return false;
        }
    }
    public void loadMoneyToCard(LyyraCard card, double sum){
        if(sum>0){
            card.loadMoney(sum);
            cashInRegister +=sum;
        }
    }
}
