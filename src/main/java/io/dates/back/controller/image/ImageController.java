package io.dates.back.controller.image;

import io.dates.back.model.error.NotFoundException;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@RestController
@RequestMapping(path = "/assets/images")
public class ImageController {
    private static final String basePath = "E:/test_img/";

    @GetMapping(path = "/{picUrl}")
    public ResponseEntity<Resource> getImage(@PathVariable String picUrl) throws IOException {
        var imgFile = new File(basePath + picUrl);

        if (!imgFile.exists() || imgFile.isDirectory()) {
            throw new NotFoundException("Image not found.");
        }

        InputStreamResource resource = new InputStreamResource(new FileInputStream(imgFile));

        return ResponseEntity.ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(resource);
    }
}
