package training_mine.CustomClass.Scrum_team;

import java.util.ArrayList;

public class Google {
    public static void main(String[] args) {

        Tester tester1 = new Tester();
        tester1.setInfo("Mako", "QA",100_000,123);

        Tester tester2 = new Tester();
        tester2.setInfo("Jake", "SDET",110_000,1234);

        Tester tester3 = new Tester();
        tester3.setInfo("Monica", "Junior SDET",130_000,1235);

        ScrumTeam scrumTeam1 = new ScrumTeam();


        scrumTeam1.hireATester(tester1);
        scrumTeam1.hireATester(tester2);
        scrumTeam1.hireATester(tester3);


        System.out.println("============Dev Team ==================================");

        Developer developer1 = new Developer();
        developer1.setInfo("Bake","Senior Developer", 140_000,987);

        Developer developer2 = new Developer();
        developer2.setInfo("Take","Junior Developer", 100_000,9876);

        Developer developer3 = new Developer();
        developer3.setInfo("Make","Developer", 111_000,98765);


        scrumTeam1.hireADeveloper(developer1);
        scrumTeam1.hireADeveloper(developer2);
        scrumTeam1.hireADeveloper(developer3);

        System.out.println("================ SCRUM 2 ===============================================");

        ScrumTeam scrumTeam2 = new ScrumTeam();


        Tester tester4 = new Tester();
        tester4.setInfo("Darhan", "QA",100_000,0001);

        Tester tester5 = new Tester();
        tester5.setInfo("Medet", "SDET",110_000,1234);

        scrumTeam2.hireATester(tester4);
        scrumTeam2.hireATester(tester5);


        //  scrumTeam2.hire ==> 4 developer

        Developer developer4 = new Developer();
        developer4.setInfo("Marat","Senior Developer", 140_000,987);

        Developer developer5 = new Developer();
        developer5.setInfo("Margulan","Junior Developer", 100_000,9876);

        Developer developer6 = new Developer();
        developer6.setInfo("Oljas","Developer", 120_000,98765);

        Developer developer7 = new Developer();
        developer7.setInfo("Saia","Junior Developer", 100_000,9876);

        Developer developer8 = new Developer();
        developer8.setInfo("Arman","Developer", 130_000,98765);



        System.out.println("================ SCRUM 3 ===============================================");

        ScrumTeam scrumTeam3 = new ScrumTeam();

        Tester tester6 = new Tester();
        tester6.setInfo("Darhan", "QA",100_000,0001);

        Tester tester7 = new Tester();
        tester7.setInfo("Medet", "SDET",110_000,1234);

        Tester tester8 = new Tester();
        tester8.setInfo("Medet", "SDET",110_000,1234);

        scrumTeam3.hireATester(tester6);
        scrumTeam3.hireATester(tester7);
        scrumTeam3.hireATester(tester8);



        //  scrumTeam3.hire ==> 5 developer

        Developer developer9 = new Developer();
        developer9.setInfo("Ersin","Senior Developer", 140_000,987);

        Developer developer10 = new Developer();
        developer10.setInfo("Daulet","Junior Developer", 100_000,9876);

        Developer developer11 = new Developer();
        developer11.setInfo("Ermek","Developer", 120_000,98765);

        Developer developer12 = new Developer();
        developer12.setInfo("Aray","Junior Developer", 100_000,9876);

        Developer developer13 = new Developer();
        developer13.setInfo("Erke","Developer", 130_000,98765);


        System.out.println("===============================================================");


        ArrayList<ScrumTeam> scrumTeams1 =new ArrayList<>();




/*
        for (int i=0;i<scrumTeam2.testersTeam.size();i++){
            System.out.println("Google's scrum team2 "+  scrumTeam2.testersTeam.get(i)   );
        }

 */









/*
        Tester tester3 = new Tester();
        tester3.setInfo("Aidana", "Junior SDET",130_000,1235);

 */




    }
}
