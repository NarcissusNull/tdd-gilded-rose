package cn.xpbootcamp.gilded_rose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoodTests {

    @Test
    void should_set_quality_0_when_set_quality_given_quality_less_than_0() {
        // given
        int quality = -10;
        Good good = new Good(10);

        // when
        good.setQuality(quality);

        // then
        assertEquals(0, good.getQuality());
    }

    @Test
    void should_set_quality_50_when_set_quality_given_quality_more_than_50() {
        // given
        int quality = 60;
        Good good = new Good(10);

        // when
        good.setQuality(quality);

        // then
        assertEquals(50, good.getQuality());
    }

}
