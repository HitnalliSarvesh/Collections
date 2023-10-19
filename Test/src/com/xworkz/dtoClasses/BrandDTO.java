package com.xworkz.dtoClasses;

import java.io.Serializable;

public class BrandDTO implements Serializable{
	private Integer id;
	private String name;
	private String gstNo;
	private AddressDTO addressdto;
	private int estFrom;
	
	
	public BrandDTO() {
		System.out.println("No-args constr in BrandDTO");
	}


	public BrandDTO(Integer id, String name, String gstNo, AddressDTO addressdto, int estFrom) {
		super();
		this.id = id;
		this.name = name;
		this.gstNo = gstNo;
		this.addressdto = addressdto;
		this.estFrom = estFrom;
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


	public String getGstNo() {
		return gstNo;
	}


	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}


	public AddressDTO getAddressdto() {
		return addressdto;
	}


	public void setAddressdto(AddressDTO addressdto) {
		this.addressdto = addressdto;
	}


	public int getEstFrom() {
		return estFrom;
	}


	public void setEstFrom(int estFrom) {
		this.estFrom = estFrom;
	}


	@Override
	public String toString() {
		return "BrandDTO [id=" + id + ", name=" + name + ", gstNo=" + gstNo + ", addressdto=" + addressdto
				+ ", estFrom=" + estFrom + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addressdto == null) ? 0 : addressdto.hashCode());
		result = prime * result + estFrom;
		result = prime * result + ((gstNo == null) ? 0 : gstNo.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		BrandDTO other = (BrandDTO) obj;
		if (addressdto == null) {
			if (other.addressdto != null)
				return false;
		} else if (!addressdto.equals(other.addressdto))
			return false;
		if (estFrom != other.estFrom)
			return false;
		if (gstNo == null) {
			if (other.gstNo != null)
				return false;
		} else if (!gstNo.equals(other.gstNo))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	

		
	

}
