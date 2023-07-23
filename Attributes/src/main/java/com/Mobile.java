package com;

public class Mobile {
		private String name;
		private double price;
		private String storage;
		private String color;
		public Mobile(String name, double price, String storage, String color) {

			this.name = name;
			this.price = price;
			this.storage = storage;
			this.color = color;
			
		}
		@Override
		public String toString() {
			return "Mobile [name=" + name + ", price=" + price + ", storage=" + storage + ", color=" + color + "]";
		}
		
}
