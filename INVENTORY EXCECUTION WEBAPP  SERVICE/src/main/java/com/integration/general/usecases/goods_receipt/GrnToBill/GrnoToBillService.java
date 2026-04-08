package com.integration.general.usecases.goods_receipt.GrnToBill;

import com.integration.general.persistence.models.FinGrnotoBill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GrnoToBillService {
    @Autowired
    GrnoToBillRepository grnoToBillRepository;

    public String setfinGrnotoBill(FinGrnotoBill val) throws Exception {
        try {
            grnoToBillRepository.save(val);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return "1";
    }

    public FinGrnotoBill getgrNoPk(String pk0) throws Exception {
        FinGrnotoBill getVal;
        try {
            getVal = grnoToBillRepository.findBygrNo(pk0);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return getVal;
    }

}
