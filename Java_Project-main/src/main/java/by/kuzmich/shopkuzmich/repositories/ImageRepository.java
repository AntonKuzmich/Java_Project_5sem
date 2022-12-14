package by.kuzmich.shopkuzmich.repositories;

import by.kuzmich.shopkuzmich.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
