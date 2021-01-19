package guru.springframework.spring_pet_clinic.services.map;
/**
 * Date: 1/19/21
 * Question Description
 */

import guru.springframework.spring_pet_clinic.model.Pet;
import guru.springframework.spring_pet_clinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Description: TODO
 * Time complexity:O();
 * Space complexity: O();

 */
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
