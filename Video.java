
public class Video {
    private String video_name;
    private String video_link;

    public Video(String video_name, String video_link) {
        this.video_name = video_name;
        this.video_link = video_link;
    }

    public String getvideo_name() {
        return video_name;
    }

    public void setvideo_name(String video_name) {
        this.video_name = video_name;
    }

    public String getvideo_link() {
        return video_link;
    }

    public void setvideo_link(String video_link) {
        this.video_link = video_link;
    }

    @Override
    public String toString() {
        return "Video Title:" + video_name + " video link:" + video_link;
    }
}