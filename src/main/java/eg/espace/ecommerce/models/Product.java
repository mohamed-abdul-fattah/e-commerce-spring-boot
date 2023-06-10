package eg.espace.ecommerce.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * Product model.
 */
@Data
@Entity
public class Product {
  private static final int NAME_LENGTH = 255;

  @Id
  @GeneratedValue
  Long id;

  @Column(nullable = false)
  @NotNull
  @Max(NAME_LENGTH)
  private String name;

  private String description;

  @NotNull
  private double price = 0.0F;

  @ManyToOne
  @NotNull
  private Category category;
}
