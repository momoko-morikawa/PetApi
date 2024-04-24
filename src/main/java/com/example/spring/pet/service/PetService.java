package com.example.spring.pet.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.spring.pet.model.Pet;

@Service
public class PetService {
	public List<Pet> pets = new ArrayList(Arrays.asList(
			new Pet( 1, new Pet.Category( 1, "犬" ), "ムギ", Arrays.asList("url1"), Arrays.asList(new Pet.Tag( 1, "tag1")), "available" ),
			new Pet( 2, new Pet.Category( 1, "犬" ), "ポチ", Arrays.asList("url2"), Arrays.asList(new Pet.Tag( 2, "tag2")), "available" ),
			new Pet( 3, new Pet.Category( 2, "猫" ), "タマ", Arrays.asList("url3"), Arrays.asList(new Pet.Tag( 3, "tag3")), "pending" )
			));
	
	
	//一覧取得
	public List<Pet> getPets(){
		return pets;
	}
	
	//ペット追加
	public void addPet(Pet pet) {
		pets.add(pet);
	}
	
	//ペット更新
	public void updatePet(Pet pet) {
		pets.add(pet);
	}
	
	//ステータスで絞り込み
	public Pet findByStatus(String status){
		for(int i = 0; i < pets.size(); i++) {
			if(pets.get(i).getStatus().equals(status)) {
				return pets.get(i);
			}
		}return null;
	}
}
