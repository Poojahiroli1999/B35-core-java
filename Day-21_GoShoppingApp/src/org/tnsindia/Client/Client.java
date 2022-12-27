package org.tnsindia.Client;

import org.tnsindia.application.GSNormalAcc;
import org.tnsindia.application.GSNormalAcc;
import org.tnsindia.application.GSPrimeAcc;
import org.tnsindia.application.GSShopFactroy;
import org.tnsindia.framework.NormalAcc;
import org.tnsindia.framework.PrimeAcc;
import org.tnsindia.framework.ShopFactroy;

@SuppressWarnings("unused")
public class Client {

	public static void main(String[] args) {
		ShopFactroy f=new GSShopFactroy();
		PrimeAcc p=new GSPrimeAcc(1001,"yog",500,true);
		GSNormalAcc n=new GSNormalAcc(1002,"Harshal",500,70);
		System.out.println("Prime Account Details: ");
		p.bookProduct(p.getCharges());
		
		System.out.println();
		
		System.out.println("Normal Account Details: ");
		n.bookProduct(n.getCharges());
		
		System.out.println();

		
		System.out.println(p);
		System.out.println(n);

		

	}

	}


