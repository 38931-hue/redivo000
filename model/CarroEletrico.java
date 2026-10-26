package model;

public class CarroEletrico extends Carro implements Recarregavel {
    private static final double TAXA_BATERIA_DIA = 15.00;
    private static final double VALOR_KWH = 0.80;

    private double consumoDiarioKwh;

    public CarroEletrico(String placa, String modelo, double valorDiaria,
                         double consumoDiarioKwh) {
        super(placa, modelo, valorDiaria);
        this.consumoDiarioKwh = consumoDiarioKwh;
    }

    public double getConsumoDiarioKwh() { return consumoDiarioKwh; }

    @Override
    public double calcularAluguel(int dias) {
        // Reaproveita o cálculo do carro e soma a taxa de bateria
        return super.calcularAluguel(dias) + TAXA_BATERIA_DIA * dias;
    }

    @Override
    public double calcularRecarga(int dias) {
        return dias * consumoDiarioKwh * VALOR_KWH;
    }
}
