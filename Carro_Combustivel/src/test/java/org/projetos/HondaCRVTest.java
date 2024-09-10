package org.projetos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HondaCRVTest {
    @Test
    public void testConsumoComGasolina() {
        Carro HondaCRV = new HondaCRV(0.20f);
        Combustivel gasolina = new Gasolina();
        HondaCRV.setCombustivel(gasolina);
        float consumo = HondaCRV.calcularConsumo(100f);
        assertEquals(20.0f, consumo, 0.01f); // Espera-se que o consumo seja 20 litros
    }

    @Test
    public void testConsumoComAlcool() {
        Carro HondaCRV = new HondaCRV(0.20f);
        Combustivel alcool = new Alcool();
        HondaCRV.setCombustivel(alcool);
        float consumo = HondaCRV.calcularConsumo(100f);
        assertEquals(24.0f, consumo, 0.01f); // Espera-se que o consumo seja 24 litros
    }

    @Test
    public void testConsumoComGasolinaAditivada() {
        Carro HondaCRV = new HondaCRV(0.20f);
        Combustivel gasolinaAditivada = new GasolinaAditivada();
        HondaCRV.setCombustivel(gasolinaAditivada);
        float consumo = HondaCRV.calcularConsumo(100f);
        assertEquals(18.0f, consumo, 0.01f); // Espera-se que o consumo seja 18 litros
    }

}