package cn.xpbootcamp.gilded_rose;

public class Good {

    private int quality;
    private int sellIn;
    private String type;

    public Good(int quality) {
        setQuality(quality);
    }

    public Good(int sellIn, int quality, String type) {
        this.setQuality(quality);
        this.sellIn = sellIn;
        this.type = type;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = Math.min(Math.max(quality, 0), 50);
    }

    public int getCurrentQuality(int days) {
        int currentQuality = 0;
        if ("normal".equals(type)) {
            currentQuality = this.quality - days - Math.max(days - sellIn, 0);
        } else if("Sulfuras".equals(type)) {
            currentQuality = this.quality;
        } else if("Aged Brie".equals(type)) {
            currentQuality = this.quality + days;
        }
        return Math.max(currentQuality, 0);
    }
}
