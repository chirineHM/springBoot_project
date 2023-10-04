package tn.esprit.springent;

import jakarta.persistence.*;


@Entity
@Table(name = "Chambre")
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idchambre")
    private Long idchambre;

    @Column(name = "numchambre")
    private long nomBloc;


    @Column(name = "typeC")
    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;
    public enum TypeChambre
    {
    Simple,Double,Triple
    }
}
