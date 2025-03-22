 class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }
}

public class Ex22 {
	public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5, 10);

        System.out.println("Área: " + retangulo.calcularArea()); // 50.0
        System.out.println("Perímetro: " + retangulo.calcularPerimetro()); // 30.0
	}
}