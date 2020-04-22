package day09_Nested_If_Ternary;

public class nestedIF {
    public static void main(String[] args) {

        boolean USCitizen = true;
        byte age = 17;
        if (USCitizen) {
            if (age > 17) {
                System.out.println("You are eligible to vote");
            } else {
                System.out.println("You can vote after "+(18-age) + " year");
            }
        }else {
            System.out.println("Only the US citizens are eligible to vote for Donald Trump");
        }

        String canVote = (USCitizen)? ((age>17)? "You are eligible to vote":"You can vote after "+(18-age) + " year")
                :"Only the US citizens are eligible to vote for Donald Trump";
        System.out.println(canVote);

        System.out.println("====================================================");

        int score =70;


        String grade = (score >=0 && score<=100)?((score>=90)? "A": (score>=80)? "B"
                : (score>=70)? "C":(score >=60)? "D" :"F") : "Invalid";
        System.out.println(grade);







    }
}
