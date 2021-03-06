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
        int currentQuality;
        switch (type) {
            case "normal":
                currentQuality = this.quality - days - Math.max(days - sellIn, 0);
                break;
            case "Sulfuras":
                currentQuality = this.quality;
                break;
            case "Aged Brie":
                currentQuality = this.quality + days;
                break;
            case "Backstage pass":
                if (days > sellIn) {
                    currentQuality = 0;
                } else {
                    currentQuality = this.quality + days + Math.max(days + 10 - sellIn, 0) + Math.max(days + 5 - sellIn, 0);
                }
                break;
            default:
                currentQuality = 0;
        }
        return Math.min(Math.max(currentQuality, 0), 50);
    }
}
