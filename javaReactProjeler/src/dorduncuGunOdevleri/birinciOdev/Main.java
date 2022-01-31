package dorduncuGunOdevleri.birinciOdev;

import java.time.LocalDate;

/*
kahve "yonetimi
Starbucks ve nero
iki firmada "musterilerini veri tabanına kayded"tcek
starbaks mernis dogrulaması ıstıyor
neroda boyle bir kural yok
starbacks her kahve alımında yıldız veriyor

 */
public class Main {
    public static void main(String[] args) {
        // write your code here
        Customer customer=new Customer();
        customer.setName("Hasan hüseyin");
        customer.setLastName("Karacığay");
        customer.setNationalityId("29404789946");
        customer.setNumberStars(0);
        customer.setDateOfBirth(LocalDate.of(2001,4,2));
        CoffeServcie coffeServcie=new SturbacksManager(new MernisAdapter());
        coffeServcie.save(customer);
        CoffeServcie coffeServcie1=new NeroManager();
        coffeServcie1.save(customer);
        SturbacksManager manager=new SturbacksManager(new MernisAdapter());
        manager.addCoffea(customer);
        manager.addCoffea(customer);
    }

}
