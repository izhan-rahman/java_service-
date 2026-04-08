package com.integration.general.usecases.auth;


import com.integration.general.helpers.common.token.ClaimsSet;
import com.integration.general.helpers.utils.CryptoAlgoUtil;
import com.integration.general.helpers.utils.JwtUtil;
import com.integration.general.persistence.models.UserInfo;
import com.integration.general.usecases.auth.dao.AuthRequestDao;
import com.integration.general.usecases.auth.dao.AuthTokensDao;
import com.integration.general.usecases.auth.dao.LoginRequestDao;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AuthService implements UserDetailsService {

    @Autowired
    AuthRepository authRepository;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtUtil jwtTokenUtil;

    @Value("${spring.crypto.key-path}")
    private String pathName;

    public AuthService() {
    }

    //used in Jwtrequestfilter
    @Override
    public UserDetails loadUserByUsername(String empUserName) throws UsernameNotFoundException {
        UserInfo userDao = authRepository.findByUserId(empUserName);
        if (userDao == null) {
            throw new BadCredentialsException("Username wrong");
        }
        return new User(userDao.getUserId(), userDao.getPassword(),
                new ArrayList<>());
    }

    public AuthTokensDao createNewTokens(AuthRequestDao authenticationRequest) throws Exception {
        AuthTokensDao authResponseDao;
        UserInfo userDao;
        CryptoAlgoUtil cryptoAlgoUtil = new CryptoAlgoUtil(pathName);
        String userName = authenticationRequest.getUsername();
        String password = cryptoAlgoUtil.encrypt(authenticationRequest.getPassword());

        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                    userName, password));
        } catch (BadCredentialsException e) {
            throw new BadCredentialsException("Password Wrong");
        } catch (Exception e) {
            throw new Exception("USERNAME");
        }

        userDao = authRepository.findByUserId(userName);
       // String baseCurrency = companyService.getBaseCurrency(userDao.getDept());
        Map<String, Object> claims = ClaimsSet.setClaimsDetails(userDao,"INR");
        String accessToken = jwtTokenUtil.generateAccessToken(userDao, claims);
        String refreshToken = jwtTokenUtil.generateRefreshToken(userDao.getUserId(), claims);
        authResponseDao = new AuthTokensDao(accessToken, refreshToken);

        return authResponseDao;
    }

    public Map<String, String> createAccessToken(AuthTokensDao authTokens) throws Exception {
        Map<String, String> accessToken = new HashMap<>();
        try {
            String userName = jwtTokenUtil.getUsernameFromToken(authTokens.getRefreshToken());
            final Claims claims = jwtTokenUtil.getAllClaimsFromToken(authTokens.getRefreshToken());
            accessToken.put("accessToken", jwtTokenUtil.generateAccessToken(userName, claims));

        } catch (ExpiredJwtException e) {
            throw new Exception("Token Expired ,Pls re-login");
        } catch (Exception e) {
            throw new Exception("invalid auth token");
        }
        return accessToken;
    }

    public boolean checkaccess(LoginRequestDao loginRequestDao) throws Exception {
        boolean logincheck = false;
        CryptoAlgoUtil cryptoAlgoUtil = new CryptoAlgoUtil(pathName);
        String userName = loginRequestDao.getEmail();
        String password = cryptoAlgoUtil.encrypt(loginRequestDao.getPassword());

        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                    userName, password));
            logincheck = true;
        } catch (BadCredentialsException e) {
            throw new BadCredentialsException("Password Wrong");
        } catch (Exception e) {
            throw new Exception("USERNAME");
        }
        return logincheck;
    }

    public String generateAccessToken(LoginRequestDao loginRequestDao) throws Exception {
        AuthTokensDao authResponseDao;
        UserInfo userInfo;
        CryptoAlgoUtil cryptoAlgoUtil = new CryptoAlgoUtil(pathName);
        String userName = loginRequestDao.getEmail();
        String password = cryptoAlgoUtil.encrypt(loginRequestDao.getPassword());

        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                    userName, password));
        } catch (BadCredentialsException e) {
            throw new BadCredentialsException("Password Wrong");
        } catch (Exception e) {
            throw new Exception("USERNAME");
        }

        userInfo = authRepository.findByUserIdAndDept(userName,loginRequestDao.getPlant());
       // String baseCurrency = companyService.getBaseCurrency(userInfo.getDept());
        Map<String, Object> claims = ClaimsSet.setClaimsDetails(userInfo, "INR");

        return jwtTokenUtil.generateAccessToken(userInfo, claims);
    }

    public UserInfo getUserInfo(String userId) throws Exception {
        UserInfo userInfo;
        try {
            userInfo = authRepository.findByUserId(userId);
        } catch (Exception e) {
            throw new Exception(e);
        }
        return userInfo;
    }

    public UserInfo findByUserIdAndDept(String userId,String plant) throws Exception {
        UserInfo userInfo;
        try {
            userInfo = authRepository.findByUserIdAndDept(userId,plant);
        } catch (Exception e) {
            throw new Exception(e);
        }
        return userInfo;
    }

    public List<UserInfo> findByUserIdList(String userId) throws Exception {
        List<UserInfo> userInfo;
        try {
            userInfo = authRepository.findByUserIdList(userId);
        } catch (Exception e) {
            throw new Exception(e);
        }
        return userInfo;
    }




}
