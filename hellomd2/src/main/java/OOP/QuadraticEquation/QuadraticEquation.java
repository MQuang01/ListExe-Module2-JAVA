package OOP.QuadraticEquation;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(){
    }

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant(){
        return b * b - 4 * a * c;
    }

    public double getRoot1(){
        return ( -b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }

    public double getRoot2(){
        return ( -b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public void getSolution(){
        double delta1 = this.getDiscriminant();
        System.out.println("Delta = " + delta1);
        if(delta1 > 0){
            System.out.println("r1 = " + this.getRoot1());
            System.out.println("r2 = " + this.getRoot2());
        }else if(delta1 == 0){
            System.out.println("Quadratic 1 root is : " + (-this.getB() / (2 * this.getA())));
        }else {
            System.out.println("No solution");
        }
    }
}
