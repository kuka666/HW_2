public class Post {
    private Integer post_number;
    private String post_information;

    public Post(Integer post_number, String post_information) {
        this.post_number = post_number;
        this.post_information = post_information;
    }

    public Integer getpost_number() {
        return post_number;
    }

    public void setPost_id(Integer post_number) {
        this.post_number = post_number;
    }

    public String getpost_information() {
        return post_information;
    }

    public void setpost_information(String post_information) {
        this.post_information = post_information;
    }

    @Override
    public String toString() {
        return "Post text:" + post_information + " post number:" + post_number;
    }
}