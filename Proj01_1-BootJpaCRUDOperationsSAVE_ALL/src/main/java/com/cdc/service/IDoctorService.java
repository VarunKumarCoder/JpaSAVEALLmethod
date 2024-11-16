package com.cdc.service;

import com.cdc.entity.Doctor;

public interface IDoctorService {
	public String registerDoctor(Doctor doctor);

	public String registerGroupOfDoctors(Iterable<Doctor> doctors);

}
