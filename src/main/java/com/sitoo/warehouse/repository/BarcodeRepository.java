package com.sitoo.warehouse.repository;

import com.sitoo.warehouse.models.Barcode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BarcodeRepository extends JpaRepository<Barcode,Long>, CrudRepository<Barcode,Long> {
    Barcode findByBarcode(String barcode);
}
