package collectionFramework;

import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.util.Objects;

public class News implements Comparable<News>{
    private String title;
    private String description;
    private LocalDate publishedDate;

    private boolean isAds;

    public boolean isAds() {
        return isAds;
    }

    public void setAds(boolean ads) {
        isAds = ads;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }

    public News() {
         }

    public News(String title, String description, LocalDate publishedDate) {
        this.title = title;
        this.description = description;
        this.publishedDate = publishedDate;
    }

    public News(String title, String description, LocalDate publishedDate, boolean isAds) {
        this.title = title;
        this.description = description;
        this.publishedDate = publishedDate;
        this.isAds=isAds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        News news = (News) o;
        return Objects.equals(title, news.title) && publishedDate.equals(news.publishedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title,publishedDate);
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", publishedDate=" + publishedDate +
                ", isAds=" + isAds +
                '}';
    }


    @Override
    public int compareTo(News o) {
        return -this.publishedDate.compareTo(o.publishedDate);
    }
}
