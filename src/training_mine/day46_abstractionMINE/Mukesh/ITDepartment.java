package training_mine.day46_abstractionMINE.Mukesh;

public abstract class ITDepartment implements Emp{


    public abstract void salary();

    @Override
    public void goodies() {
        System.out.println("Laptop");
    }

    @Override
    public void work() {
        System.out.println("Automation");
    }
}
