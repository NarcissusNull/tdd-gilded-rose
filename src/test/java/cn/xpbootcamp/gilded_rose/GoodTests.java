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

    @Test
    void should_get_quality_less_than_init_when_time_goes_by_given_normal_good() {
        // given
        int days = 10;
        Good good = new Good(20, 30, "normal");

        // when
        int result = good.getCurrentQuality(days);

        // then
        assertEquals(20, result);
    }

    @Test
    void should_set_current_quality_0_when_get_current_quality_given_quality_less_than_0() {
        // given
        int days = 10;
        Good good = new Good(20, 5, "normal");

        // when
        int result = good.getCurrentQuality(days);

        // then
        assertEquals(0, result);
    }

    @Test
    void should_reduce_quality_by_double_speed_when_time_goes_by_given_normal_good_and_dsys_more_than_sellIn() {
        // given
        int days = 10;
        Good good = new Good(5, 30, "normal");

        // when
        int result = good.getCurrentQuality(days);

        // then
        assertEquals(15, result);
    }

    @Test
    void should_not_change_quality_when_time_goes_by_given_type_is_Sulfuras() {
        // given
        int days = 10;
        Good good = new Good(20, 30, "Sulfuras");

        // when
        int result = good.getCurrentQuality(days);

        // then
        assertEquals(30, result);
    }

    @Test
    void should_get_quality_more_than_init_when_time_goes_by_given_type_is_Aged_Brie() {
        // given
        int days = 10;
        Good good = new Good(20, 30, "Aged Brie");

        // when
        int result = good.getCurrentQuality(days);

        // then
        assertEquals(40, result);
    }

    @Test
    void should_get_quality_50_init_when_time_goes_by_given_type_is_Aged_Brie_and_quality_more_than_50() {
        // given
        int days = 40;
        Good good = new Good(20, 30, "Aged Brie");

        // when
        int result = good.getCurrentQuality(days);

        // then
        assertEquals(50, result);
    }

    @Test
    void should_get_quality_more_than_init_when_time_goes_by_given_type_is_Backstage_pass_and_time_before_Performance_day_more_10_days() {
        // given
        int days = 10;
        Good good = new Good(30, 10, "Backstage pass");

        // when
        int result = good.getCurrentQuality(days);

        // then
        assertEquals(20, result);
    }

    @Test
    void should_rise_quality_2_each_day_when_time_goes_by_given_type_is_Backstage_pass_and_time_before_Performance_day_less_than_10_days() {
        // given
        int days = 14;
        Good good = new Good(20, 10, "Backstage pass");

        // when
        int result = good.getCurrentQuality(days);

        // then
        assertEquals(28, result);
    }

    @Test
    void should_rise_quality_3_each_day_when_time_goes_by_given_type_is_Backstage_pass_and_time_before_Performance_day_less_than_5_days() {
        // given
        int days = 17;
        Good good = new Good(20, 10, "Backstage pass");

        // when
        int result = good.getCurrentQuality(days);

        // then
        assertEquals(36, result);
    }

    @Test
    void should_set_current_quality_0_when_time_goes_by_given_type_is_Backstage_pass_and_Performance_day_is_over() {
        // given
        int days = 21;
        Good good = new Good(20, 10, "Backstage pass");

        // when
        int result = good.getCurrentQuality(days);

        // then
        assertEquals(0, result);
    }
}