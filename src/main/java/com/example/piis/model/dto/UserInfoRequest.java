package com.example.piis.model.dto;
import com.example.piis.model.enums.Gender;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserInfoRequest {
String email;
String firstName;
Integer age;
Gender gender;
}
