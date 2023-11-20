package week8.Exercise10;

public class CivilService implements NationalService {
    private int daysLeft;
    public CivilService(){
        this.daysLeft = 362;
    }
    @Override
    public int getDaysLeft(){
        return daysLeft;
    }
    @Override
    public void work(){
        if (daysLeft>0){
            daysLeft--;
        }
    }
    public static void main(String[] args) {

        CivilService civilService = new CivilService();
        MilitaryService militaryService = new MilitaryService(20);


        System.out.println("Days left before work: " + civilService.getDaysLeft());
        civilService.work();
        System.out.println("Civil Service left after work: " + civilService.getDaysLeft());
        civilService.work();
        civilService.work();
        System.out.println("Civil Service left after work: " + civilService.getDaysLeft());

        System.out.println("Military Service left before work: " + militaryService.getDaysLeft());
        militaryService.work();
        militaryService.work();
        militaryService.work();
        System.out.println("Military Service left after work: " + militaryService.getDaysLeft());
    }
}
