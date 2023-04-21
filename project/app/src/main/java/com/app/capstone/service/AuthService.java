package com.app.capstone.service;

import com.app.capstone.payload.LoginDto;
import com.app.capstone.payload.RegisterDto;

public interface AuthService {
    
	String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
    
}
