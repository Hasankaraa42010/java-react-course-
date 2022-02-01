package besinciGunOdevleri.core.concretes;

import besinciGunOdevleri.core.abstracts.AuthService;
import besinciGunOdevleri.entities.concretes.User;

public class GoogleAuthAdapter implements AuthService {
    private GoogleAuthManager googleAuthManager;

    public GoogleAuthAdapter(GoogleAuthManager googleAuthManager) {
        this.googleAuthManager = googleAuthManager;
    }

    @Override
    public void login(User user) {
        this.googleAuthManager.login(user);
    }

    @Override
    public void register(User user) {
    this.googleAuthManager.register(user);
    }
}
