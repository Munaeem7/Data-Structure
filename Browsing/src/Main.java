public class Main {
    public static void main(String[] args) {
        browsingHistory history = new browsingHistory();
        history.visit("google.com");
        history.visit("facebook.com");
        history.visit("twitter.com");
//        history.display();
        history.goBack();
        System.out.println("Back to : "+history.currentlyVisiting.url);
        history.goBack();
        System.out.println("Back to : "+history.currentlyVisiting.url);
        history.visit("youtube.com");
        history.goForward();
        history.goBack();
        System.out.println("Back to : "+history.currentlyVisiting.url);
    }
}