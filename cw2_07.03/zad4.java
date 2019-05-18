 /**
 * Created by Tomek on 07/03/2016.
 */

abstract class absClass{
    abstract void method1();
}

class newClass extends absClass{
    void method1(){

    }
}

public class zad4 {

    static void statMethod(absClass obj){
        newClass newObj = (newClass)obj;
        newObj.method1();
    }

    static void statMethod2(absClass obj){
        obj.method1();
    }

    public static void main(String[] args){
        newClass object = new newClass();
        statMethod2(object);
    }
}
