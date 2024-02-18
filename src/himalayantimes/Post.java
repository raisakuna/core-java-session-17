package himalayantimes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Post {
    private static long lastPostId = -1;
    private long postId;
    private int categoryId;
    private  String title;
    private String coverImage;
    private String source;
    private String publishedAt;
    private String shortDescription;
    private String longDescription;
    private String createdAt;
    private String updatedAt;

    public Post(int categoryId, String title, String coverImage, String source, String publishedAt, String shortDescription, String longDescription ) {
        this.postId = ++lastPostId;
        this.categoryId = categoryId;
        this.title = title;
        this.coverImage = coverImage;
        this.source = source;
        this.publishedAt = publishedAt;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.createdAt = LocalDate.now().format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        ;
        this.updatedAt = LocalDate.now().format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        ;
    }
    @Override
    public String toString() {
        return String.format(" %-7s  %s  %20s  %10s  %10s  %10s  %20s  %20s  %12s %12s",
                postId,
                categoryId,
                title,
                coverImage,
                source,
                publishedAt,
                shortDescription,
                longDescription,
                createdAt,
                updatedAt);
    }


}
