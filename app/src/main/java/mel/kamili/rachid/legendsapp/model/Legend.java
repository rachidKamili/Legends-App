package mel.kamili.rachid.legendsapp.model;

public class Legend {
    private String name;
    private int tier;
    private String slogan;
    private String description;
    private String logo;
    private String image;
    private String sound;

    public Legend(String name, int tier, String slogan, String description, String logo, String image, String sound) {
        this.name = name;
        this.tier = tier;
        this.slogan = slogan;
        this.description = description;
        this.logo = logo;
        this.image = image;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
