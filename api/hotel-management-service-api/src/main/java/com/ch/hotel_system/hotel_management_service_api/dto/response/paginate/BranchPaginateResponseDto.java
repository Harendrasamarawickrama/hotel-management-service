package com.ch.hotel_system.hotel_management_service_api.dto.response.paginate;

import com.ch.hotel_system.hotel_management_service_api.dto.response.ResponseBranchDto;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class BranchPaginateResponseDto {
    private List<ResponseBranchDto> dataList;
    private Long dataCount;
}
