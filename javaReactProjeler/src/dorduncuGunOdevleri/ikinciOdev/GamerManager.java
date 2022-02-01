package dorduncuGunOdevleri.ikinciOdev;

import dorduncuGunOdevleri.ikinciOdev.Mernis.ICheck;

public class GamerManager implements GamerService {
    private ICheck iCheck;

    public GamerManager(ICheck iCheck) {
        this.iCheck = iCheck;
    }

    @Override
    public void signUp(Gamer gamer) {
        if(this.iCheck.checkIfRealPerson(gamer)){
            System.out.println("Oyuncu kaydedildi:"+gamer.getName());
        }
        else{
            System.out.println("Oyuncunun bilgileri hatalı lutfen tekrar deneyin");
        }
    }

    @Override
    public void update(Gamer gamer) {

    }

    @Override
    public void delete(Gamer gamer) {

    }
}
