package com.example.piis.model.dto;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import com.example.piis.model.dto.UserInfoRequest;
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserInfoResponse extends UserInfoRequest{
    Long id;

}
