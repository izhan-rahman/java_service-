package com.integration.general.usecases.item_mst;

import com.integration.general.persistence.models.ItemMst;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PosItemMstService {
	@Autowired
	POSItemMstDao posItemMstDao;
	public String checkItemMstPk(String plant, String item) throws Exception {
		try {
			ItemMst getVal = posItemMstDao.findByItem(plant, item);
			if(getVal == null)
				return "1";
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		return "0";
	}

	public ItemMst getItemMstPk(String plant, String item) throws Exception {
		ItemMst getVal;
		try {
			getVal = posItemMstDao.findByItem(plant, item);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		return getVal;
	}

	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public String setItemMstDetails(String plant, ItemMst val) throws Exception {
		try {
			posItemMstDao.save(plant, val);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		return "1";
	}

	public Boolean checkItemMstNonStock(String plant,String item) throws Exception {
		ItemMst getVal;
		try {
			getVal = posItemMstDao.findByItem(plant, item);
			if (getVal == null)
				return true;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		return getVal.getNonStackFlag().equals("Y");
	}

	public String getAvgCost(String plant, String item, String pk1) throws Exception {
		String getVal;
		try {
			getVal = posItemMstDao.getAvgCostOfItem(plant, item);
			String p = posItemMstDao.getItemPurchaseQpuom(plant, item);
			String s = posItemMstDao.getItemSalesQpuom(plant, item);
			double val = (Double.valueOf(getVal)/Double.valueOf(p))*Double.valueOf(s);
			getVal = String.valueOf(val);
			if (getVal == null)
				return "0";
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		return getVal;
	}

	public int getSalesPriceCodition(String plant,String item) throws Exception {
		int getVal;
		try {
			getVal = posItemMstDao.getSalesPriceCodition(plant, item);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		return getVal;
	}

	public String getListPriceOfItem(String plant, String item) throws Exception {
		String getVal;
		try {
			getVal = posItemMstDao.getListPriceOfItem(plant, item);
			if (getVal == null)
				return "0";
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		return getVal;
	}

	public String getorderPricOfItem(String plant, String item) throws Exception {
		String getVal;
		try {
			getVal = posItemMstDao.getorderPricOfItem(plant, item);
			if (getVal == null)
				return "0";
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		return getVal;
	}

	public String getItemPurchaseQpuom(String plant, String item) throws Exception {
		String getVal;
		try {
			getVal = posItemMstDao.getItemPurchaseQpuom(plant, item);
			if (getVal == null)
				return "0";
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		return getVal;
	}

	public String getItemSalesQpuom(String plant, String item) throws Exception {
		String getVal;
		try {
			getVal = posItemMstDao.getItemSalesQpuom(plant, item);
			if (getVal == null)
				return "0";
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		return getVal;
	}
}
