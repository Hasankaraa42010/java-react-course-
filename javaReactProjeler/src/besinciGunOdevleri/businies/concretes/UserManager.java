package besinciGunOdevleri.businies.concretes;

import besinciGunOdevleri.businies.abstracts.UserService;
import besinciGunOdevleri.core.abstracts.AuthService;
import besinciGunOdevleri.dataAccess.abstracts.UserDao;
import besinciGunOdevleri.entities.concretes.User;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserManager implements UserService {
    private UserDao userDao;
    private AuthService authService;

    public UserManager(UserDao userDao,AuthService authService) {
        this.userDao = userDao;
        this.authService=authService;
    }

    @Override
    public void signUp(User user) throws InterruptedException {
        if (user.getName()==null){
            System.out.println("İsim boş olamaz");
        }
        if (user.getLastName()==null){
            System.out.println("Soyisim boş olamaz");
        }
        if (user.getEmail()==null){
            System.out.println("Email boş olamaz");
        }
        if (user.getPassword()==null){
            System.out.println("parola boş olamaz");
        }
        if (user.getPassword().length()<6){
            System.out.println("parola 6 karakterden kısa olamaz");
        }
        final String EMAIL_PATTERN = "^[A-Za-z0-9+_.-]+@(.+)$";
        final Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(user.getEmail());
        if(!matcher.matches()){
            System.out.println(user.getEmail()+" EPOSTA FORMATINA UYGUN DEĞİL.");
        }
        for(User users:this.userDao.getAll()){
        if (user.getEmail()==users.getEmail()){
            System.out.println("bu eposta once kullanılmış");

        }
        }
        if (user.getName().length()<2 && user.getLastName().length()<2){
            System.out.println("Ad ve soyad en az iki karakterden olusmalıdır.");
        }
        System.out.println("Doğrulama yollandı:Nekleniyor");
        Thread.sleep(3000);
        confirm(user);
        System.out.println("Doğrulama kabul edildi");

        if (user.isConfirm()==true){
            this.userDao.login(user);
        }

    }

    @Override
    public void login(User user) {
        for(User user1:this.userDao.getAll()){
            if (user1.getEmail()==user.getEmail()){
                if (user.getPassword()==user.getPassword()){
                    System.out.println("Giriş başarılı.");
                }
                else{
                    System.out.println("Şifre yanlış");
                }

            }
        }
    }

    @Override
    public void confirm(User user) {
        System.out.println("Doğrulama tamamlandı");
        user.setConfirm(true);
    }

    @Override
    public void loginWithAccount(User user) {
        user.setConfirm(true);
        this.authService.login(user);
    }

    @Override
    public void registerWithAccout(User user) {
    if (user.isConfirm()==true){
        System.out.println("Kayıt başarılı.");
    }
    else{
        System.out.println("Henüz kayıt olunmamıs.");
    }
    }
}
