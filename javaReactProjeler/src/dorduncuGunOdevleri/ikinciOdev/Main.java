package dorduncuGunOdevleri.ikinciOdev;

import dorduncuGunOdevleri.birinciOdev.Customer;
import dorduncuGunOdevleri.ikinciOdev.Mernis.MernisAdapter;

import java.time.LocalDate;

public class Main {
    public static  void main(String[] args){
    Gamer gamer=new Gamer();

        gamer.setName("Hasan hüseyin");
        gamer.setLastname("Karacığay");
        gamer.setNationalityId("29404789946");
        gamer.setDateOfBirth(LocalDate.of(2001,4,2));
        GamerService gamerService=new GamerManager(new MernisAdapter());
        gamerService.signUp(gamer);
        Company company=new Company();
        company.setId(1);
        company.setName("Büyük yaz ");
        company.setDiscountRate(20);
        CompanyService companyService=new CompanyManager();
        companyService.companyAdd(company);
        Game game=new Game();
        game.setName("Lol");
        game.setPrice(50);
        GameService gameService=new GameManager();
        gameService.buy(game,gamer,company);

    }
}
