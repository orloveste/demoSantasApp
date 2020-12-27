package demoV3Ksanta.demoSantasApp.repositories;

import demoV3Ksanta.demoSantasApp.models.GiftMake;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GiftMakeRepository extends JpaRepository<GiftMake, Integer> {
}
