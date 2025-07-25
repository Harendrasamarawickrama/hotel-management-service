package com.ch.hotel_system.hotel_management_service_api.dto.response.paginate;

import com.ch.hotel_system.hotel_management_service_api.dto.response.ResponseRoomDto;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class RoomPaginateResponseDto {
    private List<ResponseRoomDto> dataList;
    private Long dataCount;
}
