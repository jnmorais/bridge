package org.projetos;

public class HondaCivic extends Carro{
    public HondaCivic(float consumoBase) {
        super(consumoBase);
    }

    @Override
    public float calcularConsumo(float distancia) {
        return this.consumoBase * distancia * this.combustivel.fatorConsumo();
    }
}
