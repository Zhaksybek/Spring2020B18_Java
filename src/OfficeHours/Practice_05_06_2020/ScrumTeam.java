package OfficeHours.Practice_05_06_2020;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ScrumTeam {

    ArrayList<Tester> testersTeam = new ArrayList<>();

    ArrayList<Developer> devTeam = new ArrayList<>();


    public void hireTester(Tester tester){

        testersTeam.add(tester);
    }

    public void fireATester(long id){
        testersTeam.removeIf(p -> p.employeeId==id);
    }

    public void hireDeveloper(Developer developer){
        devTeam.add(developer);
    }

    public void fireDeveloper(long id){
        devTeam.removeIf(p->p.employeeId==id);
    }


}
