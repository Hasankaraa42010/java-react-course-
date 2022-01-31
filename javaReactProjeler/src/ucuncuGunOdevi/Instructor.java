package ucuncuGunOdevi;

public class Instructor extends User{
    private String authority;
    private int level;
    public Instructor(){

    }
    public Instructor(String authority, int level) {
        this.authority = authority;
        this.level = level;
    }

    public Instructor(int id, String email, String name, String password, String authority, int level) {
        super(id, email, name, password);
        this.authority = authority;
        this.level = level;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
