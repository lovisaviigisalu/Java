package week4.Exercise77;


public class LyyraCard {
    private String owner;
    private double balance;
    //votab Main classis oleva kulu/tulu ning teeb selle selliseks, et summat siin classis printida
    public LyyraCard(double balanceAtStart){
        this.balance = balanceAtStart;
    }
    //votab Main classis oleva kaardi omaniku ning teeb selle selliseks, et summat siin classis printida
    public void setOwner(String owner){
        this.owner = owner;
    }
    //prindib, kui palju on raha kaardil ja selle kaardi omaniku
    public String toString(){
        return (this.owner + ": This card has " + this.balance+ " euros");
    }
    //meetod, mis lahutab summasta 2.5, aga ei lase kogusummal alla 1 minna
    public void payEconomical(){
        double decrease = 2.50;
        if(this.balance>decrease){
        this.balance-=decrease;
        }else {
            this.balance = 1;
        }
    }
    //meetod, mis lahutab summasta 4.0, aga ei lase kogusummal alla 1 minna
    public void payGourmet(){
        double decrease = 4.0;
        if (this.balance>decrease){
            this.balance -= decrease;
        }else {
            this.balance=1;
        }
    }
    //laeb kaardile raha ja nii, et kaardil ei saa olla rohkem kui 150 eurot
    public void loadMoney(double amount) {
    if (amount>0){
        this.balance+=amount;
        if (this.balance >150){
            this.balance=150;
        }
    }
    }
    }

