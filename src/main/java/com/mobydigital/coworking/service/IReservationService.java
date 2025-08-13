package com.mobydigital.coworking.service;

import com.mobydigital.coworking.model.Reservation;

import java.util.List;

public interface IReservationService {

    public void saveReservation(Reservation reservation);

    public List<Reservation> getReservations();

    public Reservation findReservation(Long id);

    public void deleteReservation(Long id);

    public void editReservation(Reservation reservation);
}
