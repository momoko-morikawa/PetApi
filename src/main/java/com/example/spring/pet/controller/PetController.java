package com.example.spring.pet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.pet.model.Pet;
import com.example.spring.pet.model.PetUpdateRequest;
import com.example.spring.pet.service.PetService;

@RestController
public class PetController {
	
	@Autowired
	public PetService petService;
	
	//全部表示
	@GetMapping("/pet")
	public List<Pet> getPets(){
		return petService.getPets();
	}
	
	//ペットを追加
	@PostMapping("/pet")
	public void addPet(@RequestBody Pet pet) {
		petService.addPet(pet);
	}
	
	//ペット情報更新
	@PutMapping("/pet")
	public void updatePet(@RequestBody Pet pet) {
		petService.updatePet(pet);
	}
	
	//ステータスで絞り込み
	@GetMapping("/pet/findByStatus")
	public List<Pet> findByStatus(@RequestParam List<String> status){
		return petService.findByStatus(status);
	}
	
	//タグで検索
	@GetMapping("/pet/findByTags")
	public ResponseEntity<List<Pet>> findByTags(@RequestParam(name = "tags") List<String> tags) {
		List<Pet> filteredPets = petService.findByTags(tags);
		if(filteredPets.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(filteredPets);
	}
	
	//IDを指定してペット情報を更新
	@PostMapping("/pet/{petId}")
	public void updateById(@PathVariable int petId, @RequestBody PetUpdateRequest request) {
		petService.updateById(petId, request);
	}
	
	//IDで検索
	@GetMapping("/pet/{petId}")
	public Pet findById(@PathVariable int petId) {
		return petService.findById(petId);
	}
	
	//ペットの削除
	@DeleteMapping("/pet/{petId}")
	public void deletePet(@PathVariable int petId) {
		petService.deletePet(petId);
	}
}
