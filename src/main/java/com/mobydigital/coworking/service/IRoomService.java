package com.mobydigital.coworking.service;

import com.mobydigital.coworking.model.Room;
import java.util.List;

public interface IRoomService {

    public void saveRoom(Room room);

    public List<Room> getRooms();

    public Room findRoom(Long id);

    public void deleteRoom(Long id);

    public void editRoom(Room room);
}
