import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculadoraTeste {

    @Test
    public void DiferencaTest (){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.Diferenca(5,3);
        assertEquals(2,resultado);
    }

    @Test
    public void DivisaoTest (){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.Divisao(14,2);
        assertEquals(7,resultado);
    }
    @Test
    public void ProdutoTest (){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.Produto(4,3);
        assertEquals(12,resultado);
    }
    @Test
    public void SomaTest (){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.Soma(2,2);
        assertEquals(4,resultado);
    }

}
