package training_mine.CustomClass.Scrum_team;

public class AppleINC {


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

        scrumTeam1.fireTester(1235);


        for ( Tester each     :   scrumTeam1.testersTeam ){
            System.out.println("Tester: "+each);
        }


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

        scrumTeam1.fireADeveloper(9876);

        System.out.println(scrumTeam1.developersTeam.size());


        for (int i=0;i<scrumTeam1.developersTeam.size();i++){
            System.out.println("Developers"+scrumTeam1.developersTeam.get(i));

        }






    }
}
