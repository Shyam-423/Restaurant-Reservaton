package com.restaurant.model;

import jakarta.persistence.*;

@Entity
@Table(name = "restaurant_tables")
public class RestaurantTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long table_id;

    private String table_name;
    private int capacity;

    // Getters and Setters
    public Long getTable_id() { return table_id; }
    public void setTable_id(Long table_id) { this.table_id = table_id; }

    public String getTable_name() { return table_name; }
    public void setTable_name(String table_name) { this.table_name = table_name; }

    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }
}
