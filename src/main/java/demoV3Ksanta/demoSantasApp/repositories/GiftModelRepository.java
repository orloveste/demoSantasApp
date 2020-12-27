package demoV3Ksanta.demoSantasApp.repositories;

import demoV3Ksanta.demoSantasApp.models.GiftModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GiftModelRepository extends JpaRepository<GiftModel, Integer> {
}
