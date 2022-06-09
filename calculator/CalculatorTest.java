
package com.poe.demotestunitaire.calculator;

import com.poe.demotestunitaire.caculator.Calculator;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


public class CalculatorTest {
    @Test
    public void testGetNombersImpairs() {
        Calculator calculator=new Calculator();
        ArrayList<Integer>result=calculator.getNombresImpairs(5);
        assertEquals(3,result.size());
        assertTrue(result.contains(3));
    }
      @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4})
    void testParametreAvecValueSource(int valeur) {
        assertEquals(valeur + valeur, valeur * 2);
    }

    @ParameterizedTest
    @CsvSource({"1, 1", "1, 2", "2, 3"})
    void testAdditioner(int a, int b) {
        int attendu = a + b;
        assertEquals(attendu, a + b);
    }

    @ParameterizedTest
    @CsvSource({"1, 1, 2", "1, 2, 3", "2, 3, 5"})
    void testAdditionerAvecResultat(int a, int b, int result) {
        assertEquals(result, a + b);
    }

    @ParameterizedTest
    @CsvSource({"1, 1, 1", "1, 2, 2", "5, 3, 5", "-1, -4, -1"})
    void testMaxAvecJeuDeDonnees(int a, int b, int result) {
        Calculator calculator = new Calculator();

        assertEquals(result, calculator.max(a, b));
    }

    private void assertEquals(int result, int i) {
        throw new UnsupportedOperationException("Not supported yet.");
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
