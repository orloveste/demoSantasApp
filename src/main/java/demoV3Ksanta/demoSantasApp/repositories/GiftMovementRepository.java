package demoV3Ksanta.demoSantasApp.repositories;

import demoV3Ksanta.demoSantasApp.models.GiftMovement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GiftMovementRepository extends JpaRepository<GiftMovement, Integer> {
}
