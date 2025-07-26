package com.ch.hotel_system.hotel_management_service_api.service;

import com.ch.hotel_system.hotel_management_service_api.dto.request.RequestRoomlmageDto;
import com.ch.hotel_system.hotel_management_service_api.dto.response.ResponseRoomImageDto;
import com.ch.hotel_system.hotel_management_service_api.dto.response.paginate.RoomImagePaginateResponseDto;

public interface RoomImageService {
    public void create(RequestRoomlmageDto dto);
    public void update(RequestRoomlmageDto dto,String imageId);
    public void delete(String imageId);
    public ResponseRoomImageDto findById(String imageId);
    public RoomImagePaginateResponseDto findAll(int page, int size, String roomId);
}
