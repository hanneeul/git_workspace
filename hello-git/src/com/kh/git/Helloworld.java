package com.kh.git;

import com.kh.animal.Cat;
import com.kh.animal.Dog;
import com.kh.animal.Snake;

/**
 * SCM Software Configuration Management
 * - 코드추적(버전관리)이에 build, packaging, deploy등 프로젝트관련 프로세스를 관리
 * 
 * VCS Version Control System
 * - 프로젝트 작성/수정/보완에 따른 변경내역을 버전을 관리
 *
 * 버젼관리 프로그램
 * - server-client : 중앙저장소를 공유한 각각의 클라이언트에서 저장소의 일부만 가져와서 작업후, 중앙저장소에 반영 
 *		- subversion
 * - 분산형		   : 참여하는 각각의 클라이언트에서 전체저장소에 대한 복제본을 가지고 작업.
 *		- git
 */
public class Helloworld {

	public static void main(String[] args) {
		System.out.println("Hello world!");
		
		Dog dog = new Dog();
		dog.bark();
		
		Cat cat = new Cat();
		cat.cry();
	
		Snake snake = new Snake();
		snake.move();
	}
}
