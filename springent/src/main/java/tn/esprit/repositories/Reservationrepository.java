package tn.esprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springent.Reservation;

public interface Reservationrepository extends JpaRepository<Reservation, Long> {
}
