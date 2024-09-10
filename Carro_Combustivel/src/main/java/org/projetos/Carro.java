package org.projetos;

public  abstract class Carro {

    protected Combustivel combustivel;

    protected float consumoBase;

    public Carro(float consumoBase) {
        this.consumoBase = consumoBase;
    }

    public void setCombustivel(Combustivel combustivel) {
        this.combustivel = combustivel;
    }

    public abstract float calcularConsumo(float distancia);
}
