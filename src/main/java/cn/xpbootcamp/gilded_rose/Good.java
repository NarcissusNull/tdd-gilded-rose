package cn.xpbootcamp.gilded_rose;

public class Good {

    private int quality;

    public Good(int quality) {
        setQuality(quality);
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = Math.min(Math.max(quality, 0), 50);
    }

}
