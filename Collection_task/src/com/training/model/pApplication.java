package com.training.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.training.Doctor;
import com.training.Patient;

public class pApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient patients1 = new Patient(101,"revathy","cuddalore",8248250826L);
		Patient patients2 = new Patient(102,"geetha","chennai",6878624669L);
		Patient patients3 = new Patient(103,"jagan","kanniyakumari",9047802680L);
		
		HashSet<Patient> patients = new HashSet<>();
		patients.add(patients1);
		patients.add(patients2);
		patients.add(patients3);
		Doctor selva = new Doctor(901,"selva","neurologist",patients);
		System.out.println("doctor:"+selva.getDoctorName());
//		for( Patient eachPatient:selva.getPatients()) {
//			System.out.println(eachPatient);
//			
//		}
		Patient patients4 = new Patient(105,"barani","coimbatore",8248250826L);
		Patient patients5 = new Patient(106,"moni","palani",6878624669L);
		Patient patients6 = new Patient(107,"viji","ariyalur",9047802680L);
		
		HashSet<Patient> patientsdetails = new HashSet<>();
		patientsdetails.add(patients4);
		patientsdetails.add(patients5);
		patientsdetails.add(patients6);

		
		
		Doctor revathy = new Doctor(403, "revathy"," cardiologist",patientsdetails);
		System.out.println("doctor:"+revathy.getDoctorName());
		
		Map<Doctor,Set<Patient>> map = new HashMap<>();
		
		map.put(revathy, patientsdetails);
		map.put(selva, patients);
		Appointment   app = new Appointment(map); 
		System.out.println(app.getPatients(revathy));
		

	}

}
