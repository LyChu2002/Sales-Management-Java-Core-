package vn.devpro.shopmanagement;

import java.util.Scanner;

import vn.devpro.shopmanagement.managesale.SaleManagement;
import vn.devpro.shopmanagement.managesale.cartmanage.ProductListManagement;
import vn.devpro.shopmanagement.search.SearchManagement;
import vn.devpro.shopmanagement.update.UpdateManagement;
import vn.devpro.shopmanagement.update.customerupdate.CustomerManagement;
import vn.devpro.shopmanagement.update.productupdate.ProductManagement;
import vn.devpro.shopmanagement.update.providerupdate.ProviderManagement;
import vn.devpro.shopmanagement.update.typeupdate.TypeManagement;

public class ShopManagement {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ProviderManagement.init();
		TypeManagement.init();
		ProductManagement.init();
		CustomerManagement.init();

		
		do {
			System.out.println("=========QUAN LY SHOP THOI TRANG=============");
			System.out.println("Chon chuc nang quan ly: ");
			System.out.println("\t1. Cap nhat thong tin he thong");
			System.out.println("\t2. Quan ly ban hang");
			System.out.println("\t3. Tim kiem");
			System.out.println("\t0. Thoat");
			System.out.print("Lua chon cua ban: ");
			int chon = Integer.parseInt(sc.nextLine());
			switch(chon) {
			case 1: 
				UpdateManagement.execute();
				break;
			case 2: 
				SaleManagement.execute();
				break;
			case 3: 
				SearchManagement.execute();
				break;
			case 0: 
				System.out.println("Thoat chuong trinh");
				System.exit(0);
			default:
				System.out.println("Lua chon khong hop le");
				break;
			}
		}while(true);
	}
}
