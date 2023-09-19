package com.ashokit.jpa.binding;


public class Book {
	
	private Long price;
	private String publisher;
	private String type;
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Book [price=" + price + ", publisher=" + publisher + ", type=" + type + "]";
	}
	
}