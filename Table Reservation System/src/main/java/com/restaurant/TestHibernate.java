package com.restaurant;

import com.restaurant.dao.ReservationDAO;
import com.restaurant.model.Customer;
import com.restaurant.model.Reservation;
import com.restaurant.model.RestaurantTable;
import com.restaurant.model.Slot;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.time.LocalDateTime;

public class TestHibernate {

    public static void main(String[] args) {

        // 1️⃣ Build Hibernate SessionFactory
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Customer.class);
        cfg.addAnnotatedClass(RestaurantTable.class);
        cfg.addAnnotatedClass(Slot.class);
        cfg.addAnnotatedClass(Reservation.class);
        SessionFactory sessionFactory = cfg.buildSessionFactory();

        System.out.println("✅ Hibernate SessionFactory created!");

        // 2️⃣ Create sample Customer
        Customer customer = new Customer();
        customer.setName("John Doe");
        customer.setPhone("9876543210");
        customer.setEmail("john@example.com");

        // 3️⃣ Create sample Table
        RestaurantTable table = new RestaurantTable();
        table.setTable_name("Table A");
        table.setCapacity(4);

        // 4️⃣ Create sample Slot
        Slot slot = new Slot();
        slot.setSlot_start(LocalDateTime.of(2025, 10, 20, 19, 0));
        slot.setSlot_end(LocalDateTime.of(2025, 10, 20, 21, 0));
        slot.setLabel("Evening Slot");

        // 5️⃣ Create Reservation and set linked objects
        Reservation reservation = new Reservation();
        reservation.setCustomer(customer);
        reservation.setTable(table);
        reservation.setSlot(slot);
        reservation.setParty_size(4);
        reservation.setStatus("Confirmed");

        // 6️⃣ Save Reservation (cascade will save Customer, Table, Slot automatically)
        ReservationDAO dao = new ReservationDAO(sessionFactory);
        dao.saveReservation(reservation);

        // 7️⃣ Close SessionFactory
        sessionFactory.close();
    }
}
