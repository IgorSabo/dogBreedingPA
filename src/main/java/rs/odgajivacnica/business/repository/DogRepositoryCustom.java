package rs.odgajivacnica.business.repository;

import rs.odgajivacnica.model.entities.Dog;

import java.util.List;

/**
 * Created by Gile on 8/5/2017.
 */

public interface DogRepositoryCustom {

    List<Dog> getResults(String type, int perPage, int page);


}
