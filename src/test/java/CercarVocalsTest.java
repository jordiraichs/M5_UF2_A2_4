import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CercarVocalsTest {

    /**
     * Tests de la funció: cercarVocals
     * Paràmetres: String , cadena 
     * retorna: Char[] amb les vocals del paràmetre
     */

     /**
      * Test per paraules úniques
      */
    @Test
    public void testCercarVocalsUnaParaula(){
        
        String entrada = "Hola";
        char[] esperat = {'o','a'};
        char[] resultat = CercarVocals.cercarVocals(entrada);
        
        assertArrayEquals(esperat,resultat);

    }


    /**
      * Test per paraules úniques
      */
    @Test
    public void testCercarVocalsStringsRaros(){
        
        String entrada = "EL meu DNI és 32323232M";
        char[] esperat = {'E','e','u','I','é','M'};
        char[] resultat = CercarVocals.cercarVocals(entrada);
        
        assertArrayEquals(esperat,resultat);

    }

}
