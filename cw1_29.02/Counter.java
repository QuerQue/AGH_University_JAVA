/**
 * Created by Tomek on 2016-02-29.
 */
 
public class Counter{ 
    static int numOfObjects=0;

    Counter() {
        numOfObjects++;
    }

    public static void main(String[] args){

        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();
        Counter obj4 = new Counter();
        Counter obj5 = new Counter();

        System.out.print(obj3.numOfObjects);

    }
}
