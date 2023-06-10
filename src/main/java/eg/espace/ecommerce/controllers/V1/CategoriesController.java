package eg.espace.ecommerce.controllers.V1;

import eg.espace.ecommerce.controllers.ApiController;
import eg.espace.ecommerce.models.Category;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Categories controller.
 */
@RestController
@RequestMapping("/api/v1/categories")
public class CategoriesController extends ApiController {
  /**
   * Creates a new category.
   *
   * @param category The category to create.
   * @return The created category.
   */
  @ResponseStatus(HttpStatus.CREATED)
  @PostMapping
  public Category createCategory(@Valid @RequestBody final Category category) {
    return category;
  }
}
