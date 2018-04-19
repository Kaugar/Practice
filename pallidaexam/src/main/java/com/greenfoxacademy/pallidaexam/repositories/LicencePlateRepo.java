package com.greenfoxacademy.pallidaexam.repositories;

import com.greenfoxacademy.pallidaexam.models.Licence_plates;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LicencePlateRepo extends CrudRepository<Licence_plates, String> {
  List<Licence_plates> findByPlateIgnoreCaseContaining(String query);
  List<Licence_plates> findByPlateStartingWith(String query);
  List<Licence_plates> findByColor (String brand);
  List<Licence_plates> findByCarBrand(String brand);
  /*
  @Query(value = "SELECT * FROM licence_plates l WHERE l.plate LIKE LOWER(CONCAT('%',:searchedPlate, '%'))", nativeQuery = true)
  List<LicencePlate> findLicencePlate(@Param("searchedPlate") String searchedPlate);
  @Query(value = "SELECT * FROM licence_plates l WHERE l.plate LIKE 'RB%'", nativeQuery = true)
  List<LicencePlate> findPoliceCars();
  @Query(value = "SELECT * FROM licence_plates l WHERE l.plate LIKE 'DT%'", nativeQuery = true)
  List<LicencePlate> findDiplomatCars();
  @Query(value = "SELECT * FROM licence_plates l WHERE l.car_brand LIKE :carBrand", nativeQuery = true)
  List<LicencePlate> findByCarBrand(@Param("carBrand") String carBrand);
  */

}
