package rs.odgajivacnica.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.odgajivacnica.business.repository.DogRepository;
import rs.odgajivacnica.model.entities.Dog;
import rs.odgajivacnica.service.DogService;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Gile on 8/2/2017.
 */
@Service("dogService")
@Transactional
public class DogServiceImpl implements DogService {

    @Autowired
    DogRepository dogRepository;

    @Override
    public Dog findById(Long id) {
        return dogRepository.findOne(id);
    }

    @Override
    public List<Dog> getResults(String type, int perPage, int page) {
        return dogRepository.getResults(type, perPage, page);
    }


}
