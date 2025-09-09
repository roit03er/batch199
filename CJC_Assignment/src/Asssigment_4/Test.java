package Asssigment_4;

public class Test {
	
	public static void main(String[] args) {
		
		MarketPlace mp = new MarketPlace();
		mp.platformName="Karve Nagar";
		mp.country="India";
		mp.webSiteUrl="www.sellerOrg.com";
		
		
		mp.sl= new Seller ();
		mp.sl.sellerName="Rohit Patil";
		mp.sl.sellerId=34;
		
		mp.sl.inv= new Inventory();
		mp.sl.inv.wareHouseLocation="Lane 2 Karve nagar Pune";
		mp.sl.inv.lastUpdatedDate="02-08-2024";
		
		mp.sl.inv.it= new Item();
		
		mp.sl.inv.it.itemName="Grocery Packs";
		mp.sl.inv.it.price=345000;
		mp.sl.inv.it.stockCount=40;
		
		
		
		System.out.println("PlatForm Name: "+mp.platformName);
		System.out.println("Country: "+mp.country);
		System.out.println("Web Site URL: "+mp.webSiteUrl);
		
		System.out.println("Seller Name: "+mp.sl.sellerName);
		System.out.println("Seller Id: "+mp.sl.sellerId);
		
		System.out.println("Ware House Location: "+mp.sl.inv.wareHouseLocation);
		System.out.println("Last Update Datee: "+mp.sl.inv.lastUpdatedDate);
		
		System.out.println("Item Name: "+mp.sl.inv.it.itemName);
		System.out.println("Price : "+mp.sl.inv.it.price);
		System.out.println("Stock Count: "+mp.sl.inv.it.stockCount);
		
	}
		
}
