import java.util.ArrayList;

public class Forest {
    static String season;
    private ArrayList<MountainHare> hare;
    public Forest(ArrayList<MountainHare> hare){
        this.hare = hare;
    }
    public void setSeason(String newSeason){
        season = newSeason;
        if(newSeason.equals("зима")){
            MountainHare.color = "белый";
        }
        else {MountainHare.color = "серо-рыжий";}
    }
    public void printHares(){
        for(MountainHare h : hare){
            System.out.println(h);
        }

    }
}