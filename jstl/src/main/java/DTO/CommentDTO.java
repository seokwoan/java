package DTO;

import java.time.LocalDate;

import lombok.Data;

//@Setter
//@Getter
//@ToString
@Data // @Data로 데이터저장 클래스에 필요한 method를 전부 만들어줌 / 매개변수가 있는 생성자 method는 없음
public class CommentDTO {

	private int commentId;
	private int boardId;
	private String writer;
	private String comment;
	private LocalDate writeDate;
	
	public static CommentDTO of( int cid , int bid , String writer , String comment , LocalDate date ) {
		CommentDTO dto = new CommentDTO();
		dto.commentId = cid;
		dto.boardId = bid;
		dto.writer = writer;
		dto.comment = comment;
		dto.writeDate = date;
		return dto;
	}
	
}




















