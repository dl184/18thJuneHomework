import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWaterBottle {

    @Test
    public void waterbottleHasVolumeOf100() {
        WaterBottle waterbottle = new WaterBottle(100);
        assertEquals(100, waterbottle.volume());
        }

    @Test
    public void takesAwayVolumeEachTimeItsCalled() {
        WaterBottle waterbottle = new WaterBottle(100);
        assertEquals(90, waterbottle.minusvolume());
    }

    @Test
    public void empty() {
        WaterBottle waterbottle = new WaterBottle(100);
        assertEquals(0, waterbottle.emptybottle());

    }

    @Test
    public void fill() {
        WaterBottle waterbottle = new WaterBottle(100);
        assertEquals(100, waterbottle.fillup());
    }


}
