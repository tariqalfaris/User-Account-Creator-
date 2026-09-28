public class Main {

    public static void main(String[] args) {

        // only required fields
        User user1 = new User("jdoe", "jdoe@example.com");

        // a couple of optional fields
        User user2 = new User("asmith", "asmith@example.com")
                .setPhone("555-1234")
                .setNewsletter(true);

        // everything set
        User user3 = new User("mgarcia", "mgarcia@example.com")
                .setPhone("555-9876")
                .setAddress("123 Main St")
                .setAge(29)
                .setNewsletter(true)
                .setAvatarUrl("https://example.com/avatar.png")
                .setTimezone("America/New_York")
                .setReferralCode("REF2026")
                .setMarketingOptIn(true);

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
    }
}