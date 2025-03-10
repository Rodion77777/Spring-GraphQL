package microservice.module.springgraphql.dao.repository;

import microservice.module.springgraphql.dao.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
