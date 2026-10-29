package com.example.basics;

public class BasicsJavaSeven {
	
	// Spring security --> insert its dependency in pom.xml -> 
	
	// 1. login form based authentication -> username and pswd 
	// session made on server and cookie registered on browser, since session is made -> its an overhead
	
	// 2. basic authentication --> we keep sending basic authentication header in the request --> we send base 64 encoded username and pswd 
	// no expiration time, no user details
	
	// 3. jwt --> JSON web token, has 3 things -> 1. header (algorithm, type), 2. payload (subject, name), 
	// 3. signature (base 64 encoded header, base 64 encoded payload, 512 bit secret)
	// it has expiration time also for a token
	// first we call api of /authenticate by post request to get a token and then we use this token further for rest of the APIs

	// authentication (user id + pswd, biometrics, MFA) vs authorization (right access they have or not)  
	
	
	
	
}
