<<<<<<< HEAD
package com.example.demo.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OfficerLoginRequest {

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String password;
}
=======
package com.example.demo.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OfficerLoginRequest {

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String password;
}
>>>>>>> 93052c3527979bbe0994a8181da42a63e265a230
