package ucuncuGunOdevi;

public class UserManager {
    public void sıgnIn(String email,String password){
        System.out.println(email+" ile giriş yapıldı");
    }
    public void comment(User user,String comment){
        System.out.println(user.getName()+" "+comment+"dedi");
    }
}
