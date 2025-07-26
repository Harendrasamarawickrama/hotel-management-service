package com.ch.hotel_system.hotel_management_service_api.dto.request;

import lombok.*;
import org.springframework.web.multipart.MultipartRequest;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class RequestRoomlmageDto {
    private String roomId;
    private MultipartRequest file;
}
