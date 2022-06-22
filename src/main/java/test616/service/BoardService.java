package test616.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test616.domain.board.BoardRepository;
import test616.dto.BoardDto;

import javax.transaction.Transactional;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    //1. C[인수 : 게시물 dto]
    @Transactional
    public boolean save(BoardDto boardDto){

    }

}
