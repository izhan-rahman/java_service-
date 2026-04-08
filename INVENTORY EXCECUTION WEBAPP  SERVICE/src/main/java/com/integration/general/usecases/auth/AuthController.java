package com.integration.general.usecases.auth;


import com.integration.general.helpers.common.results.ResultPlantListDao;
import com.integration.general.helpers.common.results.plantList;
import com.integration.general.persistence.models.PlantMst;
import com.integration.general.persistence.models.UserInfo;
import com.integration.general.usecases.auth.dao.*;
/*import com.integration.general.usecases.company.CompanyService;
import com.integration.general.usecases.employee_master.EmployeeMasterService;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("${spring.base.path}")
public class AuthController {
	@Autowired
	private AuthService authService;
	/*@Autowired
	private CompanyService companyService;
	@Autowired
	EmployeeMasterService employeeMasterService;*/

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity<AuthTokensDao> createNewTokens(@RequestBody AuthRequestDao authenticationRequest) throws Exception {
		return ResponseEntity.ok(authService.createNewTokens(authenticationRequest));
	}

	@RequestMapping(value = "/refresh", method = RequestMethod.POST)
	public ResponseEntity<?> createAccessToken(@RequestBody AuthTokensDao authRefresh) throws Exception {
		return ResponseEntity.ok(authService.createAccessToken(authRefresh));
	}

	@PostMapping("/auth/login")
	public ResponseEntity<?> loginValidation(@RequestBody LoginRequestDao loginRequestDao) throws Exception {
		boolean status = authService.checkaccess(loginRequestDao);

		LoginResponseDao loginResponseDao = new LoginResponseDao();
		loginResponseDao.setStatus(true);

		ResultPlantListDao result = new ResultPlantListDao();
		result.setLoginstatus(status);
		List<UserInfo> userInfoList = authService.findByUserIdList(loginRequestDao.getEmail());
		List<plantList> plantlist = new ArrayList<plantList>();
		for(UserInfo userinfo : userInfoList){
			plantList plantcode = new plantList();
			plantcode.setPlant(userinfo.getDept());
			plantlist.add(plantcode);
		}
		result.setPlantlist(plantlist);
		loginResponseDao.setResult(result);

		return new ResponseEntity<>(result, HttpStatus.OK);
	}

	@PostMapping("/auth/selectplant")
	public ResponseEntity<?> loginValidationplant(@RequestBody LoginRequestDao loginRequestDao) throws Exception {
		String token = authService.generateAccessToken(loginRequestDao);
		Result result = new Result();
		result.setToken(token);
		result.setUser_id(loginRequestDao.getEmail());
		result.setPlant(loginRequestDao.getPlant());

		return new ResponseEntity<>(result, HttpStatus.OK);
	}

}
