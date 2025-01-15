package com.example.ecommerce.entity;

import com.example.ecommerce.constant.db.DbConstant.DbProfile;
import jakarta.persistence.*;
import lombok.*;

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = DbProfile.TABLE_NAME)
//@Table(name = "file_upload")
//@Component
//@ConfigurationProperties(prefix = "file")
public class Profile extends AuditInfo {

    @Column(name = DbProfile.IMAGE_URL)
    private String imageUrl;

//    @Column(name = DbConstant.DbProfile.IMAGE_FILE)
//    private File image;

    @Lob
//    @Column(name = DbConstant.DbProfile.IMAGE_FILE)
//    private byte[] imageFile;
    private byte[] file;

//    @Column(name = "upload_dir")
//    private String uploadDir;

    @OneToOne(
            mappedBy = "profile",
            cascade = CascadeType.ALL
    )
    private User user;
}

