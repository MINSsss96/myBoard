package com.my.board.api.exception;

import com.my.board.dto.CommentDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
// RestController 에서 사용하는 AOP 입니다.
public class AopExceptionController {
    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<ApiResponse> badRequestError(
            BadRequestException e
    ){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(ApiResponse.builder()
                        .message(e.getMessage())
                        .build());
    }

    // 2. 댓글 생성 API
    //  /api/articles/{articleId}/comments
    @PostMapping(" /api/articles/{articleId}/comments")
    public ResponseEntity<?> commentCreate(
            @PathVariable("articleId") Long articleId,
            @ResponseBody CommentDto dto
            ){
        commentservice.

    }
}
