import shippingCompany.ShippingCompany;


public class ShippingCompanyClient {


    private double baggageWeight;

    public ShippingCompanyClient(double weight) {
        baggageWeight = weight;
    }

    public void callShippingCompany(String address) {
        System.out.println(ShippingCompany.getTruck(baggageWeight).shipping(address, baggageWeight));
    }
}
