package demoV3Ksanta.demoSantasApp.repositories;

import demoV3Ksanta.demoSantasApp.models.Gift;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GiftRepository extends JpaRepository<Gift, Integer> {
}
