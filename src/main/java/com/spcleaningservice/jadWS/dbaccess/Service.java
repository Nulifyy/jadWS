package com.spcleaningservice.jadWS.dbaccess;

public class Service {
	private int serviceId;
	private String name;
	private String desc;
	private String category;
	private double price;
	private String imgloc;
	
	public int getServiceId() {
		return serviceId;
	}
	
	public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }
	
	public String getName() {
        return name;
    }
	
	public void setName(String name) {
        this.name = name;
    }
	
	public String getDesc() {
        return desc;
    }
	
	public void setDesc(String desc) {
        this.desc = desc;
    }
	
	public String getCategory() {
        return category;
    }
	
	public void setCategory(String category) {
        this.category = category;
    }
	
	public double getPrice() {
        return price;
    }
	
	public void setPrice(double price) {
        this.price = price;
    }
	
	public String getImgloc() {
        return imgloc;
    }
	
	public void setImgloc(String imgloc) {
        this.imgloc = imgloc;
    }
}
