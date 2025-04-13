package com.ljio.winnerownner_webserver.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoomRequestDTO {

    private Long id;
    private String roomSettingID;
    private String hostID;
    private String sessionID;
    private String name;
    private int limitCount;
    private String description;
    private boolean isPublic;
    private String password;
    private String status;
}