package com.springboot.CrudWebApi.Service;

import java.util.List;

import com.springboot.CrudWebApi.Model.Farmer;

public interface FarmerService
{
	Farmer createFarm(Farmer farm);

	Farmer getUserById(int farmId);

    List<Farmer> getAllUsers();

    Farmer updateFarm(Farmer farm,int id);

    void deleteFarm(int farmId);

}
