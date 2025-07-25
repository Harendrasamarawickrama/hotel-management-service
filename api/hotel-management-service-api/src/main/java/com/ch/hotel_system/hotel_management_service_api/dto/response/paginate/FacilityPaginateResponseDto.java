package com.ch.hotel_system.hotel_management_service_api.dto.response.paginate;

import com.ch.hotel_system.hotel_management_service_api.dto.response.ResponseFacilityDto;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class FacilityPaginateResponseDto {
    private List<ResponseFacilityDto> dataList;
    private Long dataCount;
}
