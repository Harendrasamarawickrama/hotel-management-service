package com.ch.hotel_system.hotel_management_service_api.repo;

import com.ch.hotel_system.hotel_management_service_api.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepo extends JpaRepository<Room, Long> {
}
