package dorduncuGunOdevleri.birinciOdev;

public class SturbacksManager implements CoffeServcie {
    private CustomerCheckService service;

    public SturbacksManager(CustomerCheckService service) {
        this.service = service;
    }

    @Override
    public void save(Customer customer) {
    if (this.service.checkIfRealPerson(customer)){
        System.out.println("Kullanıcı sturbacksa kaydedildi:"+customer.getName());
    }
    else{
        System.out.println("Kullanıcı bulunamadı");
    }
    }
    public void addCoffea(Customer customer){
        customer.setNumberStars(customer.getNumberStars()+1);
        System.out.println("Yıldız sayınız bir adet yükseldi:"+customer.getNumberStars());
    }
}
