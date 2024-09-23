package Test;

import static org.junit.jupiter.api.Assertions.*;
import Source.FizzyPrinter;
import org.junit.jupiter.api.Test;

class FizzyPrinterTest {
    @Test
    public void printFizzyFizz()
    {
        FizzyPrinter fp3 = new FizzyPrinter();
        assertEquals("Fizz", fp3.printFizzy(3));
    }
    public void printFizzyBuzz()
    {
        FizzyPrinter fp5 = new FizzyPrinter();
        assertEquals("Buzz", fp5.printFizzy(5));
    }
    public void printFizzyBang()
    {
        FizzyPrinter fp7 = new FizzyPrinter();
        assertEquals("Buzz", fp7.printFizzy(7));
    }
}