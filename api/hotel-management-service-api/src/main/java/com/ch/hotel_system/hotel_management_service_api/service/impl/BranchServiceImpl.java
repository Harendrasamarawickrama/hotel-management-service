package com.ch.hotel_system.hotel_management_service_api.service.impl;

import com.ch.hotel_system.hotel_management_service_api.dto.request.RequestBranchDto;
import com.ch.hotel_system.hotel_management_service_api.dto.response.ResponseBranchDto;
import com.ch.hotel_system.hotel_management_service_api.dto.response.paginate.BranchPaginateResponseDto;
import com.ch.hotel_system.hotel_management_service_api.service.BranchService;
import org.springframework.stereotype.Service;

@Service
public class BranchServiceImpl implements BranchService {
    @Override
    public void create(RequestBranchDto dto) {

    }

    @Override
    public void update(RequestBranchDto dto, String branchId) {

    }

    @Override
    public void delete(String branchId) {

    }

    @Override
    public ResponseBranchDto findById(String branchId) {
        return null;
    }

    @Override
    public BranchPaginateResponseDto findAll(int page, int size, String searchText) {
        return null;
    }

    @Override
    public BranchPaginateResponseDto findAllByHotelId(int page, int size, String hotelId, String searchText) {
        return null;
    }
}
