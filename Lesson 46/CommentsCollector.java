import java.util.*;

class Review{
    private final String comment;

    public Review(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }
}

public class CommentsCollector {
    private ArrayList<String> commentsFinder(ArrayList<Review> reviews) {
        ArrayList<String> comments = new ArrayList<>();
        int idx = 0;
        for (Review review : reviews) {
            if (!review.getComment().contains("!")){
                continue;
            }
            String formattedComment = String.format("%d-%s", idx, review.getComment());

            if (!formattedComment.endsWith("!") && !formattedComment.endsWith(".")) {
                formattedComment += ".";
            }
            comments.add(formattedComment);
            idx++;
        }
        return comments;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number of reviews:");
            int n = sc.nextInt();
            sc.nextLine(); 
            ArrayList<Review> reviews = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                System.out.print("Enter review " + (i + 1) + ":");
                String comment = sc.nextLine();
                reviews.add(new Review(comment));
            }
            CommentsCollector collector = new CommentsCollector();
            ArrayList<String> comments = collector.commentsFinder(reviews);
            System.out.println("Formatted comments:");
            for (String comment : comments) {
                System.out.println(comment);
            }

        }
    }
}
