package org.wolf.healthcare.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;



public class Appointment implements Serializable{
	
	
	private int id;
	private LocalDate appointmentDate;
	private AppointmentStatus approvalStatus;  
	private Set<DiagnosticTest> diagnosticTests; 
	private Patient patient;
	private DiagnosticCenter diagnosticCenter;
	private Set<TestResult> testResult;
	
}