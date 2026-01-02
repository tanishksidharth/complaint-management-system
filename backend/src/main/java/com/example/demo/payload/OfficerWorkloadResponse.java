<<<<<<< HEAD
package com.example.demo.payload;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OfficerWorkloadResponse {
    private Long id;
    private String name;
    private String email;
    private String department;
    private long activeComplaints;
    private String status; // AVAILABLE, BUSY, OVERLOADED
}
=======
package com.example.demo.payload;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OfficerWorkloadResponse {
    private Long id;
    private String name;
    private String email;
    private String department;
    private long activeComplaints;
    private String status; // AVAILABLE, BUSY, OVERLOADED
}
>>>>>>> 93052c3527979bbe0994a8181da42a63e265a230
