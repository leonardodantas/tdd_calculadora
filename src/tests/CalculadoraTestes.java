package tests;

import com.company.service.Calculadora;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraTestes {

    int valorA;
    int valorB;
    Calculadora calculadora;

    @Before
    public void iniciarClasseEVariaveis(){
        valorA = 3;
        valorB = 1;
        calculadora = new Calculadora();
    }

    @Test
    public void deveSomarDoisValoresPassados(){
        int somaValores = calculadora.somarDoisNumeros(valorA,valorB);
        assertEquals(4, somaValores);
    }

    @Test
    public void deveSubtrairDoisNumeros(){
        int subtracaoValores = calculadora.subtrairDoisNumeros(valorA, valorB);
        assertEquals(2, subtracaoValores);
    }

    @Test
    public void deveDividirDoisNumeros(){
        int valoresDivididos = calculadora.deveDividirDoisNumeros(valorA,valorB);
        assertEquals(3,valoresDivididos);
    }

    @Test
    public void deveMultiplicarDoisNumeros(){
        int valorMultiplicado = calculadora.deveMultiplicarDoisNumeros(valorA, valorB);
        assertEquals(3,valorMultiplicado);
    }

    @Test(expected = Exception.class)
    public void deveLancarExcecaoAoTentarDividirPorZero(){

        int valorDividido = calculadora.deveDividirDoisNumeros(3, 0);

    }


}
