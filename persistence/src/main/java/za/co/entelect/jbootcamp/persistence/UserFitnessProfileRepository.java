package za.co.entelect.jbootcamp.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.entelect.jbootcamp.domain.UserFitnessProfile;

public interface UserFitnessProfileRepository extends JpaRepository<UserFitnessProfile, Integer> {
}
