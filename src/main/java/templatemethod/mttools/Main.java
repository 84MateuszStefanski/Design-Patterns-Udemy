package templatemethod.mttools;

public class Main {

    public static void main(String[] args) {
        WorkDayInMtTools office = new OfficeWorkDay();
        WorkDayInMtTools warehouse = new WarehouseWorkDay();
        WorkDayInMtTools shop = new ShopSellerWorkDay();

        office.organizationOfTheWorkingDay();
        System.out.println("---------------NEXT WORKER ------------------");
        warehouse.organizationOfTheWorkingDay();
        System.out.println("---------------NEXT WORKER ------------------");
        shop.organizationOfTheWorkingDay();

    }
}
