package besinciGunOdevleri.core.concretes;

import besinciGunOdevleri.entities.concretes.User;

public class
GoogleAuthManager {
public void login(User user){
    System.out.println(user.getEmail()+" başarıyla giriş yaptı");
}
public void register(User user){
    System.out.println(user.getEmail()+" başarıyla kaydoldu." );
}
}
