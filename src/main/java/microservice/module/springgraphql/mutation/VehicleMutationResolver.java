package microservice.module.springgraphql.mutation;

import microservice.module.springgraphql.dao.entity.Vehicle;
import microservice.module.springgraphql.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@Controller
public class VehicleMutationResolver {

    @Autowired
    private VehicleService vehicleService;

    @MutationMapping
    public Vehicle createVehicle(
            @Argument final String type,
            @Argument final String modelCode,
            @Argument final String brandName,
            @Argument final String launchDate
    ){
        return this.vehicleService.createVehicle(type, modelCode, brandName, launchDate);
    }
}
