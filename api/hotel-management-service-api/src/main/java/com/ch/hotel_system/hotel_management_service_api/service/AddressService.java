package com.ch.hotel_system.hotel_management_service_api.service;

import com.ch.hotel_system.hotel_management_service_api.dto.request.RequestAddressDto;
import com.ch.hotel_system.hotel_management_service_api.dto.response.ResponseAddressDto;

public interface AddressService {
    public void create(RequestAddressDto dto);
    public void update(RequestAddressDto dto,String addressId);
    public void delete(String addressId);
    public ResponseAddressDto findById(String addressId);
    public ResponseAddressDto findByIdBranchId(String branchId);

}
