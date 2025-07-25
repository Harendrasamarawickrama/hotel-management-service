package com.ch.hotel_system.hotel_management_service_api.repo;

import com.ch.hotel_system.hotel_management_service_api.entity.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepo extends JpaRepository<Branch, String> {
}
