package next.school.comparacaoimagem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import next.school.comparacaoimagem.entity.ImageData;

public interface ImageDataRepository extends JpaRepository<ImageData, Long>{

    Optional<ImageData> findByName(String name);
    
}
