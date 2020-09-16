package blog;

public class Main {
    public static void main(String[] args) {

        BlogPost firstBlog = new BlogPost();
        firstBlog.setAuthorName ("John Doe");
        firstBlog.setTitle("Lorem Ipsum");
        firstBlog.setPublicationDate("2000.05.04.");
        firstBlog.setText("Lorem ipsum dolor sit amet.");

        BlogPost secondBlog = new BlogPost();
        secondBlog.setAuthorName ("Tim Urban");
        secondBlog.setTitle("Wait but why");
        secondBlog.setPublicationDate("2010.10.10.");
        secondBlog.setText("A popular long-form, stick-figure-illustrated blog about almost everything.");

        BlogPost thirdBlog = new BlogPost();
        thirdBlog.setAuthorName ("William Turton");
        thirdBlog.setTitle("One Engineer Is Trying to Get IBM to Reckon With Trump");
        thirdBlog.setPublicationDate("2017.03.28.");
        thirdBlog.setText ("Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.");

        System.out.println(thirdBlog.getBlog());
    }
}
