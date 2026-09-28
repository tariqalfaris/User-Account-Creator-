public class Main {

    public static void main(String[] args) {

        // only required fields
        User user1 = new User("jdoe", "jdoe@example.com");

        // a couple of optional fields
        User user2 = new User("asmith", "asmith@example.com");
                user2.setPhone("555-1234");
                user2.setNewsletter(true);

        // everything set
        User user3 = new User("mgarcia", "mgarcia@example.com");
        user3.setPhone("555-9876");
        user3.setAddress("123 Main St");
        user3.setAge(29);
        user3.setNewsletter(true);
        user3.setAvatarUrl("https://example.com/avatar.png");
        user3.setTimezone("America/New_York");
        user3.setReferralCode("REF2026");
        user3.setMarketingOptIn(true);

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
    }
}