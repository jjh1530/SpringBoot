package kr.bit.service;

import java.util.List;

import kr.bit.entity.BootBoard;

public interface BootBoardService {

	public List<BootBoard> getList(); // 전체 리스트
	
	public void register(BootBoard vo); //글 등록
	
	public BootBoard get(Long idx);
	
	public void delete(Long idx);
	
	public void update(BootBoard vo);
}
