package dorduncuGunOdevleri.ikinciOdev.Mernis;

import dorduncuGunOdevleri.ikinciOdev.Gamer;

public class MernisAdapter implements ICheck {
     OKHKPSPublicSoap soap=new OKHKPSPublicSoap();



    @Override
    public boolean checkIfRealPerson(Gamer gamer) {
        try {
            return soap.TCKimlikNoDogrula(Long.valueOf(gamer.getNationalityId()),gamer.getName(),gamer.getLastname(),gamer.getDateOfBirth().getYear());
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return false;
    }
}
