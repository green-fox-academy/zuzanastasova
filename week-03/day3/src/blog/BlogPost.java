package blog;

public class BlogPost {
    String authorName;
    String title;
    String text;
    String publicationDate;

    public BlogPost() {

    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
        return;
    }

    public void setTitle(String title) {
        this.title = title;
        return;
    }

    public void setText(String text) {
        this.text = text;
        return;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
        return;
    }

    public String getBlog (){
        return authorName + " \n" + title + " \n" + publicationDate + ": \n" + text;

  }
}