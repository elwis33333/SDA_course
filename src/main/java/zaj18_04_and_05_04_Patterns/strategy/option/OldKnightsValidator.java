package zaj18_04_and_05_04_Patterns.strategy.option;


import zaj18_04_and_05_04_Patterns.strategy.domain.Knight;

public class OldKnightsValidator implements KnightValidator{
	
	public boolean validate(Knight knight){
		
		return knight.getAge()>60;
	}
	
}