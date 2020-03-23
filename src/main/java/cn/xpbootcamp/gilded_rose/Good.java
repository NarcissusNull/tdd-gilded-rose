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
            if (days <= sellIn) {
                currentQuality = this.quality - days;
            } else {
                currentQuality = this.quality - sellIn - 2 * (days - sellIn);
            }
        }
        return Math.max(currentQuality, 0);
    }
}
