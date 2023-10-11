package tn.esprit.springent;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "Bloc")
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idBloc")
    private Long idBloc;

    @Column(name = "nomBloc")
    private String nomBloc;
    @Column(name = "capaciteBloc")
    private Long capaciteBloc;
    @OneToMany(mappedBy = "bloc", cascade = CascadeType.ALL)
    private List <Chambre> chambres;
    @ManyToOne
    @JoinColumn(name = "foyer_id")
    private Foyer foyer;


}