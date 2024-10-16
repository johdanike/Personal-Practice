package girl;

public class Girl {
    private BoyFriend boyFriend = new LekkiBoyFriend();

    public Girl(BoyFriend boyFriend) {
        this.boyFriend = boyFriend;
    }

    public Girl(){
        LekkiBoyFriend boyFriend = new LekkiBoyFriend();
    }

    public void spend(){
        boyFriend.spend();
    }

    public void setBoyFriend(BoyFriend boyFriend) {
        this.boyFriend = boyFriend;
    }
    public BoyFriend getBoyFriend() {
        return boyFriend;
    }

    public void last(){
        boyFriend.last();
    }

    public void care(){
        boyFriend.care();
    }

}
