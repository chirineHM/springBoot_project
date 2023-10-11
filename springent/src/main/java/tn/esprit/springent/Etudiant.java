package tn.esprit.springent;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Etudiant")
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEtudiant")
    private Long idEtudiant;

    @Column(name = "nomet")
    private String nomet;
    @Column(name = "prenomet")
    private String prenomet;
    @Column(name = "cin")
    private Long cin;
    @Column(name = "ecole")
    private String ecole;

    @Column(name = "datenais")
    private LocalDateTime  datenais;
    @ManyToMany(mappedBy = "etudiants")
    private Set <Reservation> reserv = new HashSet<>();

}