package service.impl;

import dao.impl.PatientDaoImpl;
import generic.GenericService;
import model.Patient;
import service.PatientService;

import java.util.List;
import java.util.Map;

public class PatientServiceImpl implements PatientService, GenericService<Patient> {
    PatientDaoImpl patientDao = new PatientDaoImpl();

    @Override
    public Patient add(Long hospitalId, Patient patient) {
        return patientDao.add(hospitalId, patient);
    }

    @Override
    public void removeById(Long id) {
        patientDao.removeById(id);
    }

    @Override
    public String upDateById(Long id, Patient patient) {
        return patientDao.upDateById(id, patient);
    }

    @Override
    public String addPatientsToHospital(Long id, List<Patient> patients) {
        return patientDao.addPatientsToHospital(id, patients);
    }

    @Override
    public Patient getPatientById(Long id) {
        return patientDao.getPatientById(id);
    }

    @Override
    public Map<Integer, Patient> getPatientByAge(int age) {
        return patientDao.getPatientByAge(age);
    }

    @Override
    public List<Patient> sortPatientsByAge(String ascOrDesc) {
        return patientDao.sortPatientsByAge(ascOrDesc);
    }
}
