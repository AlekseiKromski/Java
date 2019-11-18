package myclasses;

public class Author {
    private String authorName;
    private String authorDesc;

    public Author(String authorName, String authorDesc) {
        this.authorName = authorName;
        this.authorDesc = authorDesc;
    }

    public Author() {
        this.authorName = "none";
        this.authorDesc = "none";
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorDesc() {
        return authorDesc;
    }

    public void setAuthorDesc(String authorDesc) {
        this.authorDesc = authorDesc;
    }
}
