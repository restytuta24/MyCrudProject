package simplecrud.mycrud.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Furniture {
	
	@Id
	private int furnitureId;
	private String furnitureType;
	private String material;
	private String color;
	private int price;
	
	public Furniture() {
	}

	public Furniture(int furnitureId, String furnitureType, String material, String color, int price) {
		this.furnitureId = furnitureId;
		this.furnitureType = furnitureType;
		this.material = material;
		this.color = color;
		this.price = price;
	}

	public int getFurnitureId() {
		return furnitureId;
	}

	public void setFurnitureId(int furnitureId) {
		this.furnitureId = furnitureId;
	}

	public String getFurnitureType() {
		return furnitureType;
	}

	public void setFurnitureType(String furnitureType) {
		this.furnitureType = furnitureType;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Furniture [furnitureId=" + furnitureId + ", furnitureType=" + furnitureType + ", material=" + material
				+ ", color=" + color + ", price=" + price + "]";
	}
	
	

}
