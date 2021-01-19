package guru.springframework.spring_pet_clinic.services.map;
/**
 * Date: 1/19/21
 * Question Description
 */

import guru.springframework.spring_pet_clinic.model.Vet;
import guru.springframework.spring_pet_clinic.services.CrudService;

import java.util.Set;

/**
 * Description: TODO
 * Time complexity:O();
 * Space complexity: O();

 */
public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
