import java.util.Objects;

public class Playlist {
        Node head;
    Node currPlaying ;

    public Playlist() {
        this.head = null;
        currPlaying = null;
    }

    // to add a song
    public void addSong(String name , String artist){
        Node newNode = new Node(name , artist);
        if(head == null){
            head = newNode;
            currPlaying = head;
            System.out.println("Song "+name+" added at start successfully.." );
            return;
        }
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.prev = curr;
        System.out.println("Song "+name+" added at last successfully.." );
    }

    // to remove a song by name
    public void removeSong(String title){
        if(head == null){
            System.out.println("List is empty..");
            return;
        }

        if(head.next == null){
            if (Objects.equals(head.songTitle, title)) {
                System.out.println("The only song in the list "+head.songTitle+" is removed..");
                head = null;
                currPlaying = null;
                return;
            }
            System.out.println("not found at first position...");
            return;
        }

        if(Objects.equals(head.songTitle,title)){
            System.out.println("The first song "+head.songTitle+" in the list is removed..");
            head = head.next;
            head.prev = null;
            currPlaying = currPlaying.next;
            return;
        }

        Node curr = head;
        while(curr != null){
            if(Objects.equals(curr.songTitle,title)){
                if(curr.next == null){
                    curr.prev.next = null;
                    currPlaying = currPlaying.prev;
                    System.out.println(curr.songTitle+" is removed..");
                    return;
                }
                curr.prev.next = curr.next;
                curr.next.prev = curr.prev;
                currPlaying = currPlaying.next;
                System.out.println(title+" Song is deleted...");
                return;
            }
            curr = curr.next;
        }
        System.out.println("Not found in List ...");
    }

    // to display the list
    public void display(){
        if(head == null){
            System.out.println("List is empty..");
            return;
        }
        Node temp = head;
        System.out.println("All songs : ");
        do{
            System.out.println(temp.songTitle+ " by : "+temp.songArtist);
            temp=temp.next;
        }while(temp != null);
        System.out.println();
    }

    // to play next song
    public void playNext(){

        if(currPlaying == null){
            System.out.println("List is empty");
        }else if(currPlaying.next == null){
            System.out.println(currPlaying.songTitle+" is Last song..");
            return;
        }
            currPlaying= currPlaying.next;
            System.out.println(currPlaying.songTitle + " is playing currently..");
        }

        // play previous song
    public void playPrevious(){
        if(currPlaying == null){
            System.out.println("List is empty.");
        }else if(currPlaying.prev == null){
            System.out.println(currPlaying.songTitle+" is first song..");
        }else{
            currPlaying = currPlaying.prev;
            System.out.println(currPlaying.songTitle + " is playing currently..");
        }
    }
    // play display songs playlist
    public void displayForwardBackward(){
        System.out.println("Currently Playing : "+currPlaying.songTitle);
        Node temp = currPlaying;
        System.out.println("Forward : ");
        while(temp.next != null){
            temp = temp.next;
            System.out.println("[ "+temp.songTitle+" ]");
        }
        Node temp1 = currPlaying;
        System.out.println("Backward : ");
        while(temp1.prev != null){
            temp1 = temp1.prev;
            System.out.println("[ "+temp1.songTitle+" ]");
        }
    }
    }



