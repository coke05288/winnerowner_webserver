package com.ljio.winnerownner_webserver.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "RoomInfo")
@Data
public class RoomInfo {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "RoomSettingID")
    private String roomSettingID;

    @Column(name = "HostID")
    private String hostID;

    @Column(name = "SessionID")
    private String sessionID;

    @Column(name = "Name")
    private String name;

    @Column(name = "PlayerCount")
    private int playerCount;

    @Column(name = "LimitCount")
    private int limitCount;

    @Column(name = "Description")
    private String description;

    @Column(name = "IsPublic")
    private boolean isPublic;

    @Column(name = "Password")
    private String password;

    @Column(name = "Status")
    private String status;

    @Column(name = "CreatedAt")
    @CreationTimestamp
    private LocalDateTime createdAt;
}
