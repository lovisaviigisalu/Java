package week4.Exercise75;

public class Main {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(100);

        counter.printValue();//kutsub esile meetodi, mis väljastab numbri

        counter.decrease();//kutsub esile meetodi, mis vähendab väärtust
        counter.printValue();//kutsub esile meetodi, mis väljastab numbri(vähendatud väärtusega)

        counter.reset();//kutsub esile meetodi, mis seab väärtuse nulliks
        counter.printValue();//kutsub esile meetodi, mis väljastab numbri(0)

        counter.setInitial();//kutsub esile meetodi, mis seab numbri algsele väärutsele
        counter.printValue();//kutsub esile meetodi, mis väljastab numbri(algse väärtuse)

    }
}
