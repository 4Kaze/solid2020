package pl.zzpj2020.solid.lsp.shape;

public class Rectangle extends Shape {
    private double sideA;
    private double sideB;

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public double getPerimeter() {
        return sideA * 2 + sideB * 2;
    }

    @Override
    public double getField() {
        return sideA * sideB;
    }
}
