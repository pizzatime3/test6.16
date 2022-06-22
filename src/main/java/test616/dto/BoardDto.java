package test616.dto;

import lombok.*;
import test616.domain.board.BoardEntity;

import javax.persistence.Column;

@Getter@Setter@ToString
@AllArgsConstructor@NoArgsConstructor
@Builder
public class BoardDto {

    private int bno;
    private String btitle;
    private String bcontent;
    private String bwrite;
    private String bpassword;

    public BoardEntity toentity(){
        return BoardEntity.builder()
                .bno(this.bno)
                .btitle(this.btitle)
                .bcontent(this.bcontent)
                .bwrite(this.bwrite)
                .bpassword(this.bpassword)
                .build();

    }

}
