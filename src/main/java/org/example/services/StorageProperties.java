package org.example.services;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("store")
public class StorageProperties {
    private String location="uploading";
}