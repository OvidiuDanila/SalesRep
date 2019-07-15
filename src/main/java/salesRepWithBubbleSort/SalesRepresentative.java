package salesRepWithBubbleSort;

public class SalesRepresentative {

    private String name;
    private int numberOfSales;
    private double quota;

    public SalesRepresentative(String name, int numberOfSales, double quota) {
        this.name = name;
        this.numberOfSales = numberOfSales;
        this.quota = quota;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfSales() {
        return numberOfSales;
    }

    public double getQuota() {
        return quota;
    }

    public static SalesRepresentative createSalesRep (String name, int numberOfSales, double quota) {
        return new SalesRepresentative (name, numberOfSales, quota);
    }



}
