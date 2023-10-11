package tn.esprit.springent;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "Chambre")
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idchambre")
    private Long idchambre;

    @Column(name = "numchambre")
    private long nomBloc;
    @ManyToOne
    @JoinColumn(name = "idbloc")
    private Bloc bloc ;

    @OneToMany(mappedBy = "chambre", cascade = CascadeType.ALL)
    private List <Reservation> reservations;
    @Column(name = "typeC")
    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;



    public enum TypeChambre
    {
    Simple,Double,Triple
    }
}
