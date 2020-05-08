package assigments.As_05_07_2020;

public class PlayListEntry {

    String title;
    String artist;
    int playCount=0;

    public void setInfo(String title,String artist,int playCount){
        this.title=title;
        this.artist=artist;
        this.playCount=playCount;
    }

    public void getTitle(String title){
        System.out.println(title+" is singing");
    }

    //--------------
    public void getArtist(String artist){
        System.out.println(artist+" is singing");
    }

    public void getPlayCount(int playCount){
        System.out.println("Play Count "+ playCount);
    }

    public String toString(){
        return "Title: "+title+", Artist: "+
                artist+", Play Count "+playCount;
    }

}
