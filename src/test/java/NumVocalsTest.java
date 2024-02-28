import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumVocalsTest {
    // cal realitzar un test de proves
    // triar les funcions assert a utilitzar.
    @Test
    public void test1(){
        int resultat = CercarVocals.numVocals("HOLA");
        assertEquals(2, resultat);

    }

    @Test
    public void testVariesParules(){
        int resultat = CercarVocals.numVocals("HOLA classe com esteu");
        assertEquals(8, resultat);
        
        resultat = CercarVocals.numVocals("Kom VA Le LI MAN_NA   ErrrOOL");
        assertEquals(9, resultat);

    }


    @Test
    public void testStringBuit(){
        int resultat = CercarVocals.numVocals("");
        assertEquals(0, resultat);

    }
}
