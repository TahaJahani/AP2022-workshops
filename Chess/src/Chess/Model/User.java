package Chess.Model;

public class User {
    private String username;
    private String password;
    private int score;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.score = 0; // score = 0;
    }

    // Alt + insert
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return this.username + "\t" + this.score;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof User)
            return this.username.equals(((User) obj).username);
        return false;
    }
}
