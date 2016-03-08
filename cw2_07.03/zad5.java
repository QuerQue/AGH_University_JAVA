/**
 * Created by Tomek on 08/03/2016.
 */

abstract class First{
    abstract void PolePowierzchni();
}

class Kwadrat extends First{

    double a=0;

    Kwadrat(double bok){
        a = bok;
    }

    void PolePowierzchni(){
        System.out.println("Pole powierzchni kwadratu: " + a*a);
    }
}

class Kolo extends First{

    double r=0;

    Kolo(double promien){
        r = promien;
    }

    void PolePowierzchni(){
        System.out.println("Pole powierzchni kola: " + Math.PI*r*r);
    }
}

class Trojkat extends First{

    double a=0;
    double h=0;

    Trojkat(double bok, double wysokosc){
        a = bok;
        h = wysokosc;
    }

    void PolePowierzchni(){
        System.out.println("Pole powierzchni trojkata: " + 0.5*a*h);
    }
}

public class zad5 {

    static void wywolaj(First object){
        object.PolePowierzchni();
    }

    public static void main(String[] args){
        Kwadrat kwadrat = new Kwadrat(4);
        wywolaj(kwadrat);

        Kolo kolo = new Kolo(4);
        wywolaj(kolo);

        Trojkat trojkat = new Trojkat(4, 2);
        wywolaj(trojkat);
    }
}
