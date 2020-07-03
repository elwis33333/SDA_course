package zaj18_04_Patterns.strategy.option;


import zaj18_04_Patterns.strategy.domain.Knight;

public interface KnightValidator{
	
	boolean validate(Knight knight);
	
}