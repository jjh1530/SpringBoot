package kr.bit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.bit.entity.BootBoard;

@Repository									//CRUD Method 
public interface BootBoardRepository extends JpaRepository<BootBoard, Long>{ // <테이블 이름 클래스, pk(idx0의 타입>
	
	
	

	
}
