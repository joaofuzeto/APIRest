package br.com.clinic.api.doctor;

import br.com.clinic.api.address.AddressData;

public record DoctorsData(String name, String email, String crm, Speciality speciality, AddressData address) {

}
