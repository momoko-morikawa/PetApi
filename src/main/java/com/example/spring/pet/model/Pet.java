package com.example.spring.pet.model;

import java.util.List;


public class Pet {
	private int id;
	private Category categpry;
	private String name;
	private List<String> photoUrls;
	private List<Tag> tags;
	private String status;
	public Pet(int id, Category categpry, String name, List<String> photoUrls, List<Tag> tags, String status) {
		super();
		this.id = id;
		this.categpry = categpry;
		this.name = name;
		this.photoUrls = photoUrls;
		this.tags = tags;
		this.status = status;
	}
	
	public Pet() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Category getCategpry() {
		return categpry;
	}

	public void setCategpry(Category categpry) {
		this.categpry = categpry;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhotoUrls() {
		return photoUrls;
	}

	public void setPhotoUrls(List<String> photoUrls) {
		this.photoUrls = photoUrls;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	//Category内部クラス
	public static class Category {
		private int id;
		private String name;
		
		public Category(int id, String name) {
			this.id = id;
			this.name = name;
		}
		public Category() {
			
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
	}
	//Tag内部クラス
	public static class Tag {
		private int id;
		private String name;
		
		public Tag(int id, String name) {
			this.id = id;
			this.name = name;
		}
		public Tag() {
			
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
	}
	
	
}

