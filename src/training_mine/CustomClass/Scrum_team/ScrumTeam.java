package training_mine.CustomClass.Scrum_team;

import java.util.ArrayList;

public class ScrumTeam {


        ArrayList<Tester> testersTeam = new ArrayList<>();

        ArrayList<Developer> developersTeam = new ArrayList<>();



    public void hireATester(Tester tester ){
        testersTeam.add(tester);

    }

    public void fireTester(long id){
        testersTeam.removeIf(p->p.employeeId==id);
    }

    public void hireADeveloper(Developer developer){
        developersTeam.add(developer);
    }

    public void fireADeveloper(long id){
        developersTeam.removeIf(p->p.employeeId==id);
    }







}
