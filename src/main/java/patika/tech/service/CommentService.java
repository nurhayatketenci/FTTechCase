package patika.tech.service;

import java.time.LocalDate;
import java.util.List;

import patika.tech.model.Comment;

public interface CommentService {
   List<Comment> getByProduct(int productId);
   List<Comment> getByUserComments(int userId);
   List<Comment> findByProductIdAndCommentDateBetween(int productId, LocalDate start, LocalDate end);
   List<Comment> findByUserIdAndCommentDateBetween(int userId, LocalDate start, LocalDate end);

}
