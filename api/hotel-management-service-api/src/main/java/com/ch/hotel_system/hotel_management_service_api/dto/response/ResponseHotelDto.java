package com.ch.hotel_system.hotel_management_service_api.dto.response;


import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ResponseHotelDto {
    private String hotelId;
    private Boolean activeStatus;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String description;
    private String hotelName;
    private int starRating;
    private BigDecimal startingFrom;

    //send all rooms
    private List<ResponseBranchDto>branches;
}
