/**
 * Created by zaven.chilingaryan on 5/2/2017.
 */
public class Main {
    public static void main(String[] args) {
        ShippingCompanyClient usta = new ShippingCompanyClient(1200);
        ShippingCompanyClient azat = new ShippingCompanyClient(500);
        ShippingCompanyClient malxas = new ShippingCompanyClient(3000);
        usta.callShippingCompany("Shirakaci 177a");
        azat.callShippingCompany("Gargin Njdeh 12");
        malxas.callShippingCompany("Xandilyan 154");
    }
}
