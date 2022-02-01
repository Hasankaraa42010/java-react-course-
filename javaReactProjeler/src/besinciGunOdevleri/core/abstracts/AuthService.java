package besinciGunOdevleri.core.abstracts;

import besinciGunOdevleri.entities.concretes.User;

public interface AuthService {
void login(User user);
void register(User user);
}
