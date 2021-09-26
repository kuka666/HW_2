public class Instagram {

    public static void main(String[] args) {
        User account = new User();
        Observer subscriber1 = new Follower(1, account);

        Post newPost = new Post(1, "Hello it is my first Post))))))))))");
        account.publishNewPost(newPost);

        Observer subscriber2 = new Follower(2, account);
        Video newVideo = new Video("Video about observer pattern", "www.oberverpattern.kz.video");
        account.publishNewVideo(newVideo);

    }
}