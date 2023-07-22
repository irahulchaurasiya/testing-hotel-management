package com.hotel.hotelManagement.repo;

import com.hotel.hotelManagement.model.HotelRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRoomRepository extends JpaRepository<HotelRoom, Long> {

    boolean existsByRoomNo(Integer roomNo);
}
