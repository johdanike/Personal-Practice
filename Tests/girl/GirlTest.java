package girl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GirlTest {


    @Test
    void testGirlClass() {
        MushinBoyFriend mushinBoyFriend = new MushinBoyFriend();
        LekkiBoyFriend lekkiBoyFriend = new LekkiBoyFriend();
        YabaBoyFriend yabaBoyFriend = new YabaBoyFriend();
        mushinBoyFriend.care();
        mushinBoyFriend.last();
        mushinBoyFriend.spend();
        lekkiBoyFriend.care();
        lekkiBoyFriend.last();
        lekkiBoyFriend.spend();
        yabaBoyFriend.care();
        yabaBoyFriend.last();
        yabaBoyFriend.spend();

    }

}