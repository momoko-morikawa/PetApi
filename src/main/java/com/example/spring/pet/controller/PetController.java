package com.example.spring.pet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.pet.model.Pet;
import com.example.spring.pet.service.PetService;

@RestController
public class PetController {
	
	@Autowired
	public PetService petService;
	
	@GetMapping("/pet")
	public List<Pet> getPets(){
		return petService.getPets();
	}
	
	@PostMapping("/pet")
	public void addPet(@RequestBody Pet pet) {
		petService.addPet(pet);
	}
	
	@PutMapping("/pet")
	public void updatePet(@RequestBody Pet pet) {
		petService.updatePet(pet);
	}
	
	@GetMapping("/pet/findByStatus/{status}")
	public Pet findByStatus(@PathVariable("status") String status){
		return petService.findByStatus(status);
	}
}
