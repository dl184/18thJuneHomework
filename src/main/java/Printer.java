public class Printer {

    private int paperLeft;
    private int tonerVolume;


    public Printer(int paperLeft, int tonerVolume) {
        this.paperLeft = paperLeft;
        this.tonerVolume = tonerVolume;
    }

    public int getPaperLeft() {
        return this.paperLeft;
    }

    public int getTonerVolume() {
        return this.tonerVolume;
    }

    public void print(int pages, int copies) {
        if ((pages * copies) < paperLeft) {
            paperLeft -= pages * copies;
            tonerVolume -= (pages * copies);
        }
    }
        public void refill() {
            paperLeft += 100;
        }
}

