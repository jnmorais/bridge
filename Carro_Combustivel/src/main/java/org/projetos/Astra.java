package org.projetos;

public class Astra extends Carro{
    public Astra(float consumoBase) {
        super(consumoBase);
    }

    @Override
    public float calcularConsumo(float distancia) {
        return this.consumoBase * distancia * this.combustivel.fatorConsumo();
    }
}
