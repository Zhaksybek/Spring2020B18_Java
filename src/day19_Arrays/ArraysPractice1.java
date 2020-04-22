package day19_Arrays;

public class ArraysPractice1 {
    public static void main(String[] args) {

        String [] friendsNames = { "Margulan", "Oljas", "Saia", "Aigerim", "Marat" };

       // System.out.println(friendsNames[4]);

        for (int i=0; i <=4; i++){
            String name = friendsNames[i];
            System.out.println(name);
        }


        String[] emails ={"cubertek@yahoo.com", "cybertek@gmail.com", "cybertek@hotmail.com","cybertek@outlook.com"};

        //ptint out all the users who registered wiht their gmail

        // max: 4

        for (int i=0; i <= 3; i++){
            String email = emails[i];

            if (email.endsWith("@gmail.com")) {
                System.out.println(email);
            }
        }






    }
}
