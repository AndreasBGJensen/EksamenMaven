import org.junit.Test;

import static org.junit.Assert.*;

public class MinAlderTest {

    /**
     * @author Andreas
     * Formål: At teste metoden, hvorpå det bliver verificeret at man er gammel nok til at gå til eksamen.
     * @param: Int og String
     * Fremgangsmåde: 1) Opretter et opjekt med alder og navn. Forventet output. 3) sammenligner om faktisk output er samme som forventet output.
     * Status: Godkendt
     */
    @Test
   public void gammelNok(){
    MinAlder person = new MinAlder(17,"Knud");
    String forventetOutput = "Ja du rigtig nok prøvet at være til eksamen før";




    assertTrue(forventetOutput==person.gammelNok());
}
}