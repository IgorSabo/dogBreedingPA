package rs.odgajivacnica.presentation.controllers;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.google.common.io.Files;
import rs.odgajivacnica.model.entities.Dog;
import rs.odgajivacnica.service.DogService;

import java.io.File;

/**
 * Created by Gile on 8/3/2017.
 */
@Controller
public class DogController {

    @Value("${dogs.images.location}")
    String dogImagesLocation;

    @Autowired
    private DogService dogService;

    @RequestMapping(value = "/getMainImage/{dogId}", method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<byte[]> getImageFile(@PathVariable Long dogId) {
        final HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        Dog dog = dogService.findById(dogId);

        File in = new File(dogImagesLocation+"/"+dogId+"/"+dog.getMainImageName());
        byte[] array = null;
        try{
            array = Files.toByteArray(in);
        }
        catch(Exception e){
            e.printStackTrace();
        }

        return new ResponseEntity<byte[]>(array, headers, HttpStatus.CREATED);
    }

    /*@RequestMapping(value = "/getResults/{pageNum}", method = RequestMethod.GET)
    public String getResults(Model model){

    }*/

}
