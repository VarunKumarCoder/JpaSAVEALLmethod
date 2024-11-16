package com.cdc.runners;

import java.util.List;

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

		/*		try {
					Doctor doctor = new Doctor();
					doctor.setDocName("Kumar");
					doctor.setDocIncome(9900.00);
					doctor.setDocSpecialization("Entemology");
					String resultMsg = doctorService.registerDoctor(doctor);
					System.out.println(resultMsg);
				} catch (Exception e) {
					e.printStackTrace();
				}*/

		Doctor doc1 = new Doctor();
		doc1.setDocName("Meda");
		doc1.setDocIncome(100000.00);
		doc1.setDocSpecialization("Hemotology");
		Doctor doc2 = new Doctor();
		doc2.setDocIncome(20000.00);
		doc2.setDocName("Rajesh");
		doc2.setDocSpecialization("Neurology");
		Doctor doc3 = new Doctor();
		doc3.setDocIncome(30000.00);
		doc3.setDocName("antony");
		doc3.setDocSpecialization("RMP");
		String msg = doctorService.registerGroupOfDoctors(List.of(doc1, doc2, doc3));
		System.out.println(msg);
	}
}
