package com.example.spring.pet.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.spring.pet.model.Pet;
import com.example.spring.pet.model.PetUpdateRequest;

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
	
	//IDで指定したペットの更新
	public void updateById(int id, PetUpdateRequest request) {
		for(int i = 0; i < pets.size(); i++) {
			if(id == pets.get(i).getId()) {
				pets.get(i).setName(request.getName());
				pets.get(i).setStatus(request.getStatus());
			}
		}
	}
	
	//IDでペット検索
	public Pet findById(int id) {
		for(int i = 0; i < pets.size(); i++) {
			if(id == pets.get(i).getId()) {
				return pets.get(i);
			}
		}return null;
	}
	
	//ペット削除
	public void deletePet(int id) {
		for(int i = 0; i < pets.size(); i++) {
			if(id == pets.get(i).getId()) {
				pets.remove(i);
			}
		}
	}
}
