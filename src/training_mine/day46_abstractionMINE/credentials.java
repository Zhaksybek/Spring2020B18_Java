package training_mine.day46_abstractionMINE;

public class credentials {

    final private String username = "Cubertek";
    final private String PassWord = "CtberTek12345";

   /* public void setUsername(String username) {
        this.username=username;
    }
    we cannot generate set method if variable is final
    final means ==> constanta
    */


    public String getUsername() {
        return username;
    }

    public String getPassWord() {
        return PassWord;
    }
}
