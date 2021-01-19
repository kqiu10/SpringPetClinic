package guru.springframework.spring_pet_clinic.services.map;
/**
 * Date: 1/19/21
 * Question Description
 */

import guru.springframework.spring_pet_clinic.model.Owner;
import guru.springframework.spring_pet_clinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Description: TODO
 * Time complexity:O();
 * Space complexity: O();

 */
@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
