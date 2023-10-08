package com.springboot.CrudWebApi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.CrudWebApi.Model.Farmer;

public interface FarmerRepo extends JpaRepository<Farmer, Integer> {

}
