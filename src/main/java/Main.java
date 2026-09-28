public class Main {

    public static void main(String[] args) {

        // only required fields
        User user1 = new User("Tariq", "tariq@example.com");

        // a couple of optional fields
        User user2 = new User("Abdallah", "abdallah@example.com");
                user2.setPhone("0799999999");
                user2.setNewsletter("yes");

        // everything set
        User user3 = new User("Sameer", "sameer@example.com");
        user3.setPhone("0788888888");
        user3.setAddress("Makkah St");
        user3.setAge(22);
        user3.setNewsletter("yes");
        user3.setAvatarUrl("https://example.com/avatar.png");
        user3.setTimezone("Amman/Jordan");
        user3.setReferralCode("REF2026");
        user3.setMarketingOptIn("yes");

        user1.userInfo();
        System.out.println();

        user2.userInfo();
        System.out.println();

        user3.userInfo();
        System.out.println();
    }
}