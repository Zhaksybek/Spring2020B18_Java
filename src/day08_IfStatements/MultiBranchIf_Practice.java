package day08_IfStatements;

public class MultiBranchIf_Practice {
    public static void main(String[] args) {
        double score = 0; // max score ==>100
        boolean AGrade = score >= 90 && score<=100;
        boolean BGreater = score >= 80 && score <90;
        boolean CGrade = score >=70 && score <80;
        boolean DGrade = score>=60 && score<70;
        boolean FGrade = score<60 && score>0;

        char grade = ' ';

        if (AGrade){
            grade = 'A';
        }else if(BGreater){
            grade ='B';
        } else if (CGrade){
            grade = 'C';
        }else if (DGrade){
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Score "+score+" is: "+grade);



        /*
        String grade = "";
        if(score>100 ||score<0){
            System.out.println("score should be between (0 -100) Please reenter");
        }
        if (AGrade){
            grade = "A";
        }else if(BGreater){
            grade ="B";
        } else if (CGrade){
            grade = "C";
        }else if (DGrade){
            grade = "D";
        } else if(FGrade) {
            grade = "F";
        }

        System.out.println("Score "+score+" is: "+grade);

         */



    }
}
