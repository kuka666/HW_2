public class Follower implements Observer {
    private Integer id;
    private User user;

    public Follower(Integer id, User user) {
        this.id = id;
        this.user = user;
        user.add(this);
    }

    @Override
    public void getUpdate(Integer contentType) {
        if (contentType == 0) {
            Post newPost = user.getNewPost();
            System.out.println("Subscriber with id " + id + " check a new Post: " + newPost);
        } else if (contentType == 1) {
            Video newVideo = user.getNewVideo();
            System.out.println("Subscriber with id " + id + " check a new Video: " + newVideo);
        } else {
            System.out.println("It is unvailable content Type");
        }
    }
}