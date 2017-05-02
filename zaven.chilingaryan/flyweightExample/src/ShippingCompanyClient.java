import shippingCompany.ShippingCompany;

/**
 * Created by zaven.chilingaryan on 5/2/2017.
 */
public class ShippingCompanyClient {


    private double baggageWeight;

    public ShippingCompanyClient(double weight) {
        baggageWeight = weight;
    }

    public void callShippingCompany(String address) {
        System.out.println(ShippingCompany.getTruck(baggageWeight).shipping(address, baggageWeight));
    }
}
