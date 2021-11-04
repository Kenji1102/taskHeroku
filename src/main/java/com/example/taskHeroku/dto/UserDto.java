package com.example.taskHeroku.dto;

import com.example.taskHeroku.entity.Role;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    @ApiModelProperty(value = "id", example = "1")
    private Long id;
    @ApiModelProperty(value = "username", example = "Admin")
    private String username;
    @ApiModelProperty(value = "Email", example = "Thangphph09792@fpt.edu.vn")
    private String email;
    @ApiModelProperty(value = "role", example = "admin")
    private Set<Role> roles;
}
