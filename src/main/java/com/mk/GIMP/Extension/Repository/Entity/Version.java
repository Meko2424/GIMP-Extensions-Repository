package com.mk.GIMP.Extension.Repository.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "versions")
@Entity
public class Version {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "version_id")
    private Long versionId;
    private String versionNumber;
    @Column(name = "upload_date")
    private LocalDate uploadDate = LocalDate.now();
    private String downloadUrl;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "extension_id")
    private Extension extension;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "user_id")
//    private User user;

//    @ManyToOne
//    @JoinColumn(name = "download_id")
//    private Download download;
}
