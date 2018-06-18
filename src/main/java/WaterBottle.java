public class WaterBottle {

    private int vol;

    public WaterBottle(int vol){
        this.vol = vol;
    }


    public int volume() {
        return this.vol;
    }

    public int minusvolume() {
       return vol - 10;

    }

    public int emptybottle(){
        return vol = 0;
    }

    public int fillup(){
        return vol = 100;

    }
}


