package training_mine.day40_EncapsulationMine;


public class BankOfAmerica {

    public static void main(String[] args) {
        EpmloyeeInfo Zhaks = new EpmloyeeInfo();
        Zhaks.setAddress("Almaty");
        Zhaks.setID(123);
        Zhaks.setSalary(130_000);
        Zhaks.setSSN(3697854);


        System.out.println(Zhaks.getAddress());
        System.out.println(Zhaks.getID());
        System.out.println(Zhaks.getSalary());
        System.out.println(Zhaks.getSSN());


    }
}
