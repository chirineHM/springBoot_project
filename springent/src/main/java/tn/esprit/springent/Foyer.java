package tn.esprit.springent;

import jakarta.persistence.*;


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

}


