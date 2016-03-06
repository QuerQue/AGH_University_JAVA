/**
 * Created by Tomek on 2016-03-06.
 */
class Pierwsza{
    public void metoda1(){
        System.out.println("metoda pierwsza klasa pierwsza");
        metoda2();
    }

    public void metoda2(){

        System.out.println("metoda druga klasa pierwsza");
    }
}

class Druga extends Pierwsza{
    @Override
    public void metoda2(){

        System.out.println("metoda druga klasa druga");
    }
}

public class zad1 {
    public static void main(String[] args){
        Druga dwa = new Druga();
        Pierwsza jeden = (Pierwsza)dwa;
        jeden.metoda1();
    }
}