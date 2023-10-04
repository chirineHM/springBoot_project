package tn.esprit.springent;

import jakarta.persistence.*;


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
    }