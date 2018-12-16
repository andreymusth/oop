package creational.builder;

public abstract class WebsiteBuilder {

    Website website;

    void createWebSite() {
        website = new Website();
    }

    abstract void buildName();

    abstract void buildCms();

    abstract void buildPrice();

    Website getWebsite() {
        return website;
    }
}
