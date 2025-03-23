package com.ljio.winnerownner_webserver.controller;

import com.ljio.winnerownner_webserver.dto.RoomRequestDTO;
import com.ljio.winnerownner_webserver.entity.RoomInfo;
import com.ljio.winnerownner_webserver.service.RoomInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/roomInfo")
public class RoomInfoController {
    private final RoomInfoService roomInfoService;

    // 룸 리스트 조회

    // 룸 상세정보 조회
    @GetMapping("/{id}")
    public ResponseEntity<RoomInfo> getRoomInfo(@PathVariable("id") Long id){
        RoomInfo result = roomInfoService.getRoomInfo(id);

        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    // 룸 정보 생성
    @PostMapping("/create")
    public ResponseEntity<String> postRoomInfo(@RequestBody RoomRequestDTO request){
        roomInfoService.postRoomInfo(request.getName());

        return ResponseEntity.status(HttpStatus.OK).body("룸 정보가 성공적으로 생성되었습니다.");
    }

    // 룸 정보 수정 put

    // 룸 정보 수정 patch

    // 룸 정보 삭제
}
