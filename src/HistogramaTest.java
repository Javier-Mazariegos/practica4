import org.junit.Test;
import static org.junit.Assert.*;

    
public class HistogramaTest {
        
    @Test
    public void test() {
        String s = "aaaaaaaaaaeeeeeeeeeiiiiiiiiooooooouuuuuubbbbbccccdddffg";
        s = s.toUpperCase();
        int[][] cont = new int[26][2];
        Histograma.llenar(cont);
        assertEquals(10, Histograma.topchars(s, cont)[9][1]);
    }
}
    