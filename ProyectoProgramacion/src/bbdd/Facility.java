package bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Facility {

	public Facility(long id, long guid, String name, String description, String category, String address,
			double height) {
		super();
		this.id = id;
		this.guid = guid;
		this.name = name;
		this.description = description;
		this.category = category;
		this.address = address;
		this.height = height;
	}

	public long id;
	public long guid;
	public String name;
	public String description;
	public String category;
	public String address;
	public double height;
	
	public Facility() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getGuid() {
		return guid;
	}

	public void setGuid(long guid) {
		this.guid = guid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Facility [id=" + id + ", guid=" + guid + ", name=" + name + ", description=" + description
				+ ", category=" + category + ", address=" + address + ", height=" + height + ", getId()=" + getId()
				+ ", getGuid()=" + getGuid() + ", getName()=" + getName() + ", getDescription()=" + getDescription()
				+ ", getCategory()=" + getCategory() + ", getAddress()=" + getAddress() + ", getHeight()=" + getHeight()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}