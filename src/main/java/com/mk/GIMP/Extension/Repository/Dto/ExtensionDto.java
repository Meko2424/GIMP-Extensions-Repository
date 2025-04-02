package com.mk.GIMP.Extension.Repository.Dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.mk.GIMP.Extension.Repository.Entity.Author;
import com.mk.GIMP.Extension.Repository.Entity.Category;
import com.mk.GIMP.Extension.Repository.Entity.Version;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
public class ExtensionDto {

    private Long extensionId;
    private String title;
    private String description;
    private String imageUrl;
    private AuthorDto author;
    private CategoryDto category;
    private List<VersionDto> versions;
}
