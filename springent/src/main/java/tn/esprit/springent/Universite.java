package tn.esprit.springent;

import jakarta.persistence.*;

@Entity
@Table(name = "universite")
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iduni")
    private Long iduni;

    @Column(name = "nomuni")
    private String nomuni;
    @Column(name = "adresse")
    private String adresse;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "foyer_id")
    private Foyer foyer;
}