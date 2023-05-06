package eg.espace.ecommerce.models;

import lombok.Data;

import javax.persistence.*;

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
