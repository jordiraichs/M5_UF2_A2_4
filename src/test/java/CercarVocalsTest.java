import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CercarVocalsTest {

    @Test
    public void testCercarVocales(){
        
        String entrada = "Hola";
        char[] esperat = {'o','a'};
        char[] resultat = CercarVocals.cercarVocals(entrada);
        
        assertArrayEquals(esperat,resultat);

    }

}
