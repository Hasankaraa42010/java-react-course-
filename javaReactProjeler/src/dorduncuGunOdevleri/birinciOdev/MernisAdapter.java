package dorduncuGunOdevleri.birinciOdev;

import dorduncuGunOdevleri.birinciOdev.mernis.BSUKPSPublicSoap;

public class MernisAdapter implements CustomerCheckService {
    BSUKPSPublicSoap soap=new BSUKPSPublicSoap();
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        try {
            return soap.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()),customer.getName(),customer.getLastName(),customer.getDateOfBirth().getYear());
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return false;
    }
}