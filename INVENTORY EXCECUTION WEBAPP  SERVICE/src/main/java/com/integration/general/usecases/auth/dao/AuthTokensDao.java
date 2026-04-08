package com.integration.general.usecases.auth.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class AuthTokensDao {
	private  String accessToken;
	private  String refreshToken;
}
