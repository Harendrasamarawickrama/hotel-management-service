package com.ch.hotel_system.hotel_management_service_api.dto.response;

import com.ch.hotel_system.hotel_management_service_api.enums.BranchType;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ResponseBranchDto {
    private String branchId;
    private String branchName;
    private BranchType branchType;
    private int roomCount;
    private String hotelId;
}
