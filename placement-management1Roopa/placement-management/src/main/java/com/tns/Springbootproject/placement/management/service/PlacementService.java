package com.tns.Springbootproject.placement.management.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.Springbootproject.placement.management.entity.Placement;
import com.tns.Springbootproject.placement.management.repository.PlacementRepo;

@Service
public class PlacementService {
	
    @Autowired
    public PlacementRepo placementRepo;
    
    // Create or add a new placement
    public Placement addPlacement(Placement placement) {
        return placementRepo.save(placement);
    }
    
    // Read or retrieve all placements
    public List<Placement> getPlacements(){
        return placementRepo.findAll();
    }
    
    // Delete a placement by its ID
    public void deletePlacement(long id) {
        placementRepo.deleteById(id);
    }
    
    // Update an existing placement
    public Placement updatePlacement(long id, Placement updatedPlacement) {
        // Find the existing placement in the database
        Optional<Placement> optionalPlacement = placementRepo.findById(id);
        
        // Check if the placement exists
        if (optionalPlacement.isPresent()) {
            Placement existingPlacement = optionalPlacement.get();
            
            // Update the fields of the existing placement
            existingPlacement.setName(updatedPlacement.getName());
            existingPlacement.setQualification(updatedPlacement.getQualification());
            existingPlacement.setYear(updatedPlacement.getYear());
            
            // Save the updated entity
            return placementRepo.save(existingPlacement);
        } else {
            // Return null or throw an exception if the placement is not found
            return null;
        }
    }

    // Check if a placement exists by its ID
    public boolean placementExistsById(Long id) {
        return placementRepo.existsById(id);
        }
}


	
