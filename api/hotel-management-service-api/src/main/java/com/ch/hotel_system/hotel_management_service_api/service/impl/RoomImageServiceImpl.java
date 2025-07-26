package com.ch.hotel_system.hotel_management_service_api.service.impl;

import com.ch.hotel_system.hotel_management_service_api.dto.request.RequestRoomlmageDto;
import com.ch.hotel_system.hotel_management_service_api.dto.response.ResponseRoomImageDto;
import com.ch.hotel_system.hotel_management_service_api.dto.response.paginate.RoomImagePaginateResponseDto;
import com.ch.hotel_system.hotel_management_service_api.service.RoomImageService;
import org.springframework.stereotype.Service;

@Service
public class RoomImageServiceImpl implements RoomImageService {
    @Override
    public void create(RequestRoomlmageDto dto) {

    }

    @Override
    public void update(RequestRoomlmageDto dto, String imageId) {

    }

    @Override
    public void delete(String imageId) {

    }

    @Override
    public ResponseRoomImageDto findById(String imageId) {
        return null;
    }

    @Override
    public RoomImagePaginateResponseDto findAll(int page, int size, String roomId) {
        return null;
    }
}
