package com.ssafy.tink.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import com.ssafy.tink.db.entity.Comment;
import com.ssafy.tink.db.entity.Material;
import com.ssafy.tink.db.entity.Member;
import com.ssafy.tink.db.entity.Thumbnail;
import com.ssafy.tink.db.repository.CommentInfoInterface;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
// @AllArgsConstructor
public class QnaGroupInfoDto {

	private int boardId;
	@ApiModelProperty(dataType = "String", example = "초보자 질문",required = true)
	private String title;
	@ApiModelProperty(dataType = "String", example = "겉뜨기 초보자 튜토리얼 도움되나요?",required = true)
	private String content;

	private String createdDate;
	private String updatedDate;

	private int liked;
	private int hit;

	@ApiModelProperty(dataType = "String", example = "question")
	private String boardCategory;

	// 글 작성자 관련 정보
	private String nickname;
	private String thumbnail;

	private int commentCnt;
	private List<CommentInfoInterface> comments;

	// 로그인한 사용자의 팔로우유무  (boolean)
	private boolean isFollowed;

	// 로그인한 사용자의 좋아요유무  (boolean)
	private boolean isLiked;

	public void setBoardCategory(String boardCategory) {
		this.boardCategory = boardCategory;
	}

	@Builder
	public QnaGroupInfoDto(int boardId, String title,String content,
		String createdDate, String updatedDate,
		int liked, int hit, String boardCategory,
		String nickname, String thumbnail, int commentCnt, List<CommentInfoInterface> comments,
		boolean isFollowed, boolean isLiked ){

		this.boardId = boardId;
		this.title = title;
		this.content = content;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.liked = liked;
		this.hit = hit;
		this.nickname = nickname;
		this.thumbnail= thumbnail;
		this.boardCategory = boardCategory;
		this.commentCnt = commentCnt;
		this.comments = comments;
		this.isFollowed = isFollowed;
		this.isLiked = isLiked;
	}
}
