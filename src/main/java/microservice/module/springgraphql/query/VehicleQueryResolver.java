package microservice.module.springgraphql.query;

import microservice.module.springgraphql.dao.entity.Vehicle;
import microservice.module.springgraphql.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class VehicleQueryResolver {

    @Autowired
    private VehicleService vehicleService;

    @QueryMapping
    public List<Vehicle> getVehicles(@Argument final int count) {
        return this.vehicleService.getAllVehicles(count);
    }

    @QueryMapping
    public Optional<Vehicle> getVehicle(@Argument final int id) {
        return this.vehicleService.getVehicleById(id);
    }
}
