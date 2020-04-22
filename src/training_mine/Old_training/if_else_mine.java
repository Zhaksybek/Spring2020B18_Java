package training_mine.Old_training;

public class if_else_mine {
    public static void main(String[] args) {

        double salary = 110000;
        float yearsOnJob = 5;

        if(salary>=50000){
            if(yearsOnJob>=5){
                System.out.println("You qualitify for the loan");
            }else {
                System.out.println("You must have been your current job at least 2 years to qualify");
            }
        }else {
            System.out.println("You must earn at least $ 50.000 per year");
        }


    }
}
