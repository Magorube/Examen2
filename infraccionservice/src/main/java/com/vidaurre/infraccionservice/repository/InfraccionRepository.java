package com.vidaurre.infraccionservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vidaurre.infraccionservice.entity.Infraccion;

public interface InfraccionRepository extends JpaRepository<Infraccion, Integer>{

}
