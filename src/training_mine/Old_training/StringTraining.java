package training_mine.Old_training;
import java.util.Scanner;
public class StringTraining {
    public static void main(String[] args) {
      /*
      Enter your full name
      Find maxIndexNumber (length)
      Delete==? trim()
      substring()   and write firstName  lastName
      Construck GMAIL login lastName_firstName@gmail.com
      Make lower case:  GMAIL

       */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName = scan.nextLine();   // entered full name

                fullName = fullName.trim();
        int maxIndexNum = fullName.length()-1;

        boolean spaceHavent = fullName.contains(" ");

        if ( !spaceHavent){
            System.out.println("Between first name and last name must to have space  ");

        }else {

            int indexOfSpace = fullName.indexOf(" "); // Polat Alemdar
            // 0123456


            String firstName = fullName.substring(0, indexOfSpace); //Polat
            String lastName = fullName.substring(indexOfSpace + 1); // Alemdar

            // Construck GMAIL login lastName_firstName@gmail.com

            System.out.println("Choose email type: \n1. @gmail.com" +
                    "           \n2. @mail.ru" +
                    "           \n3. @yandex.ru ");
            byte typeOfEmail = scan.nextByte();

            String eMailType = (typeOfEmail == 1) ? "@gmail" : (typeOfEmail == 2) ? "@mail.ru" : (typeOfEmail == 3) ? "@yandex.ru"
                    : "Invalid type";

            String gmail = lastName.toLowerCase().concat("_").concat(firstName).concat(eMailType);

            System.out.println("Your full name is: " + fullName);
            System.out.println("Your first name is: " + firstName);
            System.out.println("Your last name is: " + lastName);
            System.out.println("Your eMail accautn is: " + gmail.toLowerCase());

            System.out.println("Do you like change your email? (Yes/No)");

            String changeEmail = scan.next();
            if (changeEmail.contains("Yes")){
                System.out.println("Type your new email:");
                String newEmail = scan.next();

                System.out.println("Your full name is: " + fullName);
                System.out.println("Your first name is: " + firstName);
                System.out.println("Your last name is: " + lastName);
                System.out.println("Your eMail accautn is: " + newEmail.toLowerCase());
            }else {

                System.out.println("Your full name is: " + fullName);
                System.out.println("Your first name is: " + firstName);
                System.out.println("Your last name is: " + lastName);
                System.out.println("Your eMail accautn is: " + gmail.toLowerCase());

            }


        }


    }
}
