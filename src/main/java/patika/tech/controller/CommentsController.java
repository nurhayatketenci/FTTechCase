package patika.tech.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import patika.tech.model.Comment;
import patika.tech.service.CommentService;
import patika.tech.service.UserService;

@RestController
@RequestMapping("/api/comments")
public class CommentsController {
	
private CommentService commentService;
	
	@Autowired
	public CommentsController(CommentService commentService) {
		super();
		this.commentService = commentService;
	}
	 @GetMapping("/getByProductId")
	 public ResponseEntity<?> getByProduct(@RequestParam("productId") int productId){
	 return ResponseEntity.ok(this.commentService.getByProduct(productId));
	 }
	 
	 @GetMapping("/getByUserComments")
	 public ResponseEntity<?> getByUserComments(@RequestParam("userId") int userId){
	 return ResponseEntity.ok(this.commentService.getByUserComments(userId));
	 }
	 
	 @GetMapping("/getbyproductidcommentdate")
	 public ResponseEntity<?> getByProductCommentDate(@RequestParam("productId") int productId,LocalDate start,LocalDate end){
		 return ResponseEntity.ok(this.commentService.findByProductIdAndCommentDateBetween(productId, start, end));
	 }
	 @GetMapping("/getbyuseridcommentdate")
	 public ResponseEntity<?> getByUserCommentDate(@RequestParam("userId") int userId,LocalDate start,LocalDate end){
		 return ResponseEntity.ok(this.commentService.findByUserIdAndCommentDateBetween(userId, start, end));
	 }
}
