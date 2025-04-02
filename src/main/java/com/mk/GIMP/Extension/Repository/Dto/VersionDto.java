package com.mk.GIMP.Extension.Repository.Dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
public class VersionDto {

    private Long versionId;
    private String versionNumber;
    private LocalDate uploadDate;
    private String downloadUrl;
    private ExtensionDto extension;
}
