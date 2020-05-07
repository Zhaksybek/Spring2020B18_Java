package training_mine.CustomClass.Scrum_team;

public class TestersObject {

    public static void main(String[] args) {

        Tester tester1 = new Tester();
        tester1.setInfo("Mako", "QA",100_000,123);

        Tester tester2 = new Tester();
        tester2.setInfo("Jake", "SDET",110_000,1234);

        Tester tester3 = new Tester();
        tester3.setInfo("Abeke", "Junior SDET",90_000,1235);

        System.out.println(tester3);




    }
}
