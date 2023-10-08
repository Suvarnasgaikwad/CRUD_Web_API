package com.springboot.CrudWebApi.Controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.CrudWebApi.Service.FarmerService;
import com.springboot.CrudWebApi.Model.Farmer;

@RestController
public class FarmerController {

	private FarmerService farmservice;

	public FarmerController(FarmerService farmservice) {
		super();
		this.farmservice = farmservice;
	}

	// http://localhost:8080/savefarm
	@PostMapping("/farm")
	public Farmer savefarm(@RequestBody Farmer farm) {
		Farmer farms = farmservice.createFarm(farm);
		return farms;

	}

	// http://localhost:8080/allfarm
	@GetMapping("/allfarm")
	public List<Farmer> getfarm() {
		return farmservice.getAllUsers();

	}

	// http://localhost:8080/delfarm/{id}
	@GetMapping("/farm/{id}")
	public void delfarm(@PathVariable int id) {
		farmservice.deleteFarm(id);

	}

	// http://localhost:8080/update/{id}
	@PutMapping("update/{id}")
	public Farmer update(@PathVariable int id, @RequestBody Farmer farm) {
		return farmservice.updateFarm(farm, id);

	}

	// http://localhost:8080/farmer/show
	@GetMapping("/farmer/show")
	public String getfarmer() {

		return "Hello";
	}
}
