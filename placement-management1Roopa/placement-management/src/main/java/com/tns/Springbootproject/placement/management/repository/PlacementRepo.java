package com.tns.Springbootproject.placement.management.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.tns.Springbootproject.placement.management.entity.Placement;



public interface PlacementRepo extends JpaRepository<Placement,Long> {

}
