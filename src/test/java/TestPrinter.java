import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestPrinter {


    @Test
    public void printerHasPaperLeft() {
        Printer printer = new Printer(15, 30);
        printer.print(2, 4);
        assertEquals(7, printer.getPaperLeft());
    }

    @Test
    public void printerCannotPrint() {
        Printer printer = new Printer(15, 30);
        printer.print(3, 9);
        assertEquals(15, printer.getPaperLeft());
    }

    @Test
    public void tonerVolume() {
        Printer printer = new Printer(15, 30);
        printer.print(2, 3);
        assertEquals(24, printer.getTonerVolume());
    }

    @Test
    public void tonerVolumLow() {
        Printer printer = new Printer(15, 30);
        printer.print(4,30);
        assertEquals(30, printer.getTonerVolume());
        }

        @Test
    public void refillPaper() {
            Printer printer = new Printer(15, 30);
            printer.refill();
            assertEquals(115, printer.getPaperLeft());
        }


        }













