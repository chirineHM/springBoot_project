package tn.esprit.springent;

import jakarta.persistence.*;
import java.util.Date;
@Entity
@Table(name = "Reservation")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idres")
    private Long idres;

    @Column(name = "anneeuni")
    private Date anneeuni;
    @Column(name = "estvalide")
    private Boolean estvalide;

}
