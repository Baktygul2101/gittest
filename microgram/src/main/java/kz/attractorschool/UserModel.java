package kz.attractorschool.microgram;
public class UserModel{
    private User user = new User(0, "");

    public kz.attractorschool.microgram.UserModel.User getUser() {
        return user;
    }

    public void setUser(kz.attractorschool.microgram.UserModel.User user) {
        this.user = user;
    }

    public List<User> getUserLists() {
        return userLists;
    }

    public void setUserLists(List<User> userLists) {
        this.userLists = userLists;
    }

    private List<User> userLists = new ArrayList<>();
    public UserModel() {
    }


    public static class User {
        private int idUser;
        private String name;
        private String email;
        private String password;
        private int publics = 0;
        private int subscriber = 0;
        private int subscription = 0;

        public User(int idUser, String name) {
            this(idUser,firstName, null, null);
        }

        public User(int idUser, String name, String email) {
            this(idUser, name, email, null);
        }

        public User(int idUser, String name, String email, String password) {
            this.idUser= idUser;
            this.name = name;
            this.email = email+"@.mail";
            this.password=password;
        }
        public User() {

        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public int getPublics() {
            return publics;
        }

        public void setPublics(int publics) {
            this.publics = publics;
        }

        public int getSubscriber() {
            return subscriber;
        }

        public void setSubscriber(int subscriber) {
            this.subscriber = subscriber;
        }

        public int getSubscription() {
            return subscription;
        }

        public void setSubscription(int subscription) {
            this.subscription = subscription;
        }
    }
}