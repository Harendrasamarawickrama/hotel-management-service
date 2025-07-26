package com.ch.hotel_system.hotel_management_service_api.service.impl;

import com.ch.hotel_system.hotel_management_service_api.dto.request.RequestFacilityDto;
import com.ch.hotel_system.hotel_management_service_api.dto.response.ResponseFacilityDto;
import com.ch.hotel_system.hotel_management_service_api.dto.response.paginate.FacilityPaginateResponseDto;
import com.ch.hotel_system.hotel_management_service_api.service.FacilityService;
import org.springframework.stereotype.Service;

@Service
public class FacilityServiceImpl implements FacilityService {
    @Override
    public void create(RequestFacilityDto dto) {

    }

    @Override
    public void update(RequestFacilityDto dto, String facilityId) {

    }

    @Override
    public void delete(String facilityId) {

    }

    @Override
    public ResponseFacilityDto findById(String facilityId) {
        return null;
    }

    @Override
    public FacilityPaginateResponseDto findAll(int page, int size, String roomId) {
        return null;
    }
}
