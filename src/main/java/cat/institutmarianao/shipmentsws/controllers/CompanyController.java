package cat.institutmarianao.shipmentsws.controllers;

import cat.institutmarianao.shipmentsws.model.Company;
import cat.institutmarianao.shipmentsws.services.CompanyService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.constraints.Positive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Companies", description = "CompanyController API")
@RestController
@RequestMapping("/companies")
@Validated
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @Operation(summary = "Find all companies")
    @ApiResponse(responseCode = "200", content = {
            @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Company.class)))}, description = "Companies retrieved ok")

    @GetMapping(value = "/find/all")
    public List<Company> findAll() {
        return companyService.findAll();
    }

    @Operation(summary = "Get company by id")
    @ApiResponse(responseCode = "200", content = {
            @Content(mediaType = "application/json", schema = @Schema(implementation = Company.class))}, description = "Company retrieved ok")
    @ApiResponse(responseCode = "404", content = {
            @Content(mediaType = "application/json")}, description = "Company not found")

    @GetMapping("/get/by/id/{id}")
    public Company getById(@PathVariable("id") @Positive Long id) {
        return companyService.getById(id);
    }
}
