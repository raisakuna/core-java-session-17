package himalayantimes;

public class HimalayanTimesApplication {

    public static void main(String[] args) {

        String category = "\u001B[1mCategory:\u001B[0m";
        String post = "\u001B[1mPost:\u001B[0m";

         /* Category
        id - int
        name - String
        isDisabled - boolean
        order-int
        isDeleted -  boolean
        createdAt - String
        updatedAt -String
     */
        Category home = new Category("Home", false, 1, false);
        Category kathmandu = new Category("Kathmandu", false, 2, false);
        Category nepal = new Category("Kathmandu", false, 3, false);
        Category covid19 = new Category("Covid-19", false, 4, false);
        Category covidConnect = new Category("Covid Connect", false, 5, false);
        Category world = new Category("World", false, 6, false);
        Category opinion = new Category("opinion", false, 7, false);
        Category business = new Category("business", false, 7, false);
        Category sports = new Category("sports", false, 7, false);
        Category entertainment = new Category("entertainment", false, 7, false);
        Category more = new Category("more", false, 7, false);


        System.out.println(category);
        System.out.println(String.format(" %-5s  %-20s  %-10s  %-5s  %-10s  %-10s  %-10s ",
                "ID", "Name", "isDisabled", "Order", "isDeleted", "CreatedAt", "UpdatedAt"));
        System.out.println("===================================================================================");
        System.out.println(home);
        System.out.println(kathmandu);
        System.out.println(nepal);
        System.out.println(covid19);
        System.out.println(covidConnect);
        System.out.println(world);
        System.out.println(opinion);
        System.out.println(business);
        System.out.println(sports);
        System.out.println(entertainment);
        System.out.println(more);
        System.out.println();


        for (int i = 0; i < 90; i++) {
            System.out.print("*");
        }

        System.out.println("\n" + post);
        System.out.println(String.format("%-7s  %s  %8s  %14s  %25s  %25s  %29s  %24s  %20s %12s",
                "PostId",
                "CategoryId",
                "Title",
                "CoverImage",
                "Source",
                "PublishedAt",
                "ShortDescription",
                "LongDescription",
                "CreatedAt",
                "UpdatedAt"));


        Post inKathmandu1 = new Post(
            1,
            "PM Dahal ...",
            "https://cdn4.premiumread.com",
            "By Rastriya Samachar",
            "Published: 07:57 pm Feb 13",
            "Prime Minister Pushpa  ",
            "Lorem Ipsum is simply .. "
                      );
        Post inKathmandu2 = new Post(
                1,
                "Kp Oli ...",
                "https://cdn4.kpoli.jpeg     ",
                "By Rastriya Samachar",
                "Published: 07:57 pm Feb 13",
                "KP Oli accuses the ... ",
                "Lorem Ipsum is simply .. "
        );

System.out.println(inKathmandu1);

        System.out.println(inKathmandu2);
}

}
