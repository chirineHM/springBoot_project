package tn.esprit.springent;

import jakarta.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
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

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "etu_res",
            joinColumns = @JoinColumn(name = "idres"),
            inverseJoinColumns = @JoinColumn(name = "idEtudiant"))
      private Set<Etudiant> etudiants = new HashSet<>();





    @ManyToOne
    @JoinTable(name = "chambre_res",
            joinColumns = @JoinColumn(name = "idres"),
            inverseJoinColumns = @JoinColumn(name = "chambre_id"))


    private Chambre chambre;
}
