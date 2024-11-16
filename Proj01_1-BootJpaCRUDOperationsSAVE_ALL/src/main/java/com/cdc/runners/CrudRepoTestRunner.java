package com.cdc.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cdc.entity.Doctor;
import com.cdc.service.IDoctorService;

@Component
public class CrudRepoTestRunner implements CommandLineRunner {

	@Autowired
	private IDoctorService doctorService;

	@Override
	public void run(String... args) throws Exception {

		try {
			Doctor doctor = new Doctor();
			doctor.setDocName("Kumar");
			doctor.setDocIncome(9900.00);
			doctor.setDocSpecialization("Entemology");
			String resultMsg = doctorService.registerDoctor(doctor);
			System.out.println(resultMsg);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
