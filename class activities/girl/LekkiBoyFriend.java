package girl;

public class LekkiBoyFriend implements BoyFriend {
    @Override
    public void spend() {
        System.out.println("Paste me your account");
    }

    @Override
    public void last() {
        System.out.println("20mins max");
    }

    @Override
    public void care() {
        System.out.println("I am in a meeting, let's talk later babe");
    }
}
