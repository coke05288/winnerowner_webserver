package com.ljio.winnerownner_webserver.repository;

import com.ljio.winnerownner_webserver.entity.RoomInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomInfoRepository extends JpaRepository<RoomInfo, Long> {
}
