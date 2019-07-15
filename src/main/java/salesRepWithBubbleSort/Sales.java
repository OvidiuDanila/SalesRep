package salesRepWithBubbleSort;

import java.util.ArrayList;

public class Sales {

    private ArrayList<SalesRepresentative> salesRepList;

    public Sales() {
        this.salesRepList = new ArrayList<SalesRepresentative>();
    }

    public ArrayList<SalesRepresentative> getSalesRepList() {
        return this.salesRepList;
    }

    public boolean addNewSalesRep(SalesRepresentative salesRep) {
        if(findSalesRep(salesRep.getName())>0) {
            System.out.println("Sales representative is already on the list!");
            return false;
        }
        salesRepList.add(salesRep);
        return true;
    }

    public void listSalesRep() {
        System.out.println("Listing sales representatives: ");
        for(int i=0; i<this.salesRepList.size();i++) {
            System.out.println(i+1 + "." + this.salesRepList.get(i).getName() + " --> Total: "
                    + (this.salesRepList.get(i).getNumberOfSales()*this.salesRepList.get(i).getQuota()) + " ----- "
                    + this.salesRepList.get(i).getNumberOfSales() + " number of sales of "
                    + this.salesRepList.get(i).getQuota() + " quota");
        }
    }

    public void sort(ArrayList<SalesRepresentative> reps) {
        boolean swapped = true;
        while (swapped)
        {
            swapped = false;
            for (int i = 0; i < reps.size()-1; i++)
            {
                if ((reps.get(i).getNumberOfSales()*reps.get(i).getQuota()) < ((reps.get(i+1).getNumberOfSales()*reps.get(i+1).getQuota())))
                {
                    SalesRepresentative temp = reps.get(i);
                    reps.set(i, reps.get(i+1));
                    reps.set((i+1), temp);
                    swapped = true;
                }
            }
        }
        //return reps;
    }

    private int findSalesRep(SalesRepresentative salesRep) {
        return this.salesRepList.indexOf(salesRep);
    }

    private int findSalesRep(String name) {
        for(int i=0; i<this.salesRepList.size(); i++) {
            SalesRepresentative saleRep = this.salesRepList.get(i);
            if (saleRep.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

}
