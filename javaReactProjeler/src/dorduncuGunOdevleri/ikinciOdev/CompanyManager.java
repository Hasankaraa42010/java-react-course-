package dorduncuGunOdevleri.ikinciOdev;

public class CompanyManager implements CompanyService{
    @Override
    public void companyAdd(Company company) {
        System.out.println(company.getName()+" kampanyası eklendi.İndrim oranı %"+company.getDiscountRate());

    }

    @Override
    public void companyDelete(Company company) {
        System.out.println(company.getName()+" kampanyası silindi.");
    }

    @Override
    public void companyUpdate(Company company) {
        System.out.println(company.getName()+" kampanyası güncellendi.");
    }
}
