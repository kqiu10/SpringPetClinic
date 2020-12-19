package guru.springframework.spring_pet_clinic.model;
/**
 * Date: 12/18/20
 * Question Description
 */

import java.io.Serializable;

/**
 * Description: TODO
 * Time complexity:O();
 * Space complexity: O();

 */
public class BaseEntity implements Serializable {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
