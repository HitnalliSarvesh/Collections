package com.xworkz.dtoClasses;

import java.io.Serializable;

import com.xworkz.enums.Type;

public class ProductDTO implements Comparable<ProductDTO>{
	
	private Integer id;
	private String name;
	Type type;
	private BrandDTO branddto;
	private Double price;
	private Integer quantity;
	
	
	public ProductDTO() {
		System.out.println("No-args constructor");
	}


	public ProductDTO(Integer id, String name, Type type, BrandDTO branddto, Double price, Integer quantity) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.branddto = branddto;
		this.price = price;
		this.quantity = quantity;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Type getType() {
		return type;
	}


	public void setType(Type type) {
		this.type = type;
	}


	public BrandDTO getBranddto() {
		return branddto;
	}


	public void setBranddto(BrandDTO branddto) {
		this.branddto = branddto;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", name=" + name + ", type=" + type + ", branddto=" + branddto + ", price="
				+ price + ", quantity=" + quantity + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((branddto == null) ? 0 : branddto.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + quantity;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductDTO other = (ProductDTO) obj;
		if (branddto == null) {
			if (other.branddto != null)
				return false;
		} else if (!branddto.equals(other.branddto))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (quantity != other.quantity)
			return false;
		if (type != other.type)
			return false;
		return true;
	}


	@Override
	public int compareTo(ProductDTO o) {
		// TODO Auto-generated method stub
		return 0;
	}


}
