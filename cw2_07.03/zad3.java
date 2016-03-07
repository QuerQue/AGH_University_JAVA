/**
 * Created by Tomek on 07/03/2016.
 */

abstract class First{
    abstract void print();
}

class Second extends First{

    void print(){
        System.out.println(this.getClass().getName());
    }
}

class Third extends First{
    void print(){
        System.out.println(this.getClass().getName());
    }
}

public class zad3 {
    static void statMethod(First obj){
        if(obj instanceof Second) {
            Second objPoch1 = (Second) obj;
            objPoch1.print();
        }
        else if (obj instanceof Third){
            Third objPoch2 = (Third)obj;
            objPoch2.print();
        }
        else{
            System.out.println("Przekazany obiekt jest innej klasy");
        }
    }
    public static void main(String[] args){
        Second obj1= new Second();
        Third obj2 = new Third();
        statMethod(obj1);
        statMethod(obj2);
    }
}
