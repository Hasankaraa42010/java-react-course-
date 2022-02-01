package besinciGunOdevleri.dataAccess.abstracts;

import besinciGunOdevleri.entities.concretes.User;

import java.util.List;

public interface UserDao {
    void signUp(User user);
    void login(User user);
    void confirm(User user);
    List<User> getAll();
}
