package eg.espace.ecommerce.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

/**
 * Category model.
 */
@Data
@Entity
public class Category {
  @Id
  @GeneratedValue
  Long id;

  @Column(nullable = false)
  private String name;
}
