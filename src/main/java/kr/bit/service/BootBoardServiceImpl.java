package kr.bit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.bit.entity.BootBoard;
import kr.bit.repository.BootBoardRepository;

@Service
public class BootBoardServiceImpl implements BootBoardService {

	@Autowired
	BootBoardRepository bootBoardRepository;
	
	@Override
	public List<BootBoard> getList() {
		List<BootBoard> list = bootBoardRepository.findAll();
		return list;
	}
	
	@Override
	public void register(BootBoard vo) {
		bootBoardRepository.save(vo);
	}
	
	@Override
	public BootBoard get(Long idx) {
		Optional<BootBoard> vo =  bootBoardRepository.findById(idx);
		return vo.get();
	}
	
	@Override
	public void delete(Long idx) {
		bootBoardRepository.deleteById(idx);
		
	}
	
	@Override
	public void update(BootBoard vo) {
		bootBoardRepository.save(vo); // insert idx가 없으면 수정
	}
}


