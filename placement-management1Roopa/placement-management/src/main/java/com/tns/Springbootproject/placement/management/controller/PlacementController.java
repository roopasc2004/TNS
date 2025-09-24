package com.tns.Springbootproject.placement.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tns.Springbootproject.placement.management.entity.Placement;
import com.tns.Springbootproject.placement.management.service.PlacementService;

@RestController
@RequestMapping("/api/placements") // Base path for all endpoints in this controller
public class PlacementController {

    @Autowired
    private PlacementService placementService;
    
    // POST /api/placements - Create a new placement
    @PostMapping
    public Placement createPlacement(@RequestBody Placement placement) {
        return placementService.addPlacement(placement);
    }
    
    // GET /api/placements - Get all placements
    @GetMapping
    public List<Placement> getAllPlacements(){
        return placementService.getPlacements();
    }
    
    // DELETE /api/placements/{id} - Delete a placement by its ID
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePlacement(@PathVariable Long id) {
        if (placementService.placementExistsById(id)) {
            placementService.deletePlacement(id);
            return ResponseEntity.ok("Placement with ID " + id + " deleted successfully.");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Placement with ID " + id + " not found.");
        }
    }

    // PUT /api/placements/{id} - Update an existing placement
    @PutMapping("/{id}")
    public ResponseEntity<?> updatePlacement(@PathVariable Long id, @RequestBody Placement placementDetails) {
        Placement updatedPlacement = placementService.updatePlacement(id, placementDetails);
        
        if (updatedPlacement != null) {
            return ResponseEntity.ok(updatedPlacement);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Placement with ID " + id + " not found.");
        }
      }
}


