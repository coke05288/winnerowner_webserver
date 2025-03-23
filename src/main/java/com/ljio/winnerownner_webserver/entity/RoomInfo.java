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
    private Long ID;

    @Column(name = "RoomSettingID")
    private String RoomSettingID;

    @Column(name = "HostID")
    private String HostID;

    @Column(name = "Name")
    private String Name;

    @Column(name = "PlayerCount")
    private int PlayerCount;

    @Column(name = "LimitCount")
    private int LimitCount;

    @Column(name = "Description")
    private String Description;

    @Column(name = "IsPublic")
    private boolean IsPublic;

    @Column(name = "Password")
    private String Password;

    @Column(name = "Status")
    private String Status;

    @Column(name = "CreatedAt")
    @CreationTimestamp
    private LocalDateTime CreatedAt;
}
