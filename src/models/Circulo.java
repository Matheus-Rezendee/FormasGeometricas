package models;

public class Circulo {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double CalcularArea() {
        double area = Math.PI * Math.pow(raio, 2);
        return area;
    }

    public double CalcularPerimetro() {
        double perimetro = (2 * Math.PI) * this.raio;
        return perimetro;
    }

    public String toString() {
        return "Área do círculo: " + String.format("%.2f", CalcularArea()) + "\nPerímetro do círculo: " + String.format("%.2f", CalcularPerimetro()) + "\nRaio do círuclo: " + this.raio;
    }

}