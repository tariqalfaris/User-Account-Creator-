public class User {

    // required
    String username;
    String email;

    // optional
    String phone;
    String address;
    Integer age;
    String newsletter;
    String avatarUrl;
    String timezone;
    String referralCode;
    String marketingOptIn;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNewsletter(String newsletter) {
        this.newsletter = newsletter;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public void setReferralCode(String referralCode) {
        this.referralCode = referralCode;
    }

    public void setMarketingOptIn(String marketingOptIn) {
        this.marketingOptIn = marketingOptIn;
    }

    public void userInfo(){
        System.out.println("User: " + username + "\nEmail: " + email);

        if(phone != null)
            System.out.println("Phone: " + phone );
        if(address != null)
            System.out.println("Address: " + address );
        if(age != null)
            System.out.println("Age: " + age );
        if(newsletter != null)
            System.out.println("Newsletter: " + newsletter );
        if(avatarUrl != null)
            System.out.println("Avatar URL: " + avatarUrl );
        if(timezone != null)
            System.out.println("Timezone: " + timezone );
        if(referralCode != null)
            System.out.println("Referral code: " + referralCode );
        if(marketingOptIn != null)
            System.out.println("Marketing Opt-In: " + marketingOptIn );

    }
}