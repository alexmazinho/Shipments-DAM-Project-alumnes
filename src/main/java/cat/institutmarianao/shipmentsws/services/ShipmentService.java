package cat.institutmarianao.shipmentsws.services;

import cat.institutmarianao.shipmentsws.model.Shipment;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public interface ShipmentService {

    List<Shipment> findAll(String fullName);

    Shipment getByUsername(@NotBlank String username);

    Shipment save(@NotNull @Valid Shipment user);

    Shipment update(@NotNull @Valid Shipment user);

    void deleteByUsername(@NotBlank String username);
}
