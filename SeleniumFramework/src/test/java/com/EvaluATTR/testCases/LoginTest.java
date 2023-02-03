package com.EvaluATTR.testCases;


import org.testng.annotations.Test;

import com.EvaluATTR.TestExecution.KeywordEngine;

public class LoginTest {
	
	public KeywordEngine KeyWordEngine;
	
	@Test
	public void loginTest() {
		
		KeyWordEngine = new KeywordEngine();
		KeyWordEngine.startExecution("login");
		
		
	}
	
	

}
