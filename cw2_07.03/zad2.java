/**
 * Created by Tomek on 07/03/2016.
 */

abstract class First{
    First(){
        print();
    }
    abstract public void print();
}

class Second extends First{
    int i=7;
    @Override
    public void print(){
        System.out.println(i);
    }
}

public class zad2 {
    public static void main(String[]  args){
        Second sec = new Second();
        sec.print();

    }
}
