package tn.esprit.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springent.Chambre;
@Repository
public interface Chambrerepository extends JpaRepository<Chambre, Long>
{
}
