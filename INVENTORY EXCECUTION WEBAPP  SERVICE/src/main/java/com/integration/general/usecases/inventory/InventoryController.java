package com.integration.general.usecases.inventory;

import com.integration.general.helpers.common.results.ResultsDao;
import com.integration.general.helpers.common.token.ClaimsDao;
import com.integration.general.helpers.common.token.ClaimsSet;
import com.integration.general.usecases.inventory.pojo.InventoryPojo;
import com.integration.general.usecases.inventory.pojo.itemInventoryPojo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("${spring.base.path}")
public class InventoryController {
    @Autowired
    InventoryService inventoryService;
    @Autowired
    ClaimsSet claimsSet;

        @GetMapping("/get-location-all")
    public ResponseEntity<?> getLocation(HttpServletRequest request) throws Exception {
        ClaimsDao claimsDao = claimsSet.getClaimsDetailsAfterSet(request.getHeader("Authorization"));
       /* String locations = request.getHeader("location");*/
        List<InventoryPojo>  location = inventoryService.getLocation(claimsDao.getPlt());
        return  new ResponseEntity<>(location, HttpStatus.OK);
    }

    @GetMapping("/inventory/get-item-summary")
    public ResponseEntity<?> getInventorySummary(HttpServletRequest request,@RequestParam(required=true) String item,@RequestParam(required=true) String plant)
            throws Exception {
        ClaimsDao claimsDao = claimsSet.getClaimsDetailsAfterSet(request.getHeader("Authorization"));
        List<itemInventoryPojo> inventorySummaryPojo = new ArrayList<itemInventoryPojo>();
        inventorySummaryPojo= inventoryService.getInvSummarybyItem(item,plant);
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setAmbiguityIgnored(true);
        List<inventorySummary> inventorySummarylist = modelMapper.map(inventorySummaryPojo,new TypeToken<List<inventorySummary>>() { }.getType());
        //result
        ResultsDao resultsDao = new ResultsDao();
        resultsDao.setResults(inventorySummarylist);
        resultsDao.setPageNumber(1);
        resultsDao.setPageSize(inventorySummarylist.size());
        if (inventorySummarylist.size()>0){
            resultsDao.setMessage("DATA FOUND");
        }else{
            resultsDao.setMessage("NO DETAILS FOUND");
        }
        return new ResponseEntity<>(resultsDao, HttpStatus.OK);
    }
}

