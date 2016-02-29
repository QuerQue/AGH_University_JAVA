/**
 * Created by Tomek on 2016-02-29.
 */

public class ComplexNumber{

    private double a;
    private double b;

    void Write(){
        System.out.print(a + " i"+b + "\n");
    }

    void SetValue(double warA, double warB) {
        a = warA;
        b = warB;
    }

    static ComplexNumber Add(ComplexNumber z1, ComplexNumber z2){
        ComplexNumber z3 = new ComplexNumber();
        z3.a = z1.a + z2.a;
        z3.b = z1.b + z2.b;

        return z3;
    }

    public static void main(String[] main){

        ComplexNumber Complx1 = new ComplexNumber();
        ComplexNumber Complx2 = new ComplexNumber();
        ComplexNumber Complx3;

        Complx1.SetValue(1.0, 1.0);
        Complx1.Write();
        System.out.print("\n");
        Complx2.SetValue(2.0, 2.0);
        Complx2.Write();
        System.out.print("\n");
        Complx3 = ComplexNumber.Add(Complx1, Complx2);
        System.out.print("Result of adding: ");
        Complx3.Write();

    }
}