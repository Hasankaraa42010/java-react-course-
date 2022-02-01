package besinciGunOdevleri.dataAccess.concretes;

import besinciGunOdevleri.dataAccess.abstracts.UserDao;
import besinciGunOdevleri.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class HibernateUserDao implements UserDao {
    List<User> users=new ArrayList<User>();
    @Override
    public void signUp(User user) {
        System.out.println(user.getName()+" "+"isimli kullanıcı başarılı bir şekilde kaydoldu.");
        users.add(user);
    }

    @Override
    public void login(User user) {

    }

    @Override
    public void confirm(User user) {

    }

    @Override
    public List<User> getAll() {
        return this.users;
    }
}
