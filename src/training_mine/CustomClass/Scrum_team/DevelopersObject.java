package training_mine.CustomClass.Scrum_team;

public class DevelopersObject {
    public static void main(String[] args) {

        Developer developer1 = new Developer();
        developer1.setInfo("Bake","Senior Developer", 140_000,987);

        Developer developer2 = new Developer();
        developer2.setInfo("Take","Junior Developer", 100_000,9876);

        Developer developer3 = new Developer();
        developer3.setInfo("Make","Developer", 111_000,98765);


        System.out.println("===================================");
        // developer2.coding();

        Developer[] arr = {developer1,developer2,developer3};




    }
}
