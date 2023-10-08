package com.springboot.CrudWebApi.Service.Serviceimp;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.springboot.CrudWebApi.Repository.FarmerRepo;
import com.springboot.CrudWebApi.Service.FarmerService;
import com.springboot.CrudWebApi.Model.Farmer;

@Service
public class FarmerServiceImp implements FarmerService {

	private FarmerRepo farmrepo;

	public FarmerServiceImp(FarmerRepo farmrepo) {
		super();
		this.farmrepo = farmrepo;
	}

	@Override
	public Farmer createFarm(Farmer farm) {

		return farmrepo.save(farm);
	}

	@Override
	public Farmer getUserById(int farmId) {
		return null;

	}

	@Override
	public List<Farmer> getAllUsers() {
		return farmrepo.findAll();
	}

	@Override
	public Farmer updateFarm(Farmer farm, int id) {
		Farmer existingfarms = farmrepo.findById(id).get();

		existingfarms.setFname(farm.getFname());
		existingfarms.setLname(farm.getLname());
		existingfarms.setMobilenum(farm.getMobilenum());

		Farmer updatefarm = farmrepo.save(existingfarms);

		return updatefarm;

	}

	@Override
	public void deleteFarm(int farmId) {
		farmrepo.deleteById(farmId);

	}

}
