package eg.espace.ecommerce.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import lombok.Data;

/**
 * Category model.
 */
@Data
@Entity
@Table(name = "categories", indexes = @Index(columnList = "name"))
public class Category {
  @Id
  @GeneratedValue
  Long id;

  @Column(nullable = false, unique = true)
  private String name;
}
