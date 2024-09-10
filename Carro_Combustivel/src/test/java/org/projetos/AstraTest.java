package org.projetos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AstraTest {
    @Test
    public void testConsumoComGasolina() {
        Carro astra = new Astra(0.12f);
        Combustivel gasolina = new Gasolina();
        astra.setCombustivel(gasolina);
        float consumo = astra.calcularConsumo(100f);
        assertEquals(12.0f, consumo, 0.01f);
    }

    @Test
    public void testConsumoComAlcool() {
        Carro astra = new Astra(0.12f);
        Combustivel alcool = new Alcool();
        astra.setCombustivel(alcool);
        float consumo = astra.calcularConsumo(100f);
        assertEquals(14.4f, consumo, 0.01f);
    }

    @Test
    public void testConsumoComGasolinaAditivada() {
        Carro astra = new Astra(0.12f);
        Combustivel gasolinaAditivada = new GasolinaAditivada();
        astra.setCombustivel(gasolinaAditivada);
        float consumo = astra.calcularConsumo(100f);
        assertEquals(10.8f, consumo, 0.01f);
    }

}