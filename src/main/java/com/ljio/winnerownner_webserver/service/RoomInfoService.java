package com.ljio.winnerownner_webserver.service;

import com.ljio.winnerownner_webserver.entity.RoomInfo;
import com.ljio.winnerownner_webserver.repository.RoomInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RoomInfoService{
    private final   RoomInfoRepository roomInfoRepository;

    //// RoomInfo CRUD
    //// Get / Post / Put / Delete
    // 룸 리스트 조회
    public List<RoomInfo> getRoomInfoList(){
        List<RoomInfo> roomList = roomInfoRepository.findAll();

        return roomList;
    }

    // 룸 상세 정보 조회
    public RoomInfo getRoomInfo(Long id){
        return roomInfoRepository.findById(id).orElseThrow(() -> new RuntimeException("해당 ID의 룸 정보를 찾을 수 없습니다."));
    }

    // 룸 정보 생성
    public void postRoomInfo(String name){
        RoomInfo roomInfo = new RoomInfo();

        roomInfo.setName(name);

        roomInfoRepository.save(roomInfo);
    }

    // 룸 정보 수정 put
    public void putRoomInfo(){

    }

    // 룸 정보 수정 patch
    public void patchRoomInfo(){

    }

    // 룸 정보 삭제
    public void deleteRoomInfo(){

    }
}
