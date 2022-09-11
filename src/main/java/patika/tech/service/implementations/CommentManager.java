package patika.tech.service.implementations;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import patika.tech.model.Comment;
import patika.tech.repository.CommentRepository;
import patika.tech.service.CommentService;
@Service
public class CommentManager implements CommentService{
	
    private CommentRepository commentRepository;
    @Autowired
    public CommentManager(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }
    
	@Override
	public List<Comment> getByProduct(int productId) {
		return this.commentRepository.getByProduct_Id(productId);
	}

	@Override
	public List<Comment> getByUserComments(int userId) {
		return this.commentRepository.getByUser_Id(userId);
	}

	@Override
	public List<Comment> findByProductIdAndCommentDateBetween(int productId, LocalDate start, LocalDate end) {
		return this.commentRepository.findByProduct_IdAndCommentDateBetween(productId, start, end);
	}

	@Override
	public List<Comment> findByUserIdAndCommentDateBetween(int userId, LocalDate start, LocalDate end) {
		return this.commentRepository.findByUser_IdAndCommentDateBetween(userId, start, end);
	}


}
