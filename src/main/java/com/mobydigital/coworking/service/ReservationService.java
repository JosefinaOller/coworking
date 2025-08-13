package com.mobydigital.coworking.service;

import com.mobydigital.coworking.model.Reservation;
import com.mobydigital.coworking.repository.IReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService implements IReservationService {

    @Autowired
    private IReservationRepository resRepository;

    @Override
    public void saveReservation(Reservation reservation) {
        resRepository.save(reservation);
    }

    @Override
    public List<Reservation> getReservations() {
        return resRepository.findAll();
    }

    @Override
    public Reservation findReservation(Long id) {
        return resRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteReservation(Long id) {
        resRepository.deleteById(id);
    }

    @Override
    public void editReservation(Reservation reservation) {
        resRepository.save(reservation);
    }
}
