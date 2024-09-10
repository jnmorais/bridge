package org.projetos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HondaCivicTest {
    @Test
    public void testConsumoComGasolina() {
        Carro hondaCivic = new HondaCivic(0.10f);
        Combustivel gasolina = new Gasolina();
        hondaCivic.setCombustivel(gasolina);
        float consumo = hondaCivic.calcularConsumo(100f);
        assertEquals(10.0f, consumo, 0.01f);
    }

    @Test
    public void testConsumoComAlcool() {
        Carro hondaCivic = new HondaCivic(0.10f);
        Combustivel alcool = new Alcool();
        hondaCivic.setCombustivel(alcool);
        float consumo = hondaCivic.calcularConsumo(100f);
        assertEquals(12.0f, consumo, 0.01f);
    }

    @Test
    public void testConsumoComGasolinaAditivada() {
        Carro hondaCivic = new HondaCivic(0.10f);
        Combustivel gasolinaAditivada = new GasolinaAditivada();
        hondaCivic.setCombustivel(gasolinaAditivada);
        float consumo = hondaCivic.calcularConsumo(100f);
        assertEquals(9.0f, consumo, 0.01f);
    }

}