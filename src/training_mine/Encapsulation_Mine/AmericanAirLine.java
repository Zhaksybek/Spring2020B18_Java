package training_mine.Encapsulation_Mine;

public class AmericanAirLine {
    public static void main(String[] args) {

        EmployeeInfo agent1 = new EmployeeInfo();
        EmployeeInfo employee2 = new EmployeeInfo();

        agent1.setName("Jason Born");
        agent1.setAge(32);
        agent1.setSSN(321654);
        agent1.setSalary(180_000);

        System.out.println(agent1.getName());
        System.out.println(agent1.getAge());
        System.out.println(agent1.getSalary());
        System.out.println(agent1.getSSN());





    }
}
