package patika.tech.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import patika.tech.model.Comment;
import patika.tech.model.Product;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
   List<Comment> getByProduct_Id(int productId);
   List<Comment> getByUser_Id(int userId);
   List<Comment> findByProduct_IdAndCommentDateBetween(int productId, LocalDate start, LocalDate end);
   List<Comment> findByUser_IdAndCommentDateBetween(int userId, LocalDate start, LocalDate end);


   
}
