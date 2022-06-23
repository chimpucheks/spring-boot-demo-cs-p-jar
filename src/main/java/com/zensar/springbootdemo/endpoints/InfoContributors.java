package com.zensar.springbootdemo.endpoints;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;

public class InfoContributors implements InfoContributor {

	@Override
	public void contribute(Builder builder) {
		
		Map<String, Object> studentDetails = new HashMap<String,Object>();
		studentDetails.put("CreatedBy", "Vinodkumar");
		studentDetails.put("Modified","July22nd2022");
		builder.withDetail("Student", studentDetails);

		
	}

}
