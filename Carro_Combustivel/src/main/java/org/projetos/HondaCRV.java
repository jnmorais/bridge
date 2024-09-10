package org.projetos;

public class HondaCRV extends Carro{
    public HondaCRV(float consumoBase) {
        super(consumoBase);
    }

    @Override
    public float calcularConsumo(float distancia) {
        return this.consumoBase * distancia * this.combustivel.fatorConsumo();
    }
}
