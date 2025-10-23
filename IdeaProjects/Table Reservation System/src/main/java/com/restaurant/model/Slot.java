package com.restaurant.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "slots")
public class Slot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long slot_id;

    private LocalDateTime slot_start;
    private LocalDateTime slot_end;
    private String label;

    // Getters and Setters
    public Long getSlot_id() { return slot_id; }
    public void setSlot_id(Long slot_id) { this.slot_id = slot_id; }

    public LocalDateTime getSlot_start() { return slot_start; }
    public void setSlot_start(LocalDateTime slot_start) { this.slot_start = slot_start; }

    public LocalDateTime getSlot_end() { return slot_end; }
    public void setSlot_end(LocalDateTime slot_end) { this.slot_end = slot_end; }

    public String getLabel() { return label; }
    public void setLabel(String label) { this.label = label; }
}
