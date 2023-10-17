package Week7.Exercise4;

public class Thing {
    private String nimi;
    private int kaal;
    public Thing(String nimi, int kaal){
        this.kaal=kaal;
        this.nimi=nimi;
    }
    public String getNimi() {
        return nimi;
    }
    public int getKaal() {
        return kaal;
    }
    public String toString(){
        return (this.nimi + " (" + this.kaal + " kg)");
    }
}
