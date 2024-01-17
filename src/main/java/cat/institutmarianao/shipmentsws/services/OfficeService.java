package cat.institutmarianao.shipmentsws.services;

import cat.institutmarianao.shipmentsws.model.Office;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public interface OfficeService {

    List<Office> findAll(String fullName);

    Office getByUsername(@NotBlank String username);

    Office save(@NotNull @Valid Office user);

    Office update(@NotNull @Valid Office user);

    void deleteByUsername(@NotBlank String username);
}
