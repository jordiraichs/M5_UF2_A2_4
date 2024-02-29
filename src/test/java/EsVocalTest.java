import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EsVocalTest {

    char entrada;  // caràcter per comprovar
    boolean sortidaesperada; // sortida  esperada de la funció esVocal

    /***  Test de vocals --> esperem TRUE   ***/
   @Test
   public void testCaractersNormals(){

        entrada = 'U';
        sortidaesperada = CercarVocals.esVocal(entrada);
        assertTrue(sortidaesperada);

        entrada = 'a';
        sortidaesperada = CercarVocals.esVocal(entrada);
        assertTrue(sortidaesperada);

        entrada = 'E';
        sortidaesperada = CercarVocals.esVocal(entrada);
        assertTrue(sortidaesperada);

        entrada = 'I';
        sortidaesperada = CercarVocals.esVocal(entrada);
        assertTrue(sortidaesperada);
        
   }

    /***  Test de constants --> esperm FALSE   ***/
    @Test
    public void testConsonans(){

        entrada = 'D';
        sortidaesperada = CercarVocals.esVocal(entrada);
        assertFalse(sortidaesperada);

        entrada = 'w';
        sortidaesperada = CercarVocals.esVocal(entrada);
        assertFalse(sortidaesperada);
    
    }

    /***  Test de caracters que podem trobar en un text --> esperm FALSE   ***/
    @Test
    public void testCaractesEspecials(){

        entrada = '$';
        sortidaesperada = CercarVocals.esVocal(entrada);
        assertFalse(sortidaesperada);

        entrada = '@';
        sortidaesperada = CercarVocals.esVocal(entrada);
        assertFalse(sortidaesperada);

        entrada = '€';
        sortidaesperada = CercarVocals.esVocal(entrada);
        assertFalse(sortidaesperada);
    }

   

}
