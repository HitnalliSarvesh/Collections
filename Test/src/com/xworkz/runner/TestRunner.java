package com.xworkz.runner;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.xworkz.dtoClasses.AddressDTO;
import com.xworkz.dtoClasses.BrandDTO;
import com.xworkz.dtoClasses.ProductDTO;
import com.xworkz.enums.Type;

public class TestRunner {
	
	public static void main(String[] args) {
		AddressDTO add1 = new AddressDTO(1, 24, "Kanakapura main road", "Bangalore", "Karnataka", 560078);
		BrandDTO br1 = new BrandDTO(1, "Prestige", "98712304613L", add1, 1900);
		ProductDTO product1 = new ProductDTO(1, "Cooker", Type.KITCHENAPPLI, br1, 250.9, 2);
		
		
		AddressDTO add2 = new AddressDTO(2, 25, "Amrutnagar", "Bangalore", "Karnataka", 560058);
		BrandDTO br2 = new BrandDTO(2, "Pigeon", "12342304613L", add2, 1900);
		ProductDTO product2 = new ProductDTO(2, "Pan", Type.KITCHENAPPLI, br2, 300.9, 2);
		
		
		AddressDTO add3 = new AddressDTO(3, 26, "Doddakallasandra", "Bangalore", "Karnataka", 560041);
		BrandDTO br3 = new BrandDTO(3, "Lakme", "98715213613L", add3, 1900);
		ProductDTO product3 = new ProductDTO(3, "Sunscreen", Type.BEAUTY, br3, 255.9, 1);
		
		AddressDTO add4 = new AddressDTO(4, 27, "Vijayanagar", "Mysore", "Karnataka", 520078);
		BrandDTO br4 = new BrandDTO(4, "Revlon", "9865168453L", add4, 1900);
		ProductDTO product4 = new ProductDTO(4, "nailpolish", Type.BEAUTY, br4, 25000.0, 3);
		
		AddressDTO add5 = new AddressDTO(5, 28, "Ernakulam", "Kochi", "Kerala", 615628);
		BrandDTO br5 = new BrandDTO(5, "LG", "78965404613L", add5, 1900);
		ProductDTO product5 = new ProductDTO(5, "TV", Type.ELECTRONICS, br5, 2500.0, 3);
		
		AddressDTO add6 = new AddressDTO(6, 29, "Via Acqasanta", "L'Aquila", "Abruzzo", 67100);
		BrandDTO br6 = new BrandDTO(6, "Apple", "69874504613L", add6, 1900);
		ProductDTO product6 = new ProductDTO(6, "Mobile", Type.ELECTRONICS, br6, 250.0, 5);
		
		AddressDTO add7 = new AddressDTO(7, 30, "Deepanjali nagar", "Delhi", "New Delhi", 845621);
		BrandDTO br7 = new BrandDTO(7, "VRL", "9871256413L", add7, 1900);
		ProductDTO product7 = new ProductDTO(7, "Bus", Type.TRAVEL, br7, 400.0, 5);
		
		AddressDTO add8 = new AddressDTO(8, 31, "Gandhi nagar", "Mumbai", "Maharashtra", 000123);
		BrandDTO br8 = new BrandDTO(8, "Renault", "98745632113L", add8, 1900);
		ProductDTO product8 = new ProductDTO(8, "Car", Type.TRAVEL, br8, 350.0, 2);
		
		AddressDTO add9 = new AddressDTO(9, 32, "Nehru road", "Kolkata", "West Bengal", 616256);
		BrandDTO br9 = new BrandDTO(9, "Royaloak", "978965154613L", add9, 1900);
		ProductDTO product9 = new ProductDTO(9, "Sofa", Type.FURNITURE, br9, 30000.0, 7);
		
		AddressDTO add10 = new AddressDTO(10, 33, "Rajkumar road", "Chennai", "Tamil Nadu", 871321);
		BrandDTO br10 = new BrandDTO(10, "Homedecor", "987159357613L", add10, 1900);
		ProductDTO product10 = new ProductDTO(10, "Table", Type.FURNITURE, br10, 40000.0, 2);

		Collection<ProductDTO> prCollection = new HashSet<ProductDTO>();
		prCollection.add(product1);
		prCollection.add(product2);
		prCollection.add(product3);
		prCollection.add(product4);
		prCollection.add(product5);
		prCollection.add(product6);
		prCollection.add(product7);
		prCollection.add(product8);
		prCollection.add(product9);
		prCollection.add(product10);

		System.out.println("Printing ProductDTO by pincode");
		List<ProductDTO> prByPin = prCollection.stream().filter(p -> p.getBranddto().getAddressdto().getPincode() == 845621)
				.collect(Collectors.toList());
		prByPin.forEach(p -> System.out.println(p));
		System.out.println(" ");

		System.out.println("Printing AddressDTO by product name");
		Collection<AddressDTO> adByName = prCollection.stream().sorted((p1, p2) -> p2.getId().compareTo(p1.getId()))
				.filter(p -> p.getName().equals("Cooker")).map(a -> a.getBranddto().getAddressdto())
				.collect(Collectors.toList());
		adByName.forEach(a -> System.out.println(a));
		System.out.println(" ");

		System.out.println("Printing BrandDTO by ProductDTO");
		Collection<BrandDTO> brByPr = prCollection.stream().filter(p -> p == product10).map(b -> b.getBranddto())
				.collect(Collectors.toList());
		brByPr.forEach(b -> System.out.println(b));
		System.out.println(" ");

		System.out.println("Printing AddressDTO by BrandDTO");
		Collection<AddressDTO> adByBr = prCollection.stream().filter(f -> f.getBranddto() == br4)
				.map(m -> m.getBranddto().getAddressdto()).collect(Collectors.toList());
		adByBr.forEach(a -> System.out.println(a));
		System.out.println(" ");

		System.out.println("Get all products by maximum price");
		Optional<ProductDTO> prdto = prCollection.stream().sorted((m1, m2) -> m2.getPrice().compareTo(m1.getPrice()))
				.findFirst();
		prdto.ifPresent(p -> System.out.println(p));
		System.out.println("  ");

		System.out.println("All ProductDTO by type, sorted by price in descending order");
		List<ProductDTO> price = prCollection.stream().filter(f -> f.getType().equals(Type.KITCHENAPPLI))
				.sorted((p1, p2) -> p2.getPrice().compareTo(p1.getPrice())).collect(Collectors.toList());
		price.forEach(p -> System.out.println(p));
		System.out.println(" ");
		
		System.out.println("Printing products in descending order of quantity");
		List<ProductDTO> quant = prCollection.stream()
				.sorted((q1,q2) -> q2.getQuantity().compareTo(q1.getQuantity()))
				.collect(Collectors.toList());
		quant.forEach(p -> System.out.println(p));
		
		

	}
}
