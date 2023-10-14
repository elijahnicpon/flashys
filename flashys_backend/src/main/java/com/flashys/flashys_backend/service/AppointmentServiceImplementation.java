package com.flashys.flashys_backend.service;

import com.flashys.flashys_backend.model.Appointment;
import com.flashys.flashys_backend.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Comparator;


@Service
public class AppointmentServiceImplementation implements AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Autowired
    public void AppointmentServiceImpl(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    @Override
    public List<Appointment> getAcceptedAppointmentsByUserIdSortByStart_Time(String userId) {
        List<String> userIdList = Collections.singletonList(userId);
        List<Appointment> appointments = appointmentRepository.findAllById(userIdList);
        for (Appointment appointment : appointments) {
            if (appointment.isAccepted()) {
                appointments.remove(appointment);
            }
        }

        Comparator<Appointment> appointmentComparator = new Comparator<>() {
            public int compare(Appointment appointment1, Appointment appointment2) {
                return appointment1.getStartTime().compareTo(appointment2.getStartTime());
            }
        };

        Collections.sort(appointments, appointmentComparator);
        return appointments;
    }

    @Override
    public List<Appointment> getPendingAppointmentsByArtistIdSortByStart_Time(String artistId) {
        List<String> artistIdList = Collections.singletonList(artistId);
        List<Appointment> appointments = appointmentRepository.findAllById(artistIdList);
        for (Appointment appointment : appointments) {
            if (!appointment.isAccepted()) {
                appointments.remove(appointment);
            }
        }

        Comparator<Appointment> appointmentComparator = new Comparator<>() {
            public int compare(Appointment appointment1, Appointment appointment2) {
                return appointment1.getStartTime().compareTo(appointment2.getStartTime());
            }
        };

        Collections.sort(appointments, appointmentComparator);
        return appointments;
    }
    @Override
    public Appointment getAppointmentById(String appointmentId) {
        return appointmentRepository.findById(appointmentId).orElse(null);
    }

    @Override
    public Appointment createAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    @Override
    public void deleteAppointment(String appointmentId) {
        appointmentRepository.deleteById(appointmentId);
    }
}
