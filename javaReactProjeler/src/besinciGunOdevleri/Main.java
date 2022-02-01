package besinciGunOdevleri;

import besinciGunOdevleri.businies.abstracts.UserService;
import besinciGunOdevleri.businies.concretes.UserManager;
import besinciGunOdevleri.core.concretes.GoogleAuthAdapter;
import besinciGunOdevleri.core.concretes.GoogleAuthManager;
import besinciGunOdevleri.dataAccess.concretes.HibernateUserDao;
import besinciGunOdevleri.entities.concretes.User;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        User user=new User();
        user.setPassword("Hasan.946");
        user.setLastName("Karacığay");
        user.setName("Hasan hüseyin");
        user.setEmail("hsn33y2@gmail.com");
        UserService userService=new UserManager(new HibernateUserDao(),new GoogleAuthAdapter(new GoogleAuthManager()));
    userService.signUp(user);
    userService.login(user);
        userService.registerWithAccout(user);
    }
}
