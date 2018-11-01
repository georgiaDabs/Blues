import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
public class Blues
{
    ArrayList<String> places=new ArrayList<>();
    ArrayList<String> names=new ArrayList<>();
    public Blues(){

        String a="highway";
        places.add(a);
        a="jailhouse";
        places.add(a);
        a="empty bed";
        places.add(a);
        a="bottom of a whiskey glass";
        places.add(a);
        a="Sadie";
        names.add(a);
        a="Big Mama";
        names.add(a);
        a="Bessie";
        names.add(a);
        a="Fat River Dumpling";
        names.add(a);
    }

    public void newAutoSong(){

        String place1=getPlace();
        String place2=getPlace();
        String name=getName();
        printSong(name, place1, place2);
    }

    public void newSong(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a name");
        String name=sc.nextLine();
        System.out.println("Enter a place");
        String place1 =sc.nextLine();
        System.out.println("Enter another place");
        String place2 =sc.nextLine();
        printSong(name,place1,place2);
    }

    public void printSong(String name,String place1,String place2){

        String song="I went down to the "+place1+","+"\n"+
            "Fell down on my knees."+"\n"+
            "I went down to the "+place1+","+"\n"+
            "Fell down on my knees."+"\n"+
            "Asked the Lord above for mercy,"+"\n"+
            "Save me if you please."+"\n"+

            "I went down to the "+place1+","+"\n"+
            "Tried to flag a ride."+"\n"+
            "I went down to the "+place1+","+"\n"+
            "Tried to flag a ride."+"\n"+
            "Nobody seemed to know me,"+"\n"+
            "Everybody passed me by."+"\n"+

            "I'm going down to "+place2+","+"\n"+
            "Take my rider by my side."+"\n"+
            "I'm going down to "+place2+","+"\n"+
            "Take my rider by my side."+"\n"+
            "You can still barrelhouse, baby,"+"\n"+
            "On the riverside."+"\n"+

            "You can run, you can run,"+"\n"+
            "Tell my friend-boy "+name+"."+"\n"+
            "You can run, you can run,"+"\n"+
            "Tell my friend-boy "+name+"."+"\n"+
            "And I'm standing at the "+place1+","+"\n"+
            "Believe I'm sinking down. ";
        System.out.print(song);
        System.out.println("By "+getName());
    }

    public String getPlace(){
        Random rn=new Random();
        int i=rn.nextInt(places.size());
        String place=places.get(i);
        places.remove(i);
        return place;
    }

    public String getName(){
        Random rn=new Random();
        int i=rn.nextInt(places.size());
        String name=names.get(i);
        names.remove(i);
        return name;
    }

}
