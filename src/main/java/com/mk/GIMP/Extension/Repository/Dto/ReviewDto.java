package com.mk.GIMP.Extension.Repository.Dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.mk.GIMP.Extension.Repository.Entity.Extension;
import com.mk.GIMP.Extension.Repository.Entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
public class ReviewDto {

    private Long reviewId;
    private Long rating;
    private String comment;
    private LocalDate reviewDate;
    private UserDto user;
    private ExtensionDto extension;
}
