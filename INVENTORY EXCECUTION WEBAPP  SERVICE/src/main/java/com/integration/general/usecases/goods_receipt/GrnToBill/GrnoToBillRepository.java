package com.integration.general.usecases.goods_receipt.GrnToBill;

import com.integration.general.persistence.models.FinGrnotoBill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrnoToBillRepository extends JpaRepository<FinGrnotoBill, Integer> {
    FinGrnotoBill findBygrNo(String pk0);

}
