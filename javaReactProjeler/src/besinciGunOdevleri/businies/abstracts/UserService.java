package besinciGunOdevleri.businies.abstracts;

import besinciGunOdevleri.entities.concretes.User;

import java.util.List;

public interface UserService {
    void signUp(User user) throws InterruptedException;
    void login(User user);
    void confirm(User user);
    void loginWithAccount(User user);
    void registerWithAccout(User user);
}
