package rs.odgajivacnica.service;

import rs.odgajivacnica.model.entities.Dog;
import rs.odgajivacnica.model.entities.Puppy;

import java.util.List;

/**
 * Created by Gile on 8/2/2017.
 */
public interface DogService {

    Dog findById(Long id);

    List<Dog> getResults(String type, int perPage, int page);

    //public List<Puppy> findPuppies
}
