package eg.espace.ecommerce.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Data;

/**
 * Product model.
 */
@Data
@Entity
public class Product {
  @Id
  @GeneratedValue
  Long id;

  @Column(nullable = false)
  private String name;

  private String description;

  private double price = 0L;

  @ManyToOne
  private Category category;
}
