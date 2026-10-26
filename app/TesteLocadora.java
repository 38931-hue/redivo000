package app;

import java.util.ArrayList;
import java.util.List;

import model.Carro;
import model.CarroEletrico;
import model.Moto;
import model.Recarregavel;
import model.Veiculo;

public class TesteLocadora {
    public static void main(String[] args) {

        // 1) Veículo genérico não pode ser criado.
        // Veiculo v = new Veiculo("XXX-0000", "Generico", 100.0);
        // Não compila: Veiculo é abstrata, e uma locadora só aluga veículos
        // de um tipo concreto (carro, moto, elétrico), cada um com seu cálculo.

        Carro carro = new Carro("ABC-1234", "Onix", 150.0);
        Moto moto4 = new Moto("MOT-0004", "CG 160", 80.0);
        Moto moto5 = new Moto("MOT-0005", "CG 160", 80.0);
        CarroEletrico eletrico = new CarroEletrico("ELE-2026", "Dolphin", 200.0, 10.0);

        // 2) Mesma lista, um único laço, sem instanceof e sem cast
        List<Veiculo> veiculos = new ArrayList<>();
        List<Integer> dias = new ArrayList<>();
        veiculos.add(carro);    dias.add(3);
        veiculos.add(moto4);    dias.add(4);
        veiculos.add(moto5);    dias.add(5);
        veiculos.add(eletrico); dias.add(3);

        System.out.println("=== Aluguéis ===");
        for (int i = 0; i < veiculos.size(); i++) {
            Veiculo v = veiculos.get(i);
            int d = dias.get(i);
            v.imprimirResumo();
            System.out.println("Aluguel (" + d + " dias): " + v.calcularAluguel(d));
        }

        // 3) Recarga: só quem implementa Recarregavel, usando apenas esse tipo
        List<Recarregavel> recarregaveis = new ArrayList<>();
        recarregaveis.add(eletrico);

        System.out.println("=== Recargas ===");
        for (Recarregavel r : recarregaveis) {
            System.out.println("Recarga (3 dias): " + r.calcularRecarga(3));
        }
    }
}