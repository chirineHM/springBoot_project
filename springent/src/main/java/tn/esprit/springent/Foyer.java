package tn.esprit.springent;

import jakarta.persistence.*;

import java.util.List;


@Entity
    @Table(name = "foyer")
    public class Foyer {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "idfoyer")
        private Long idfoyer;

    @Column(name = "nomFoyer")
        private String nomFoyer;
    @Column(name = "capaciteFoyer")
    private Long capaciteFoyer;
    @OneToOne(mappedBy = "foyer")
    private Universite universite;
    @OneToMany(mappedBy = "foyer", cascade = CascadeType.ALL)
    private List <Bloc> blocs ;
}


