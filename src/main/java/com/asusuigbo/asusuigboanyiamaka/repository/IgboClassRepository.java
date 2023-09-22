package com.asusuigbo.asusuigboanyiamaka.repository;

import com.asusuigbo.asusuigboanyiamaka.model.IgboClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IgboClassRepository extends JpaRepository<IgboClass, Integer> {

    List<IgboClass> findAll = null;

}
