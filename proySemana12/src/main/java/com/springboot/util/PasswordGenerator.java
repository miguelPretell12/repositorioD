package com.springboot.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {
	
	public static void main(String[] args) {
		BCryptPasswordEncoder bcpe = new BCryptPasswordEncoder();
		
		System.out.println(bcpe.encode("admin"));
		System.out.println(bcpe.encode("supervisor"));
		System.out.println(bcpe.encode("123456"));
		System.out.println(bcpe.encode("4589"));
	}
}

/*
$2a$10$bDwBgI9izQFSoRuN5AjCaefsn8T3PQdLQLkagS.yDi3qH8Gw2kaBO
$2a$10$ij/ttwvdFpDBJvoEXlPEnurX4YrOOdpSI532r3b4AAbq4syQZz1sO
$2a$10$vWvIyI.QjWWwnnJsQIZHheyKO6Kov0ZWaTpVK2xnQfd9PlzugBG.K
$2a$10$ZwpurfIG5MVr99/hFnLXiO7dUVpzGQCBEf60LWPn59HWBw.Asmqaa
 * */
