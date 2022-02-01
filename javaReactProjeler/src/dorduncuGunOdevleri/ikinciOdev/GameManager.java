package dorduncuGunOdevleri.ikinciOdev;

public class GameManager implements GameService{



    @Override
    public void buy(Game game, Gamer gamer) {

        System.out.println(game.getName()+" oyununu "+gamer.getName()+game.getPrice()+" satın aldı.");

    }

    @Override
    public void buy(Game game, Gamer gamer, Company company) {
        game.setPrice(game.getPrice()*(100-company.getDiscountRate())/100);
        System.out.println(game.getName()+" oyununu "+gamer.getName()+" "+game.getPrice()+"$ satın aldı.");

    }
}
