package week5.exercise84;
//Klass hoiab endas arvu, mis saab suurendada ja vähendada. Sellel on valikuline kontroll, mis takistab/ei takista sellel arvul minna alla 0.
public class Counter {
    private int value;
    private boolean check;

    //Kui "check" parameeter on "true", siis on kontroll sisse lülitatud.
    public Counter(int startingValue, boolean check) {
        this.value = startingValue;
        this.check = check;
    }
    //Loob uue lugeja antud väärtusega ja sellel uuel lugejal on vaikimisi kontroll välja lülitatud.
    public Counter(int startingValue) {
        this(startingValue, false);
    }
    //loob uue lugeja, mille algväärtus on 0. Kui "check" parameeter on true, siis on kontroll sisse lülitatud.
    public Counter(boolean check){
        this(0, check);
    }
    //loob uue lugeja, mille algväärtus on 0 ja kontroll on välja lülitatud.
    public Counter(){
        this(0,false);
    }
    // tagastab lugeja praeguse väärtuse.


    public int getValue() {
        return value;
    }

    //suurendab lugeja väärtust ühe võrra.
    public void increase(){
        value+=1;
    }
    //vähendab lugeja väärtust ühe võrra, kuid mitte alla 0, kui kontroll on sisse lülitatud.
    public void decrease(){
       if (check && value>0){
           value-=1;
       } else if (!check) {
           value -=1;
       }
    }
    public void increase(int increaseAmount){
        if (increaseAmount>=0){
            value += increaseAmount;
        }
    }
    public void decrease(int decreaseAmount){
        if (decreaseAmount >0){
            if (check){
                if(value - decreaseAmount >=0){
                    value-=decreaseAmount;
                }else{
                    value = 0;
                }

            } else{
               value -=decreaseAmount;
        }}
    }
}
