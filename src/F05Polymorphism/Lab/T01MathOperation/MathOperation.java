package F05Polymorphism.Lab.T01MathOperation;

public class MathOperation {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return this.add(a, b) + c;
    }

    public int add(int a, int b, int c, int d) {
        return this.add(a, b) + this.add(c, d);
    }
}
