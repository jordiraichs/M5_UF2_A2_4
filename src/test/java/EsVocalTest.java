import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EsVocalTest {

    @Test
    public void testCaractersRaros(){
        char c = ' '; // altres caracters ',/,(,...
        assertFalse(CercarVocals.esVocal(c));
    }

    @Test
    public void testVocalsMajuscula(){
        char c = 'A'; // E, I, O, U
        assertTrue(CercarVocals.esVocal(c));
    }

    @Test
    public void testVocalsMinuscula(){
        char c = 'a'; // e, i, o, u
        assertTrue(CercarVocals.esVocal(c));
    }

    @Test
    public void testNoVocals(){
        char c = 's'; // f,g,F,G,L,0,2,1,-1 s'ha de fer el màx proves
        assertFalse(CercarVocals.esVocal(c));
    }
}
