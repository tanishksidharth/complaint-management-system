<<<<<<< HEAD
package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "map_location")
public class MapLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double latitude;
    private Double longitude;

    private Long citizenId;
    private Long complaintId;
}
=======
package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "map_location")
public class MapLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double latitude;
    private Double longitude;

    private Long citizenId;
    private Long complaintId;
}
>>>>>>> 93052c3527979bbe0994a8181da42a63e265a230
