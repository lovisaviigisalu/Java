package week4.Exercise75;

public class DecreasingCounter {
    private int value; //maletab talle antud vaartust
    private int initial; //maletab algvaartust


    //kuidas nad oma vaartused saavad
    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.initial = valueAtStart;
    }

    //see meetod prindib vaartuse
    public void printValue() {
        System.out.println("value: " + this.value);
    }


    //see meetod vahendab 1 vorra talle antud numbrit
    public void decrease() {
        this.value -=1;
        if (this.value <0 ){
            this.value = 0;
        }
    }


    //see meetod resetib nulli selkle, mis talle antakse
    public void  reset(){
        this.value=0;
    }


    //see meetod valjastab vaartuseks algvaartuse
    public void setInitial(){
        this.value = this.initial;
    }
}
