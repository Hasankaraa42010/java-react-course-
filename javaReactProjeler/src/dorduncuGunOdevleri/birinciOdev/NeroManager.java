package dorduncuGunOdevleri.birinciOdev;

public class NeroManager implements CoffeServcie {
    @Override
    public void save(Customer customer) {
        System.out.println("Nero firmasına "+customer.getName()+" eklendi");
    }
}
