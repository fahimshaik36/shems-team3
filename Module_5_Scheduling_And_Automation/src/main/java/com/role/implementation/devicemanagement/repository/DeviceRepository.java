package com.role.implementation.devicemanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.role.implementation.devicemanagement.model.Device;
import com.role.implementation.model.User;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Long> {

    // 🔹 Get all devices of a user
    List<Device> findByUser(User user);

    // 🔹 REQUIRED for safe user delete (removes all devices of that user)
    void deleteByUser(User user);

    // 🔹 Count devices of a user
    long countByUser(User user);

    // 🔹 Count active/inactive devices system-wide
    long countByStatus(boolean status);

    // 🔹 Count active/inactive devices for a specific user
    long countByUserAndStatus(User user, boolean status);
}
