package training_mine.day46_abstractionMINE.Mukesh;

public class HRTeam extends ITDepartment{

    public static void main(String[] args) {

        // 1st Scenario
    HRTeam hr = new HRTeam();
    hr.goodies();
    hr.work();
    hr.salary();

    ITDepartment it = new HRTeam();
    it.goodies();
    it.work();
    it.salary();

    // ITDepartment it1 = new ITDepartment();

        // If your class is not fully implemented then we will not allow to create object


    }

    public void bonus(){
        System.out.println("Bonus is 1000$");
    }

    @Override
    public void salary(){
        System.out.println("5LPA");
    }


}
