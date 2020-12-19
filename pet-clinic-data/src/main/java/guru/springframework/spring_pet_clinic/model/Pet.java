package guru.springframework.spring_pet_clinic.model;
/**
 * Date: 12/17/20
 * Question Description
 */

import java.time.LocalDate;

/**
 * Description: TODO
 * Time complexity:O();
 * Space complexity: O();

 */
public class Pet extends BaseEntity{
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
