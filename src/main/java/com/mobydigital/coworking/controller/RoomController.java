package com.mobydigital.coworking.controller;

import com.mobydigital.coworking.model.Room;
import com.mobydigital.coworking.repository.IRoomRepository;
import com.mobydigital.coworking.service.IRoomService;
import com.mobydigital.coworking.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salas")
public class RoomController {

    @Autowired
    private IRoomService roomService;

    @PostMapping
    public String createRoom(@RequestBody Room room){ //SOLO ADMIN
        roomService.saveRoom(room);
        return "La sala fue creada correctamente";
    }

    @GetMapping
    public List<Room> getRooms(){
        return roomService.getRooms();
    }

    @PutMapping("/{id}")
    public String editRoom(@PathVariable Long id){
        return "La sala fue modificada correctamente";
    }

    @DeleteMapping("/{id}")
    public String deleteRoom(@PathVariable Long id){
        return "La sala fue deshabilitada correctamente";
    }

}
