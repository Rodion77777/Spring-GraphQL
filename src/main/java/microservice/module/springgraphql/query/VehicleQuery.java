package microservice.module.springgraphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import microservice.module.springgraphql.dao.entity.Vehicle;
import microservice.module.springgraphql.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class VehicleQuery implements GraphQLQueryResolver {

    @Autowired
    private VehicleService vehicleService;

    public List<Vehicle> getVehicles(final int count) {
        return this.vehicleService.getAllVehicles(count);
    }

    public Optional<Vehicle> getVehicle(final int id) {
        return this.vehicleService.getVehicleById(id);
    }
}
