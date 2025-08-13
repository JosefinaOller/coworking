package com.mobydigital.coworking.controller;

import com.mobydigital.coworking.model.Reservation;
import com.mobydigital.coworking.service.IReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservas")
public class ReservationController {

    @Autowired
    private IReservationService resService;

    @PostMapping
    public String createReservation(@RequestBody Reservation reservation){ //VALIDAR!!!
        resService.saveReservation(reservation);
        return "La reserva fue creada correctamente";
    }

    @GetMapping
    public List<Reservation> getReservations(){
        return resService.getReservations();
    }

    @GetMapping("/usuario/{id}")
    public Reservation findReservation (@PathVariable Long id){ //Esta mal, la idea es mostrar las reservas de un usuario
        return resService.findReservation(id);
    }

    @DeleteMapping("/{id}")
    public String deleteReservation(@PathVariable Long id){ //ADMIN O USUARIO
        resService.deleteReservation(id);
        return "La reserva fue cancelada correctamente";
    }


}
