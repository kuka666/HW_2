import java.util.ArrayList;

public class User implements Observable {
    ArrayList<Observer> observers = new ArrayList<>();
    ArrayList<Post> arr_post = new ArrayList<>();
    ArrayList<Video> arr_videos = new ArrayList<>();

    @Override
    public void add(Observer user) {
        this.observers.add(user);
    }

    @Override
    public void remove(Observer user) {
        this.observers.remove(user);
    }

    @Override
    public void notifyObservers(Integer contentType) {
        for (Observer user : observers) {
            user.getUpdate(contentType);
        }
    }

    public void publishNewPost(Post post) {
        arr_post.add(post);
        notifyObservers(0);
    }

    public Post getNewPost() {
        int size = arr_post.size() - 1;
        return arr_post.get(size);
    }

    public void publishNewVideo(Video video) {
        arr_videos.add(video);
        notifyObservers(1);
    }

    public Video getNewVideo() {
        int size = arr_videos.size() - 1;
        return arr_videos.get(size);
    }
}