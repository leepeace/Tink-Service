package com.ssafy.tink.dto;

import java.util.List;

import io.swagger.annotations.ApiModel;

@ApiModel("PatternDTO")
public class PatternDTO {

	int patternId;//pk
	String parentCategory;//부모 카테고리
	List<String> category;//도안 카테고리

	Float gauge;//게이지 코수
	int gaugeDivisor;//게이지 크기
	String guagePattern;//게이지 패턴
	Float rowGauge;//게이지 단 수

	String patternName;//도안 이름
	String notes_html;//도안 설명

}
