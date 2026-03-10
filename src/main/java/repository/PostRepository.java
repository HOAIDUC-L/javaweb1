package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.EipMPost;

@Repository
public interface PostRepository extends JpaRepository<EipMPost, Integer> {
}